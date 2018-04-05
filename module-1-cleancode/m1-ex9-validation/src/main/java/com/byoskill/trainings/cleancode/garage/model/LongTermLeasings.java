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
package com.byoskill.trainings.cleancode.garage.model;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.byoskill.trainings.cleancode.garage.validation.ObjectValidation;

public class LongTermLeasings {

    private static final ObjectValidation OBJECT_VALIDATION = new ObjectValidation();
    private final List<LongTermLeasing>	  leasings	    = new ArrayList<>();

    /**
     * Creates the new leasing.
     *
     * @param vehicle
     *            the vehicle
     * @param customer
     *            the customer
     * @param sinceDate
     *            the since date
     * @param toDate
     *            the to date
     */
    public void createNewLeasing(final Vehicle vehicle, final Customer customer, final DateTime sinceDate,
	    final DateTime toDate) {
	final LongTermLeasing leasing = new LongTermLeasing(vehicle, customer, sinceDate, toDate);
	OBJECT_VALIDATION.validate(leasing);
	leasings.add(leasing);
    }
}
