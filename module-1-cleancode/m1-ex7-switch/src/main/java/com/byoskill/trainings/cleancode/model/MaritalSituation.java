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
package com.byoskill.trainings.cleancode.model;

public interface MaritalSituation {

    /**
     * Marital status.
     *
     * @return the marital status
     */
    MaritalStatus getMaritalStatus();

    /**
     * Number of children in charge.
     *
     * @return the number of children in charge
     */
    int numberOfChildrenInCharge();
}
