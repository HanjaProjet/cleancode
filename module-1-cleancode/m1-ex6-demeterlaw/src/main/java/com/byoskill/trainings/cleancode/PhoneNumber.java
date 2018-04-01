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

import com.neovisionaries.i18n.CountryCode;

public class PhoneNumber {
    public enum Type {
	LANDLINE("landline"), MOBILE("mobile"), VOIP("voip");

	private final String value;

	private Type(final String value) {
	    this.value = value;
	}

	@Override
	public String toString() {
	    return value;
	}
    }

    private CountryCode countryCode;

    private String phoneNumber;

    public CountryCode getCountryCode() {
	return countryCode;
    }

    public String getPhoneNumber() {
	return phoneNumber;
    }

    public void setCountryCode(final CountryCode countryCode) {
	this.countryCode = countryCode;
    }

    public void setPhoneNumber(final String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
	return "PhoneNumber [countryCode=" + countryCode + ", phoneNumber=" + phoneNumber + "]";
    }

}
