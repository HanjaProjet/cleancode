package com.byoskill.trainings.cleancode.model.maritalState;

public class EnslavedState implements MaritalState {

    @Override
    public double getDetuctionlRate() {
        return 0.25;
    }
}
