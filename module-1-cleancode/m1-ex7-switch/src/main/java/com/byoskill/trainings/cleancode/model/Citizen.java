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

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
public class Citizen implements TaxPayer, PoliticalOpinion, MaritalSituation {

    private PayerType	  payerType;
    private MaritalStatus maritalStatus;
    private int		  numberOfChildren;
    private PoliticalSide politicalSide;
    private boolean	  securityQuestion;
    private double	  declaredNetIncome;
    private double	  lastPaidTaxes;

    @Override
    public double getDeclaredNetIncome() {
	return declaredNetIncome;
    }

    @Override
    public double getLastPaidTaxes() {
	return lastPaidTaxes;
    }

    @Override
    public MaritalStatus getMaritalStatus() {
	return maritalStatus;
    }

    public int getNumberOfChildren() {
	return numberOfChildren;
    }

    @Override
    public PayerType getPayerType() {
	return payerType;
    }

    public PoliticalSide getPoliticalSide() {
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
    public PoliticalSide politicalSide() {
	return politicalSide;
    }

    @Override
    public boolean securityQuestionDoYouWantAnAirportInAProtectedArea() {
	return securityQuestion;
    }

    public void setDeclaredNetIncome(final double declaredNetIncome) {
	this.declaredNetIncome = declaredNetIncome;
    }

    public void setLastPaidTaxes(final double lastPaidTaxes) {
	this.lastPaidTaxes = lastPaidTaxes;
    }

    public void setMaritalStatus(final MaritalStatus maritalStatus) {
	this.maritalStatus = maritalStatus;
    }

    public void setNumberOfChildren(final int numberOfChildren) {
	this.numberOfChildren = numberOfChildren;
    }

    public void setPayerType(final PayerType payerType) {
	this.payerType = payerType;
    }

    public void setPoliticalSide(final PoliticalSide politicalSide) {
	this.politicalSide = politicalSide;
    }

    public void setSecurityQuestion(final boolean securityQuestion) {
	this.securityQuestion = securityQuestion;
    }

}
