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

public class Example2 {

    public static void main(final String args[]) {

	final Integer[] cityPopulations = {

		13000000, // London

		21903623, // New York

		12570000, // Tokyo

		1932763, // Stockholm

		1605602, // Barcelona

		4119190 // Sydney

	};

	for (final Integer cityPopulation : cityPopulations) {

	    System.out.println(cityPopulation);
	}

    }

}
