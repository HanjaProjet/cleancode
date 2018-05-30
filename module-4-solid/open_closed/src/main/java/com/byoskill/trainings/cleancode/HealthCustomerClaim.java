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

public class HealthCustomerClaim {

    private String firstName;
    private String lastName;
    private HealthState healthState;
    private int age;

    public int getAge() {

        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public HealthState getHealthState() {

        return healthState;
    }

    public CharSequence getLastName() {
        return lastName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setHealthState(final HealthState healthState) {
        this.healthState = healthState;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
