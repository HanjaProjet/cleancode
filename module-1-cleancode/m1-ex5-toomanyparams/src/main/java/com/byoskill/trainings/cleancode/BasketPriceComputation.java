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

public class BasketPriceComputation {

    /**
     * Compute the price of a basket.
     *
     * @param quantity           the quantity
     * @param pricePerUnit       the price per unit
     * @param percentageDiscount the percentage discount
     * @return the int
     */
    public float compute(final int quantity, final float pricePerUnit, final float percentageDiscount) {
        if (pricePerUnit < 0) {
            throw new IllegalArgumentException("A price cannot be negative");
        }
        if (percentageDiscount < 0.0f || percentageDiscount > 1.0f) {
            throw new IllegalArgumentException("A discount should be a percentage between 0 and 1");
        }
        return quantity * pricePerUnit * (1.0f - percentageDiscount);
    }
}
