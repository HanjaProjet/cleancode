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

public class AlreadyTreatedTransactionException extends RuntimeException {

    public AlreadyTreatedTransactionException() {
        // TODO Auto-generated constructor stub
    }

    public AlreadyTreatedTransactionException(final String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public AlreadyTreatedTransactionException(final String message, final Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public AlreadyTreatedTransactionException(final String message, final Throwable cause,
                                              final boolean enableSuppression,
                                              final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public AlreadyTreatedTransactionException(final Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    public AlreadyTreatedTransactionException(final Transaction transaction) {
        super(transaction.toString());
    }

}
