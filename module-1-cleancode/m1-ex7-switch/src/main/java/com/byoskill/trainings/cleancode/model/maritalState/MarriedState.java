package com.byoskill.trainings.cleancode.model.maritalState;

public class MarriedState implements MaritalState {

    private MaritalSituation situation;

    public MarriedState(MaritalSituation situation) {
        this.situation = situation;
    }

    @Override
    public void BecomeSingle() {

        throw new MarritalStateException("An married person can't become single");
    }

    @Override
    public void BecomeMarried() {

        throw new MarritalStateException("you are already married. Don't forget!");
    }

    @Override
    public void BecomeEnslaved() {

        throw new MarritalStateException("An married person can't become enslaved");
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
        return 0.85;
    }
}
