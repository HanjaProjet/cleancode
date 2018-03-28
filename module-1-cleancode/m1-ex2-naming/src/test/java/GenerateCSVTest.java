
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
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.Test;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

public class GenerateCSVTest {
    @Test
    public void test() {
	final Fairy fairy = Fairy.create();
	try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/main/resources/example.csv"));
		final CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
			.withHeader("First Name and Last Name",
				"Age",
				"Sex",
				"Height",
				"Weight",
				"Address",
				"Company"));) {

	    for (int i = 0; i < 100; ++i) {
		final Person person = fairy.person();

		csvPrinter.printRecord(
			person.getFirstName() + " " + person.getLastName(),
			person.getAge(),
			person.getSex(),
			fairy.baseProducer().randomBetween(140, 200),
			fairy.baseProducer().randomBetween(50, 90),
			person.getAddress().getCity(),
			person.getCompany().getName());

	    }

	    csvPrinter.flush();
	} catch (

	final IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
