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

public class Ingredient {
    private double	 quantity;
    private String	 unit;
    private final String name;

    /**
     * Instantiates a new ingredient.
     *
     * @param name
     *            the name
     * @param quantity2
     *            the quantity 2
     * @param unit2
     *            the unit 2
     */
    public Ingredient(final String name, final double quantity2, final String unit2) {
	this.name = name;
	quantity = quantity2;
	unit = unit2;
    }

    public double getQuantity() {
	return quantity;
    }

    public String getUnit() {
	return unit;
    }

    public void setQuantity(final double quantity) {
	this.quantity = quantity;
    }

    public void setUnit(final String unit) {
	this.unit = unit;
    }
}
