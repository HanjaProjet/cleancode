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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

class Example3 {
    public static void main(final String[] args) {

	final List<Pair<String, String>> list = new ArrayList<>();

	list.add(new Pair("Chris Melinn", "FAKE123"));
	list.add(new Pair("Lisa Simpson", "ABC456"));
	list.add(new Pair("Waylan Smithers", "XYZ789"));

	// Outputs (as strings):
	// Chris Melinn, 'FAKE123'
	// Lisa Simpson, 'ABC456'
	// Waylan Smithers, 'XYZ789'
	for (final Pair<String, String> item : list) {
	    final String message = MessageFormat.format("{0} , {1}",
		    item.getFirst(),
		    item.getSecond());

	    System.out.println(message);
	}
    }
}