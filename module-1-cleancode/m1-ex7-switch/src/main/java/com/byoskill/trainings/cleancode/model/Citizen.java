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

import com.byoskill.trainings.cleancode.model.maritalState.MaritalSituation;
import com.byoskill.trainings.cleancode.model.maritalState.MaritalState;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
public class Citizen implements TaxPayer, PoliticalOpinion, MaritalSituation {

    private PayerType payerType;
    private MaritalState maritalStatus;
    private int numberOfChildren;
    private PoliticalDeductionStrategy politicalSide;
    private boolean securityQuestion;
    private double declaredNetIncome;
    private double lastPaidTaxes;

    @Override
    public double getDeclaredNetIncome() {
        return declaredNetIncome;
    }

    @Override
    public double getLastPaidTaxes() {
        return lastPaidTaxes;
    }

    @Override
    public MaritalState getMaritalStatus() {
        return maritalStatus;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public PoliticalDeductionStrategy getPoliticalSide() {
        return politicalSide;
    }

    public boolean isSecurityQuestion() {
        return securityQuestion;
    }

    @Override
    public int numberOfChildrenInCharge() {
        return numberOfChildren;
    }

    @Override
    public double getMartialDeductonRate() {
        return maritalStatus.getDetuctionlRate();
    }

    @Override
    public boolean securityQuestionDoYouWantAnAirportInAProtectedArea() {
        return securityQuestion;
    }

    @Override
    public double getPoliticalSideDedution() {
        return politicalSide.getDeduction();
    }

    public void setDeclaredNetIncome(final double declaredNetIncome) {
        this.declaredNetIncome = declaredNetIncome;
    }

    public void setLastPaidTaxes(final double lastPaidTaxes) {
        this.lastPaidTaxes = lastPaidTaxes;
    }

    public void setMaritalStatus(final MaritalState maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setNumberOfChildren(final int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public void setPayerType(final PayerType payerType) {
        this.payerType = payerType;
    }

    public void setPoliticalSide(final PoliticalDeductionStrategy politicalSide) {
        this.politicalSide = politicalSide;
    }

    public void setSecurityQuestion(final boolean securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public double getPayerTypeDedution() {

        return payerType.getDedution();
    }
}
