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

		final List<UserAccount> allUserAccounts = new ArrayList<>();

		allUserAccounts.add(new UserAccount("Chris Melinn", "FAKE123"));
		allUserAccounts.add(new UserAccount("Lisa Simpson", "ABC456"));
		allUserAccounts.add(new UserAccount("Waylan Smithers", "XYZ789"));

	// Outputs (as strings):
	// Chris Melinn, 'FAKE123'
	// Lisa Simpson, 'ABC456'
	// Waylan Smithers, 'XYZ789'
		for (final UserAccount userAccount : allUserAccounts) {
	    final String message = MessageFormat.format("{0} , {1}",
				userAccount.getUserFullName(),
				userAccount.getPseudo());

	    System.out.println(message);
	}
    }
}