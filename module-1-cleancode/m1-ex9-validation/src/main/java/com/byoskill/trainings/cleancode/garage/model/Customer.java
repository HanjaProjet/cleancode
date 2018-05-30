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

public class Customer {

    private String firstName;
    private String lastName;
    private String city;
    private String postalCode;
    private String adressLine1;
    private int age;

    public String getAdressLine1() {
        return adressLine1;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setAdressLine1(final String adressLine1) {
        this.adressLine1 = adressLine1;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", postalCode="
                + postalCode + ", adressLine1=" + adressLine1 + "]";
    }

}
