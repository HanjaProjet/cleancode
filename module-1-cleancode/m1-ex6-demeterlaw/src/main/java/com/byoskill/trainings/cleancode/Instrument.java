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

public class Instrument {
    InstrumentFamily family;
    String name;
    double price;

    /**
     * Instantiates a new instrument.
     *
     * @param family the family
     * @param name   the name
     */
    public Instrument(final InstrumentFamily family, final String name) {
        this.family = family;
        this.name = name;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setFamily(final InstrumentFamily family) {
        this.family = family;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Instrument [family=" + family + ", name=" + name + ", price=" + price + "]";
    }
}
