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

import java.net.MalformedURLException;
import java.net.URL;

public class PojoBuilderExample {

    public static void main(final String[] args) throws MalformedURLException {

	final Contact contact = new PojoBuilderExample().createContact();
	System.out.println(contact);

    }

    /**
     * Creates the contact.
     *
     * @return the contact
     * @throws MalformedURLException
     *             the malformed URL exception
     */
    public Contact createContact() throws MalformedURLException {
	final Address address = new Address();
	address.setCity("Lausanne");
	address.setAddressLine1("Place Riponne");
	address.setCountry("Suisse");
	address.setPostalCode("1010");

	final URL url = UrlFactory.createUrl("https", "www.altern.org/", "index.html");
	final Company company = new Company("ALTERN", 2000, url);

	final Contact contact = new Contact("Ernesto", "Gavulin", "e.gavulin@altern.org", address, company);

	return contact;

    }

}
