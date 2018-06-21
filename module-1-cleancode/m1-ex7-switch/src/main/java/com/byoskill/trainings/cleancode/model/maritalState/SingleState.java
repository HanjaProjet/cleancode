package com.byoskill.trainings.cleancode.model.maritalState;

public class SingleState implements MaritalState {

    private MaritalSituation situation;

    public SingleState(MaritalSituation situation) {
        this.situation = situation;
    }

    @Override
    public void BecomeSingle() {
        throw new MarritalStateException("You are so single !");
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

        throw new MarritalStateException("A single person can't divorced");

    }

    @Override
    public void BecomeWidrowed() {
        throw new MarritalStateException("A single person can't become widrowed");

    }

    @Override
    public double getDetuctionlRate() {
        return 1.25;
    }
}