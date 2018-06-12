package com.byoskill.trainings.cleancode.model.maritalState;

public class OtherMarritalState implements MaritalState {

    private MaritalSituation situation;

    public OtherMarritalState(MaritalSituation situation) {
        this.situation = situation;
    }

    @Override
    public void BecomeSingle() {

        this.situation.changeMaritalStatus(new SingleState(situation));
    }

    @Override
    public void BecomeMarried() {

        this.situation.changeMaritalStatus(new MarriedState(situation));
    }

    @Override
    public void BecomeEnslaved() {

        this.situation.changeMaritalStatus(new EnslavedState(situation));
    }

    @Override
    public void BecomeDivorced() {

        this.situation.changeMaritalStatus(new DivorcedState(situation));
    }

    @Override
    public void BecomeWidrowed() {

        this.situation.changeMaritalStatus(new Widrowed(situation));
    }

    @Override
    public double getDetuctionlRate() {
        return 1.0;
    }
}
