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

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioStage;

public class GivenTransaction extends Stage<GivenTransaction> {

    @ScenarioStage
    private Transaction transaction;

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(final Transaction transaction) {
        this.transaction = transaction;
    }

    /**
     * Transaction invalid.
     */
    public void transactionInvalid() {
        transaction = new Transaction();
    }

}
