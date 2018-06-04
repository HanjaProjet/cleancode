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

import java.util.List;

public class Member {
    private String firstName;
    private String lastName;
    private Email email;

    private PhoneNumber phoneNumber;

    private Address address = new Address();
    private List<Instrument> instruments;
    private boolean composer;

    /**
     * Instantiates a new member.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Member(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void addInstrument(final Instrument instrument) {
        instruments.add(instrument);
    }

    public Address getAddress() {
        return address;
    }

    public Email getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public String getLastName() {
        return lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isComposer() {
        return composer;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public void setComposer(final boolean composer) {
        this.composer = composer;
    }

    public void setEmail(final Email email) {
        this.email = email;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setInstruments(final List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(final PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Member [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
                + phoneNumber + ", address=" + address + ", instruments=" + instruments + ", composer=" + composer
                + "]";
    }

}
