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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

public class RefactoringExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(RefactoringExample.class);

    public static void main(final String[] args) throws MalformedURLException {
	// Case 1
	final Basket basket = new Basket();
	basket.setNumberOfUnits(40);
	basket.setPercentageDiscount(0.05f);
	basket.setPricePerUnit(10);
	final BasketPriceComputation basketPriceComputation = new BasketPriceComputation();
	final float compute = basketPriceComputation.compute(basket.getNumberOfUnits(), basket.getPricePerUnit(),
		basket.getPercentageDiscount());

	LOGGER.info("Price for basket {}", compute);

	// Case 2
	final SmsService smsService = new SmsService();
	smsService.sendTextSms("+33", "688276709", "Hello from a friend");
	smsService.sendTextSms("+02", "232323233", "+33", "688276709", "Hello from a friend");

	smsService.sendMediaSms("+33", "688276709", Lists.newArrayList(new URL("https://mylittlepony/cool.gif")));
	smsService.sendMediaSms("+02", "232323233", "+33", "688276709",
		Lists.newArrayList(new URL("https://mylittlepony/cool.gif")));

	// Case 3
	final String lastName = "Last name";
	final String firstName = "First name";
	final String middleName = "Middle name";
	final String salutation = "Mrs";
	final String suffix = "";
	final String streetAddress = "Rue de Rivoli";
	final String city = "Paris";
	final String state = "Ille de France";
	final boolean isFemale = true;
	final boolean isEmployed = true;
	final boolean isHomeOwner = false;

	final Person createPerson = Person.createPerson(lastName, firstName, middleName, salutation, suffix,
		streetAddress,
		city, state, isFemale, isEmployed, isHomeOwner);
	LOGGER.info("Creating a person {}", createPerson);

    }

}
