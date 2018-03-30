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

/**
 * The Class Person describes an entity describing a person.
 */
public class Person {

    /**
     * Instantiate a Person object.
     *
     * @param lastName
     *            the last name
     * @param firstName
     *            the first name
     * @param middleName
     *            the middle name
     * @param salutation
     *            the salutation
     * @param suffix
     *            the suffix
     * @param streetAddress
     *            the street address
     * @param city
     *            the city
     * @param state
     *            the state
     * @param isFemale
     *            the is female
     * @param isEmployed
     *            the is employed
     * @param isHomeOwner
     *            the is home owner
     * @return the person
     */
    public static Person createPerson(
	    final String lastName,
	    final String firstName,
	    final String middleName,
	    final String salutation,
	    final String suffix,
	    final String streetAddress,
	    final String city,
	    final String state,
	    final boolean isFemale,
	    final boolean isEmployed,
	    final boolean isHomeOwner) {
	final Person person = new Person(lastName,
		firstName,
		middleName,
		salutation,
		suffix,
		streetAddress,
		city,
		state,
		isFemale,
		isEmployed,
		isHomeOwner);

	return person;
    }

    /** The last name. */
    private String lastName;

    /** The first name. */
    private String firstName;

    /** The middle name. */
    private String middleName;

    /** The salutation. */
    private String salutation;

    /** The suffix. */
    private String suffix;

    /** The street address. */
    private String streetAddress;

    /** The city. */
    private String city;

    /** The state. */
    private String state;

    /** The is female. */
    private boolean isFemale;

    /** The is employed. */
    private boolean isEmployed;

    /** The is home owner. */
    private boolean isHomeOwner;

    public Person(final String lastName, final String firstName, final String middleName, final String salutation,
	    final String suffix,
	    final String streetAddress, final String city, final String state, final boolean isFemale,
	    final boolean isEmployed,
	    final boolean isHomeOwner) {
	super();
	this.lastName = lastName;
	this.firstName = firstName;
	this.middleName = middleName;
	this.salutation = salutation;
	this.suffix = suffix;
	this.streetAddress = streetAddress;
	this.city = city;
	this.state = state;
	this.isFemale = isFemale;
	this.isEmployed = isEmployed;
	this.isHomeOwner = isHomeOwner;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
	return city;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * Gets the middle name.
     *
     * @return the middle name
     */
    public String getMiddleName() {
	return middleName;
    }

    /**
     * Gets the salutation.
     *
     * @return the salutation
     */
    public String getSalutation() {
	return salutation;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public String getState() {
	return state;
    }

    /**
     * Gets the street address.
     *
     * @return the street address
     */
    public String getStreetAddress() {
	return streetAddress;
    }

    /**
     * Gets the suffix.
     *
     * @return the suffix
     */
    public String getSuffix() {
	return suffix;
    }

    /**
     * Checks if is employed.
     *
     * @return true, if is employed
     */
    public boolean isEmployed() {
	return isEmployed;
    }

    /**
     * Checks if is female.
     *
     * @return true, if is female
     */
    public boolean isFemale() {
	return isFemale;
    }

    /**
     * Checks if is home owner.
     *
     * @return true, if is home owner
     */
    public boolean isHomeOwner() {
	return isHomeOwner;
    }

    /**
     * Sets the city.
     *
     * @param city
     *            the new city
     */
    public void setCity(final String city) {
	this.city = city;
    }

    /**
     * Sets the employed.
     *
     * @param isEmployed
     *            the new employed
     */
    public void setEmployed(final boolean isEmployed) {
	this.isEmployed = isEmployed;
    }

    /**
     * Sets the female.
     *
     * @param isFemale
     *            the new female
     */
    public void setFemale(final boolean isFemale) {
	this.isFemale = isFemale;
    }

    /**
     * Sets the first name.
     *
     * @param firstName
     *            the new first name
     */
    public void setFirstName(final String firstName) {
	this.firstName = firstName;
    }

    /**
     * Sets the home owner.
     *
     * @param isHomeOwner
     *            the new home owner
     */
    public void setHomeOwner(final boolean isHomeOwner) {
	this.isHomeOwner = isHomeOwner;
    }

    /**
     * Sets the last name.
     *
     * @param lastName
     *            the new last name
     */
    public void setLastName(final String lastName) {
	this.lastName = lastName;
    }

    /**
     * Sets the middle name.
     *
     * @param middleName
     *            the new middle name
     */
    public void setMiddleName(final String middleName) {
	this.middleName = middleName;
    }

    /**
     * Sets the salutation.
     *
     * @param salutation
     *            the new salutation
     */
    public void setSalutation(final String salutation) {
	this.salutation = salutation;
    }

    /**
     * Sets the state.
     *
     * @param state
     *            the new state
     */
    public void setState(final String state) {
	this.state = state;
    }

    /**
     * Sets the street address.
     *
     * @param streetAddress
     *            the new street address
     */
    public void setStreetAddress(final String streetAddress) {
	this.streetAddress = streetAddress;
    }

    /**
     * Sets the suffix.
     *
     * @param suffix
     *            the new suffix
     */
    public void setSuffix(final String suffix) {
	this.suffix = suffix;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Person [lastName=" + lastName + ", firstName=" + firstName + ", middleName=" + middleName
		+ ", salutation=" + salutation + ", suffix=" + suffix + ", streetAddress=" + streetAddress + ", city="
		+ city + ", state=" + state + ", isFemale=" + isFemale + ", isEmployed=" + isEmployed + ", isHomeOwner="
		+ isHomeOwner + "]";
    }

}
