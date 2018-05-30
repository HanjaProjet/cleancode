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

public class Basket {
    private int numberOfUnits;
    private float pricePerUnit;
    private float percentageDiscount;

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public float getPercentageDiscount() {
        return percentageDiscount;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public void setNumberOfUnits(final int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public void setPercentageDiscount(final float percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public void setPricePerUnit(final float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "Basket [numberOfUnits=" + numberOfUnits + ", pricePerUnit=" + pricePerUnit + ", percentageDiscount="
                + percentageDiscount + "]";
    }
}
