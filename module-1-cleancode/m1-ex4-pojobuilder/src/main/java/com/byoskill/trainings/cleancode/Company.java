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

import java.net.URL;

/**
 * The Class Company describes a small entitiy with company details.
 */
public class Company {

    /**
     * The name.
     */
    private String name;

    /**
     * The numberof employee.
     */
    private int numberofEmployee;

    private URL url;

    /**
     * Instantiates a new company.
     *
     * @param arg1 the arg 1
     * @param arg2 the arg 2
     * @param arg3 the arg 3
     */
    public Company(final String arg1, final int arg2, final URL arg3) {
        name = arg1;
        numberofEmployee = arg2;
        url = arg3;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the numberof employee.
     *
     * @return the numberofEmployee
     */
    public int getNumberofEmployee() {
        return numberofEmployee;
    }

    public URL getUrl() {
        return url;
    }

    /**
     * Sets the name.
     *
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Sets the numberof employee.
     *
     * @param numberofEmployee the numberofEmployee to set
     */
    public void setNumberofEmployee(final int numberofEmployee) {
        this.numberofEmployee = numberofEmployee;
    }

    public void setUrl(final URL url) {
        this.url = url;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Company [name=" + name + ", \nnumberofEmployee=" + numberofEmployee + ", \nurl=" + url + "]";
    }

}
