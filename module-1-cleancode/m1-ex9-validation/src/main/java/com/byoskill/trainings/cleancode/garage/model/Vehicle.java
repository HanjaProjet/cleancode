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

// TODO: Auto-generated Javadoc
/**
 * The Class Vehicle.
 */
public class Vehicle {

    /** The manufacturer. */
    private String manufacturer;

    /** The license plate. */
    private String licensePlate;

    /** The seat count. */
    private int seatCount;

    private int power;

    private String deliveryYear;

    private int numberOfKilometers;

    /**
     * Instantiates a new vehicle.
     */
    public Vehicle() {
	super();
    }

    public String getDeliveryYear() {
	return deliveryYear;
    }

    /**
     * Gets the license plate.
     *
     * @return the license plate
     */
    public String getLicensePlate() {
	return licensePlate;
    }

    /**
     * Gets the manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
	return manufacturer;
    }

    public int getNumberOfKilometers() {
	return numberOfKilometers;
    }

    public int getPower() {
	return power;
    }

    /**
     * Gets the seat count.
     *
     * @return the seat count
     */
    public int getSeatCount() {
	return seatCount;
    }

    public void setDeliveryYear(final String deliveryYear) {
	this.deliveryYear = deliveryYear;
    }

    /**
     * Sets the license plate.
     *
     * @param licensePlate
     *            the new license plate
     */
    public void setLicensePlate(final String licensePlate) {
	this.licensePlate = licensePlate;
    }

    /**
     * Sets the manufacturer.
     *
     * @param manufacturer
     *            the new manufacturer
     */
    public void setManufacturer(final String manufacturer) {
	this.manufacturer = manufacturer;
    }

    public void setNumberOfKilometers(final int numberOfKilometers) {
	this.numberOfKilometers = numberOfKilometers;
    }

    public void setPower(final int power) {
	this.power = power;
    }

    /**
     * Sets the seat count.
     *
     * @param seatCount
     *            the new seat count
     */
    public void setSeatCount(final int seatCount) {
	this.seatCount = seatCount;
    }

    // getters and setters ...
}