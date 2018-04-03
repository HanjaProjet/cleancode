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

import java.time.LocalDateTime;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecurityScannerExample {

    private static final int MAXCONNECTIONS = 5;

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityScannerExample.class);

    private static final String SUPER_SECRET_PASSWORD = "IhaveASecretPassionForLittlePoneys";

    @SuppressWarnings("nls")
    public static void main(final String[] args) {

	final SecurityScannerExample securityScannerExample = new SecurityScannerExample();
	securityScannerExample.setBlackList("Don", "Ronald", "Mike",
		"Robert", "Franz");
	final Auth auth = new Auth("John");
	securityScannerExample.checkSecurity(auth);

    }

    private String[] blackListedPeople;

    /**
     * Checks security and updates the Auth profile.
     *
     * @param auth
     *            the authentication data
     */
    void checkSecurity(final Auth auth) {
	auth.setAllowed(false);
	auth.setNumberOfConnections(auth.getNumberOfConnections() + 1);
	String miscreantFound = "";

	if (auth.getNumberOfConnections() > MAXCONNECTIONS) {
	    LOGGER.error("Sorry the software does not allow access to Alzheimer patient");
	    return;
	}

	for (final String element : blackListedPeople) {
	    if (element.equals(
		    auth.getUsername())) {
		sendAlert(element);
		miscreantFound = auth.getUsername();
		break;
	    }
	}
	if (!miscreantFound.isEmpty()) {
	    LOGGER.error("Cannot allow access to this miscreant");

	    return;
	}
	if (!SUPER_SECRET_PASSWORD.equals(auth.getPassword())) {
	    LOGGER.error("Your password is so wrong");
	    return;
	}
	auth.setConnectionTime(LocalDateTime.now());
	auth.setAllowed(true);
	auth.setRights("SECRET", "PONEY", "USER");
	auth.setNumberOfConnections(0);

    }

    private void sendAlert(final String people) {
	LOGGER.info("We found the bad miscreant {}, please neutralize him!", people);

    }

    private void setBlackList(final String... blackList) {
	blackListedPeople = blackList;
    }

    @Override
    public String toString() {
	return "SecurityScannerExample [blackListedPeople=" + Arrays.toString(blackListedPeople) + "]";
    }
}
