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

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class LongTermLeasing {

    private Vehicle vehicle;
    private Customer customer;
    private DateTime sinceDate;
    private DateTime toDate;

    public LongTermLeasing(final Vehicle vehicle, final Customer customer, final DateTime sinceDate,
                           final DateTime toDate) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.sinceDate = sinceDate;
        this.toDate = toDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Duration getDuration() {
        return new Duration(sinceDate, toDate);
    }

    public DateTime getSinceDate() {
        return sinceDate;
    }

    public DateTime getToDate() {
        return toDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public void setSinceDate(final DateTime sinceDate) {
        this.sinceDate = sinceDate;
    }

    public void setToDate(final DateTime toDate) {
        this.toDate = toDate;
    }

    public void setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ShortTermLeasing [exo1=" + vehicle + ", customer=" + customer + ", sinceDate=" + sinceDate
                + ", toDate="
                + toDate + "]";
    }

}
