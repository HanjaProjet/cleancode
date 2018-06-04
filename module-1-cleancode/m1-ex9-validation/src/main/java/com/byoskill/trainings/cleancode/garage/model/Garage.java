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

// TODO: Auto-generated Javadoc

/**
 * The Class Garage.
 */
public class Garage {

    /**
     * The park.
     */
    private final Park park = new Park();

    /**
     * The short term leasings.
     */
    private final ShortTermLeasings shortTermLeasings = new ShortTermLeasings();

    /**
     * The long term leasings.
     */
    private final LongTermLeasings longTermLeasings = new LongTermLeasings();

    private final CustomerDatabase customerDatabase = new CustomerDatabase();

    /**
     * Gets the customer datase.
     *
     * @return the customer datase
     */
    public CustomerDatabase getCustomerDatase() {

        return customerDatabase;
    }

    /**
     * Gets the long term leasings.
     *
     * @return the long term leasings
     */
    public LongTermLeasings getLongTermLeasings() {
        return longTermLeasings;
    }

    /**
     * Gets the park.
     *
     * @return the park
     */
    public Park getPark() {
        return park;
    }

    /**
     * Gets the short term leasings.
     *
     * @return the short term leasings
     */
    public ShortTermLeasings getShortTermLeasings() {
        return shortTermLeasings;
    }

    @Override
    public String toString() {
        return "Garage [park=" + park + ", shortTermLeasings=" + shortTermLeasings + ", longTermLeasings="
                + longTermLeasings + ", customerDatabase=" + customerDatabase + "]";
    }

}
