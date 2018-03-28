/*
 * Copyright (C) 2017 Sylvain Leroy - BYOSkill Company All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the MIT license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the MIT license with
 * this file. If not, please write to: sleroy at byoskill.com, or visit : www.byoskill.com
 *
 */
package com.byoskill.trainings.cleancode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;

/**
 * The Class PersonStatisticProgram is a program that analysis the extract from
 * our CRM to compute interesting statistics of our customers.
 */
public class PersonStatisticProgram {

    public static class Person {
	String name;
	int    age;
	String sex;
	String address;
	String company;
	int    height;
	int    weight;

    }

    /**
     * The Statistics expected from the program.
     */
    public static class Stats {

	public long	nWomen;
	public double[]	distAge;
	public double	avgWei;
	public double	avgHei;

	@Override
	public String toString() {
	    final StringBuilder builder = new StringBuilder();
	    builder.append("Stats ["
		    + "\n Number of women=");
	    builder.append(nWomen);
	    builder.append("\n Distribution of age in percentile=");
	    for (int i = 0; i < distAge.length; ++i) {
		builder.append("<").append(i * 10 + 1).append(" = ").append(String.format("%3.2f%%", distAge[i]))
			.append("\n");
	    }

	    builder.append("\n Mean weight in kg=");
	    builder.append(avgWei);
	    builder.append("\n Average weight in meter=");
	    builder.append(avgHei);
	    builder.append("]");
	    return builder.toString();
	}
    }

    /** The Constant NOM_RESOURCE_CSV. */
    private static final String NOM_RESOURCE_CSV = "example.csv";

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    @SuppressWarnings("nls")
    public static void main(final String[] args) throws IOException {
	final InputStream ressource = Thread.currentThread().getContextClassLoader()
		.getResourceAsStream(NOM_RESOURCE_CSV);

	try (
		final Reader reader = new BufferedReader(new InputStreamReader(
			ressource));
		final CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
			.withFirstRecordAsHeader()
			.withIgnoreHeaderCase()
			.withTrim());) {

	    final Stats stats = new Stats();

	    final List<Person> persons = csvParser.getRecords().stream().map(cr -> {
		final Person person = new Person();
		person.name = cr.get("First Name and Last Name");
		person.age = Integer.parseInt(cr.get("Age"));
		person.sex = cr.get("Sex");
		person.height = Integer.parseInt(cr.get("Height"));
		person.weight = Integer.parseInt(cr.get("Weight"));
		person.address = cr.get("Address");
		person.company = cr.get("Company");
		return person;
	    }).collect(Collectors.toList());

	    stats.nWomen = persons.stream().filter(p -> p.sex.equals("FEMALE")).count();

	    final Mean mean = new Mean();
	    persons.stream().forEach(p -> mean.increment(p.weight));
	    stats.avgWei = mean.getResult();

	    final Mean mean2 = new Mean();
	    persons.stream().forEach(p -> mean2.increment(p.height / 100.0));
	    stats.avgHei = mean2.getResult();

	    final int[] ages = persons.stream().mapToInt(p -> p.age).toArray();
	    final Percentile percentile = new Percentile();
	    percentile.setData(Arrays.stream(ages).asDoubleStream().toArray());

	    stats.distAge = new double[10];
	    for (int i = 0; i < 10; ++i) {
		stats.distAge[i] = percentile.evaluate(1 + i * 10);
	    }

	    System.out.println(stats);

	}
    }

}
