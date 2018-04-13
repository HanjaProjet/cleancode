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

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.commons.lang3.Validate;

public class BankAccount {
    private static final double	MAX_TRANSACTION_AMOUNT = 10000.0d;
    private static final double	MIN_TRANSACTION_AMOUNT = 10.0d;
    private BigDecimal		amount;

    /**
     * Attempt to execute a transaction on the account. The transaction can withdraw
     * or add money on the account. The account cannot be negative
     *
     * @param transaction
     *            the transaction
     */
    public boolean execute(final Transaction transaction) {
	Validate.notNull(transaction);
	if (!transaction.isValid()) {
	    throw new IllegalArgumentException("Invalid transaction");
	}
	if (transaction.isTreated()) {
	    transaction.setTreated(true);
	    throw new AlreadyTreatedTransactionException(transaction);
	}

	if (transaction.getMoney().doubleValue() < 0 && amount.compareTo(transaction.getMoney().abs()) < 0) {
	    transaction.setTreated(true);
	    throw new NotEnoughFundsException("Current amount is " + amount);
	}
	if (transaction.getMoney().doubleValue() > MAX_TRANSACTION_AMOUNT) {
	    transaction.setTreated(true);
	    throw new TransactionWithTooHighAmount("Max allowed transaction " + MAX_TRANSACTION_AMOUNT);
	}
	if (transaction.getMoney().doubleValue() < MIN_TRANSACTION_AMOUNT) {
	    transaction.setTreated(true);
	    throw new TransactionWithTooHighAmount(
		    "Transaction is allowed with minimum amount " + MIN_TRANSACTION_AMOUNT);
	}
	if (transaction.getDate().isAfter(LocalDateTime.now())) {
	    transaction.setTreated(true);
	    throw new InvalidTransactionException("Date cannot be in the future");
	}
	amount = amount.add(transaction.getMoney());
	transaction.setTreated(true);
	return true;
    }

}
