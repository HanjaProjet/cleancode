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

public class Address {
    CountryCode country;
    private String city;
    private String adresssLine1;

    private String adresssLine2;

    private String postalCode;

    public String getAdresssLine1() {
        return adresssLine1;
    }

    public String getAdresssLine2() {
        return adresssLine2;
    }

    public String getCity() {
        return city;
    }

    public CountryCode getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setAdresssLine1(final String adresssLine1) {
        this.adresssLine1 = adresssLine1;
    }

    public void setAdresssLine2(final String adresssLine2) {
        this.adresssLine2 = adresssLine2;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setCountry(final CountryCode country) {
        this.country = country;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address [country=" + country + ", city=" + city + ", adresssLine1=" + adresssLine1 + ", adresssLine2="
                + adresssLine2 + ", postalCode=" + postalCode + "]";
    }

}
