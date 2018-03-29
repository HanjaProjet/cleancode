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

public class Address {
    // @formatter:off
    private String city;
    private String postalCode;
    private String addressLine1;
    private String addressLine2;
    private String country;
    // @formatter:on

    public String getAddressLine1() {
	return addressLine1;
    }

    public String getAddressLine2() {
	return addressLine2;
    }

    public String getCity() {
	return city;
    }

    public String getCountry() {
	return country;
    }

    public String getPostalCode() {
	return postalCode;
    }

    public void setAddressLine1(final String addressLine1) {
	this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(final String addressLine2) {
	this.addressLine2 = addressLine2;
    }

    public void setCity(final String city) {
	this.city = city;
    }

    public void setCountry(final String country) {
	this.country = country;
    }

    public void setPostalCode(final String postalCode) {
	this.postalCode = postalCode;
    }
}