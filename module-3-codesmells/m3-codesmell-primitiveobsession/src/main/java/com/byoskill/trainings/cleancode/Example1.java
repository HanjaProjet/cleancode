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

import java.util.regex.Pattern;

public class Example1 {

    private static final String NAMEPATTERN = "[A-Za-z\\.]+";

    public static void main(final String[] args) {

    }

    public boolean isCorporateEmail(final String email) {
	if (email.isEmpty()) {
	    return false;
	}
	if (email.trim().isEmpty()) {
	    return false;
	}
	if (!email.contains("@")) {
	    return false;
	}
	final String[] emailFragments = email.split("@"); //$NON-NLS-1$
	if (emailFragments.length != 2) {
	    return false;
	}
	if (!Pattern.compile(NAMEPATTERN).matcher(emailFragments[0]).matches()) {
	    return false;
	}
	if ("corporate.com".equals(emailFragments[1])) {
	    return true;
	}
	return false;
    }

    public boolean isSocialNetworkEmail(final String email) {
	if (email.isEmpty()) {
	    return false;
	}
	if (email.trim().isEmpty()) {
	    return false;
	}
	if (!email.contains("@")) {
	    return false;
	}
	final String[] emailFragments = email.split("@"); //$NON-NLS-1$
	if (emailFragments.length != 2) {
	    return false;
	}
	if (!Pattern.compile(NAMEPATTERN).matcher(emailFragments[0]).matches()) {
	    return false;
	}
	if ("facebook.com".equals(emailFragments[1])) {
	    return true;
	}
	return false;
    }
}
