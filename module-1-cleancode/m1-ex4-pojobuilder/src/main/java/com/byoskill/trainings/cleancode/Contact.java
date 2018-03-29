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

public class Contact {
    private final String firstName;

    private final String lastName;

    private String email;

    private Address address;

    private Company company;

    public Contact(final String firstName, final String lastName, final String email, final Address address,
	    final Company company) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.company = company;
	this.email = email;
    }

    public Address getAddress() {
	return address;
    }

    public Company getCompany() {
	return company;
    }

    public String getEmail() {
	return email;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setAddress(final Address address) {
	this.address = address;
    }

    public void setCompany(final Company company) {
	this.company = company;
    }

    public void setEmail(final String email) {
	this.email = email;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Contact [firstName=" + firstName + ", \nlastName=" + lastName + ", \nemail=" + email + ", \naddress="
		+ address + ", \ncompany=" + company
		+ "]";
    }
}
