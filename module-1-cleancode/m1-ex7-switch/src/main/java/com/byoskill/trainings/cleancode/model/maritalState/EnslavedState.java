package com.byoskill.trainings.cleancode.model.maritalState;

import com.byoskill.trainings.cleancode.model.Citizen;

public class EnslavedState implements MaritalState {

    private MaritalSituation situation;

    public EnslavedState(MaritalSituation situation) {
        this.situation = situation;
    }

    @Override
    public void BecomeSingle() {

        situation.changeMaritalStatus(new SingleState(situation));
    }

    @Override
    public void BecomeMarried() {

        situation.changeMaritalStatus(new MarriedState(situation));
    }

    @Override
    public void BecomeEnslaved() {
    }

    @Override
    public void BecomeDivorced() {

        situation.changeMaritalStatus(new DivorcedState(situation));
    }

    @Override
    public void BecomeWidrowed() {

        throw new MarritalStateException("An enslaved person can");
    }

    @Override
    public double getDetuctionlRate() {
        return 0.25;
    }
}