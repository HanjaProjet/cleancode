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

    /**
     * The manufacturer.
     */
    private String manufacturer;

    /**
     * The license plate.
     */
    private String licensePlate;

    /**
     * The seat count.
     */
    private int seatCount;

    private int power;

    private String deliveryYear;

    private int numberOfKilometers;

    private VehicleState state;

    /**
     * Instantiates a new exo1.
     */
    public Vehicle() {
        super();
    }

    /**
     * Gets the delivery year.
     *
     * @return the delivery year
     */
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

    /**
     * Gets the number of kilometers.
     *
     * @return the number of kilometers
     */
    public int getNumberOfKilometers() {
        return numberOfKilometers;
    }

    /**
     * Gets the power.
     *
     * @return the power
     */
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

    private boolean keyBroke() {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean lackOfOil() {
        // TODO Auto-generated method stub
        return false;
    }

    public void setDeliveryYear(final String deliveryYear) {
        this.deliveryYear = deliveryYear;
    }

    /**
     * Sets the license plate.
     *
     * @param licensePlate the new license plate
     */
    public void setLicensePlate(final String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Sets the manufacturer.
     *
     * @param manufacturer the new manufacturer
     */
    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Sets the number of kilometers.
     *
     * @param numberOfKilometers the new number of kilometers
     */
    public void setNumberOfKilometers(final int numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    /**
     * Sets the power.
     *
     * @param power the new power
     */
    public void setPower(final int power) {
        this.power = power;
    }

    /**
     * Sets the seat count.
     *
     * @param seatCount the new seat count
     */
    public void setSeatCount(final int seatCount) {
        this.seatCount = seatCount;
    }

    /**
     * Attempt to start the vehicule and returns a flag to indicates the status of
     * the car after turning the keys- TODO:: module 1 exercise 10
     *
     * @return the status code
     */
    public int start() {
        if (keyBroke()) {
            state = VehicleState.OUT_OF_ORDER;
            return -1;
        }
        if (lackOfOil()) {
            state = VehicleState.OUT_OF_ORDER;
            return -2;
        }
        if (lackOfOil()) {
            state = VehicleState.OUT_OF_ORDER;
            return -3;
        }
        if (wrongKey()) {
            state = VehicleState.OUT_OF_ORDER;
            return -4;
        }
        if (state == VehicleState.RUNNING) {
            return 0;
        } else if (state == VehicleState.REPAIRED) {
            state = VehicleState.RUNNING;
            return 1;
        } else if (state == VehicleState.OUT_OF_ORDER) {
            return -666;
        } else if (state == VehicleState.NOT_RUNNING) {
            state = VehicleState.RUNNING;
            return 2;
        } else {
            return 777; // Should never be here
        }

    }

    private boolean wrongKey() {
        // TODO Auto-generated method stub
        return false;
    }

}