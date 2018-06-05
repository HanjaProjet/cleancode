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

import com.byoskill.trainings.cleancode.model.*;
import com.byoskill.trainings.cleancode.model.maritalState.SingleState;
import com.byoskill.trainings.cleancode.model.politicalDeductionStrategy.EvilCommingWingsDeductionStrategy;

public class Main {

    public static void main(final String[] args) {
        // This program is simulating a fictional governmental program to compute taxes
        // and
        // triggers some actions depending of the situation of the citizen.

        final CitizenBuilder citizenBuilder = new CitizenBuilder();
        final Citizen citizen = citizenBuilder.withMaritalStatus(new SingleState())
                                              .withNumberOfChildren(0)
                                              .withPayerType(PayerType.NATIONAL)
                                              .withPoliticalSide(new EvilCommingWingsDeductionStrategy())
                                              .withSecurityQuestion(true)
                                              .build();

        // Compute the taxes this citizen should pay
        final GovTaxPaymentGenerator govTaxPaymentGenerator = new GovTaxPaymentGenerator();
        govTaxPaymentGenerator.computeTaxes(citizen);

    }
}
