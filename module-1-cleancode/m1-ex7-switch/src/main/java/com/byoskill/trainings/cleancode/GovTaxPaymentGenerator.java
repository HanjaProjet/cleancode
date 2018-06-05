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

import com.byoskill.trainings.cleancode.model.Citizen;
import com.byoskill.trainings.cleancode.model.maritalState.MaritalSituation;
import com.byoskill.trainings.cleancode.model.PoliticalOpinion;
import com.byoskill.trainings.cleancode.model.TaxPayer;

/**
 * The Class GovTaxPaymentGenerator is a tool to compute the taxes, any citizen
 * should pay depending of some .... criterias.
 */
public class GovTaxPaymentGenerator {

    private static final double FIXED_FLAT_TAX = 0.35f;
    private static final double MINIMAL_IMPOSITION = 0.15f;

    /**
     * Compute tax amount with marital deduction.
     *
     * @param situation the situation
     * @return the double
     */
    private double computeDeductionRateWithMaritalDeduction(final MaritalSituation situation) {
        double deductionRate = situation.getMartialDeductonRate();
        return deduceChildrenFromTaxRate(situation, deductionRate);
    }

    private double computeNeutralTaxAmount(final Citizen citizen) {
        final double taxAmountBasedOnIncome = computeTaxAmountBasedOnIncome(citizen);
        final double taxAmountWithMaritalDeduction = taxAmountBasedOnIncome
                * computeDeductionRateWithMaritalDeduction(citizen);

        return taxAmountWithMaritalDeduction;
    }

    private double computePayerTypeDeduction(final Citizen citizen) {
        return citizen.getPayerTypeDedution();
    }

    /**
     * Compute political deduction.
     *
     * @param politicalOpinion the citizen
     * @return the double
     */
    private double computePoliticalDeduction(final PoliticalOpinion politicalOpinion) {
        return politicalOpinion.getPoliticalSideDedution();
    }

    /**
     * Compute the tax amount based on income.
     *
     * @param taxPayer the tax payer
     * @return the amount of tax to be paid
     */
    private double computeTaxAmountBasedOnIncome(final TaxPayer taxPayer) {
        return taxPayer.getDeclaredNetIncome() * FIXED_FLAT_TAX;
    }

    /**
     * Compute taxes for a citizen. The tax amount is computed depending of many
     * factors :
     * <ul>
     * <li>neutral criteria : the number of children, marital status and net incomes
     * </li>
     * <li>biased criteria : political side and payer type</li>
     * </ul>
     * <p>
     * The amout of taxe is stored in the citizen profile.
     *
     * @param citizen the citizen
     */
    public void computeTaxes(final Citizen citizen) {
        final double neutralTaxAmount = computeNeutralTaxAmount(citizen);
        final double taxWithMaritalAndPoliticalDeduction = neutralTaxAmount
                * computePoliticalDeduction(citizen);
        computePayerTypeDeduction(citizen);
        citizen.setLastPaidTaxes(taxWithMaritalAndPoliticalDeduction);
    }

    private double deduceChildrenFromTaxRate(final MaritalSituation situation, final double deductionRate) {
        return Math.max(MINIMAL_IMPOSITION /** Everybody pays */
                , deductionRate - situation.numberOfChildrenInCharge() * 0.10);
    }

}
