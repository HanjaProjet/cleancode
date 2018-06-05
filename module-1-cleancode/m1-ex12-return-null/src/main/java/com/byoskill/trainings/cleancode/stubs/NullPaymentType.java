package com.byoskill.trainings.cleancode.stubs;

public class NullPaymentType extends PaymentType {

    public TaxCode getTaxcode() {
        // TODO Auto-generated method stub
        return new TaxCode();
    }

    public boolean isContribution() {
        // TODO Auto-generated method stub
        return false;
    }
}
