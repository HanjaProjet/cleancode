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

import java.math.BigDecimal;

import javax.annotation.Nonnull;

import com.byoskill.trainings.cleancode.stubs.BillingPlan;
import com.byoskill.trainings.cleancode.stubs.Customer;
import com.byoskill.trainings.cleancode.stubs.ExternalService;
import com.byoskill.trainings.cleancode.stubs.Payment;
import com.byoskill.trainings.cleancode.stubs.PaymentType;
import com.byoskill.trainings.cleancode.stubs.Receipt;
import com.byoskill.trainings.cleancode.stubs.TaxCode;

public class ReturnNullExample {

    private static final BigDecimal MAX_DONATION_WITHOUT_RECEIPT = BigDecimal.valueOf(1000);
    private ExternalService service;

    /**
     * Example 1 of null value to refactor.
     *
     * @return a billing plan
     */
    public @Nonnull
    BillingPlan getBillingPlan() {

        final Customer customer = service.getAuthenticatedCustomer();
        BillingPlan plan;
        if (customer == null) {
            plan = BillingPlan.basic();
        } else {
            plan = customer.getPlan();
        }
        return plan;
    }

    /**
     * Example 2<br>
     * Gets the deductible amount.
     *
     * @param payment the payment
     * @return the deductible amount
     */
    public BigDecimal getDeductibleAmount(final Payment payment) {
        final PaymentType paymentType = payment.getPaymentType();
        if (paymentType != null && paymentType.isContribution()) {
            final TaxCode taxCode = paymentType.getTaxcode();
            if (taxCode != null && taxCode.isTaxDeductible()) {
                final Receipt receipt = payment.getReceipt();
                if (receipt != null && receipt.isPresent()) {
                    return payment.getAmount();
                } else {
                    final BigDecimal amount = payment.getAmount();
                    return amount.max(MAX_DONATION_WITHOUT_RECEIPT);
                }
            }
        }
        return new BigDecimal(0);
    }
}
