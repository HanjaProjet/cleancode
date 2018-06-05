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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import com.byoskill.trainings.cleancode.garage.validation.ObjectValidation;

public class LongTermLeasings {

    private static final ObjectValidation OBJECT_VALIDATION = new ObjectValidation();
    private final List<LongTermLeasing> leasings = new ArrayList<>();

    /**
     * Creates the new leasing.
     *
     * @param vehicle   the vehicle
     * @param customer  the customer
     * @param sinceDate the since date
     * @param toDate    the to date
     */
    public void createNewLeasing(final Vehicle vehicle, final Customer customer, final DateTime sinceDate,
                                 final DateTime toDate) {
        final LongTermLeasing leasing = new LongTermLeasing(vehicle, customer, sinceDate, toDate);
        OBJECT_VALIDATION.validate(leasing);
        leasings.add(leasing);
    }

    public int extendLeasingForCustomerFromNow(final Customer customer, final DateTime toDateTime) {

        return extendLeasingForCustomer(customer, DateTime.now(), toDateTime);

    }

    /**
     * Exercise 11, module 1.
     *
     * @param customer   the customer
     * @param sinceDate  the actual date is taken as value.
     * @param toDateTime the to date time
     * @return an error flag indicating if the extension was valid.
     * <ul>
     * <li>TODO:: m1 ex 10</li>
     * <li>TODO:: m1 ex 11</li>
     * </ul>
     */
    public int extendLeasingForCustomer(final Customer customer, DateTime sinceDate, final DateTime toDateTime) {

        final Optional<LongTermLeasing> optLeasing = leasings.stream()
                                                             .filter(l -> l.getCustomer()
                                                                           .equals(customer))
                                                             .findFirst();
        if (!optLeasing.isPresent()) {
            return -1;
        }
        final LongTermLeasing longTermLeasing = optLeasing.get();
        if (sinceDate == null) {
            sinceDate = DateTime.now();
        }
        final Duration duration = new Duration(sinceDate, toDateTime);
        final long days = duration.getStandardDays();
        if (days <= 30) {
            return -2;
        }
        longTermLeasing.setSinceDate(sinceDate);
        longTermLeasing.setToDate(toDateTime);
        OBJECT_VALIDATION.validate(longTermLeasing);
        return 0;
    }

    public List<LongTermLeasing> findLongTermLeasingsForCustomer(final Customer customer) {
        return getLongTermLeasingsForEntity(customer, LongTermLeasing::getCustomer);
    }

    public List<LongTermLeasing> findLongTermLeasingsForVehicle(final Vehicle vehicle) {

        return getLongTermLeasingsForEntity(vehicle, LongTermLeasing::getVehicle);
    }


    public List<LongTermLeasing> findLongTermLeasingsForDuration(final Duration duration) {
        return getLongTermLeasingsForEntity(duration, LongTermLeasing::getDuration);

    }

    private <T> List<LongTermLeasing> getLongTermLeasingsForEntity(T entity, Function<LongTermLeasing, T> leasingFunction) {
        return Optional.ofNullable(entity)
                       .map(o -> leasings.stream()
                                         .filter(leasing -> Objects.equals(leasingFunction.apply(leasing), o))
                                         .collect(Collectors.toList()))
                       .orElse(Collections.emptyList());
    }
}
