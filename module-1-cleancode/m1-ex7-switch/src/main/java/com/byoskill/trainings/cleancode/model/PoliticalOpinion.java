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

public interface PoliticalOpinion {

    /**
     * Political side.
     *
     * @return the political side
     */
    PoliticalSide politicalSide();

    /**
     * Security question do you want an airport in A protected area.
     *
     * @return true, if successful
     */
    boolean securityQuestionDoYouWantAnAirportInAProtectedArea();
}
