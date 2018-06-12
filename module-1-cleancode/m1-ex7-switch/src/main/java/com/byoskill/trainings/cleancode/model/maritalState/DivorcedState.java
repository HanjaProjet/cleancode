package com.byoskill.trainings.cleancode.model.maritalState;

public class DivorcedState implements MaritalState {

    private MaritalSituation situation;

    public DivorcedState(MaritalSituation situation) {
        this.situation = situation;
    }

    @Override
    public void BecomeSingle() {
        throw new MarritalStateException("An divorced person can't become Single");
    }

    @Override
    public void BecomeMarried() {
        situation.changeMaritalStatus(new MarriedState(situation));

    }

    @Override
    public void BecomeEnslaved() {
        situation.changeMaritalStatus(new EnslavedState(situation));
    }

    @Override
    public void BecomeDivorced() {
        throw new MarritalStateException("you are already divorced");
    }

    @Override
    public void BecomeWidrowed() {
        throw new MarritalStateException("An divorced person can't become widowed");
    }

    @Override
    public double getDetuctionlRate() {
        return 1.0;
    }
}
