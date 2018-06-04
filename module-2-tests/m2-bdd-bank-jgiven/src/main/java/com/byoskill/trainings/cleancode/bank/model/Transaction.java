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

public class Transaction {
    private String subject;
    private BigDecimal money;
    private boolean treated;
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isTreated() {
        return treated;
    }

    public boolean isValid() {
        throw new UnsupportedOperationException("To be implemented");
    }

    public void setDate(final LocalDateTime date) {
        this.date = date;
    }

    public void setMoney(final BigDecimal money) {
        this.money = money;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public void setTreated(final boolean treated) {
        this.treated = treated;
    }

    @Override
    public String toString() {
        return "Transaction [subject=" + subject + ", money=" + money + ", treated=" + treated + ", date=" + date + "]";
    }
}
