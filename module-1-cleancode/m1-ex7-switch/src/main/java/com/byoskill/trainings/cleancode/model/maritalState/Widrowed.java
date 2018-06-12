package com.byoskill.trainings.cleancode.model.maritalState;

import com.byoskill.trainings.cleancode.model.maritalState.MaritalState;

public class Widrowed implements MaritalState {

    private MaritalSituation situation;

    public Widrowed(MaritalSituation situation) {
        this.situation = situation;
    }

    @Override
    public void BecomeSingle() {

    }

    @Override
    public void BecomeMarried() {

    }

    @Override
    public void BecomeEnslaved() {

    }

    @Override
    public void BecomeDivorced() {

    }

    @Override
    public void BecomeWidrowed() {

    }

    @Override
    public double getDetuctionlRate() {
        return 0.75;
    }
}
