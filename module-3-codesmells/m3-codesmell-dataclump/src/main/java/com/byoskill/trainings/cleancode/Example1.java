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

public class Example1 {
    public static void main(final String args[]) {

	final String firstName = args[0];

	final String lastName = args[1];

	final Integer age = new Integer(args[2]);

	final String gender = args[3];

	final String occupation = args[4];

	final String city = args[5];

	validateID(firstName, lastName);

	welcomeNew(firstName, lastName, age, gender, occupation, city);

    }

    private static void validateID(final String firstName, final String lastName) {
	if (firstName.isEmpty() || lastName.isEmpty()) {
	    throw new IllegalArgumentException("Not valid ID");
	}

    }

    public static void welcomeNew(final String firstName, final String lastName, final Integer age, final String gender,
	    final String occupation,
	    final String city) {

	System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a%s\n", firstName, lastName, age,
		gender, city, occupation);

    }
}
