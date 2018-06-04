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

		Person person = new PersonBuilder().withFirstName(firstName)
										   .withAge(age)
										   .withAge(age)
										   .withGender(gender)
										   .withOccupation(occupation)
										   .withCity(city)
										   .createPerson();
		validateID(person);

		welcomeNew(new PersonBuilder().withFirstName(firstName)
									  .withLastName(lastName)
									  .withAge(age)
									  .withGender(gender)
									  .withOccupation(occupation)
									  .withCity(city)
									  .createPerson());

    }


	private static void validateID(final Person person) {
		if (person.hasIdNotValid()) {
	    throw new IllegalArgumentException("Not valid ID");
	}

    }

	public static void welcomeNew(Person person) {

		System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a%s\n", person.getFirstName(), person.getLastName(), person.getAge(),
				person.getGender(), person.getCity(), person.getOccupation());

    }
}
