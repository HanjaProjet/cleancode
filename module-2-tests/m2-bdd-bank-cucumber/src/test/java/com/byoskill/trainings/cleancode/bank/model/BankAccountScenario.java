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
package com.byoskill.trainings.cleancode.bank.model;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankAccountScenario {

    @And("^the card should be returned$")
    public void cardShouldBeReturned() {
    }

    @And("^the account balance should be (\\d*)$")
    public void checkBalance(final int newBalance) {
    }

    @Then("^the ATM should dispense (\\d*)$")
    public void checkMoney(final int amount) {
    }

    @Given("^the account balance is (\\d*)$")
    public void createAccount(final int balance) {
    }

    @And("^the machine contains (\\d*)$")
    public void createATM(final int money) {
    }

    @And("^the card is valid$")
    public void createCreditCard() {
    }

    @When("^the Account Holder requests (\\d*)$")
    public void requestMoney(final int amount) {
    }

}
