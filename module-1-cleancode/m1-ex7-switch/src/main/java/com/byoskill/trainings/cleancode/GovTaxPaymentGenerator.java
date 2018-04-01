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
import com.byoskill.trainings.cleancode.model.MaritalSituation;
import com.byoskill.trainings.cleancode.model.PoliticalOpinion;
import com.byoskill.trainings.cleancode.model.TaxPayer;

/**
 * The Class GovTaxPaymentGenerator is a tool to compute the taxes, any citizen
 * should pay depending of some .... criterias.
 */
public class GovTaxPaymentGenerator {

    private static final double	FIXED_FLAT_TAX	   = 0.35f;
    private static final double	MINIMAL_IMPOSITION = 0.15f;

    /**
     * Compute tax amount with marital deduction.
     *
     * @param situation
     *            the situation
     * @return the double
     */
    private double computeDeductionRateWithMaritalDeduction(final MaritalSituation situation) {
	double deductionRate = 1.0;
	switch (situation.getMaritalStatus()) {
	case DIVORCED:
	    // No pity for savage who divorces
	    deductionRate = 1.0;
	    break;
	case ENSLAVED:
	    // It's worse than having children and wife
	    deductionRate = 0.25;
	    break;
	case MARRIED:
	    // Okay we little blame you
	    deductionRate = 0.85;
	    break;
	case WIDOWED:
	    // It's time to build a new life, we save you to pay tax for some times
	    deductionRate = 0.75;
	    break;
	case SINGLE:
	    // Pay evil consumer, pay!
	    deductionRate = 1.25;
	    break;
	}
	return deduceChildrenFromTaxRate(situation, deductionRate);
    }

    private double computeNeutralTaxAmount(final Citizen citizen) {
	final double taxAmountBasedOnIncome = computeTaxAmountBasedOnIncome(citizen);
	final double taxAmountWithMaritalDeduction = taxAmountBasedOnIncome
		* computeDeductionRateWithMaritalDeduction(citizen);

	return taxAmountWithMaritalDeduction;
    }

    private double computePayerTypeDeduction(final Citizen citizen) {
	switch (citizen.getPayerType()) {
	case EMBASSY:
	    return 0; // Special status
	case NATIONAL:
	    return 1.0; // YOu pay
	case ENEMY_POLITICIAN:
	    return 1.25; // Slightly higher for you my dear enemy
	case FRIENDLY_POLITICIAN:
	    return 0.35; // Why should we pay ?
	case ILLEGAL_IMMIGRANT:
	    return 0.0f; // Officialy you are not here
	case LEGAL_IMMIGRANT:
	    return 1.0; // Welcome here
	default:
	    return 1.0;
	}
    }

    /**
     * Compute political deduction.
     *
     * @param politicalOpinion
     *            the citizen
     * @return the double
     */
    private double computePoliticalDeduction(final PoliticalOpinion politicalOpinion) {
	switch (politicalOpinion.politicalSide()) {
	case BAD_EXTREMIST_WING:
	    return 1.25; // They will never know
	case CANNABIS_LOVER_WING:
	    return politicalOpinion.securityQuestionDoYouWantAnAirportInAProtectedArea()
		    ? 0.85 /** OK, it's our elector */
		    : 1.25; /* Treator */
	case EVIL_COMMIES_WING:
	    return 1.15; // They will help each other to pay our taxes
	}
	return 1.0;
    }

    /**
     * Compute the tax amount based on income.
     *
     * @param taxPayer
     *            the tax payer
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
     *
     * The amout of taxe is stored in the citizen profile.
     *
     * @param citizen
     *            the citizen
     *
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
