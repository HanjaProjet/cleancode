package com.byoskill.trainings.cleancode.model.politicalDeductionStrategy;

import com.byoskill.trainings.cleancode.model.PoliticalDeductionStrategy;
import com.byoskill.trainings.cleancode.model.PoliticalOpinion;

public class CanabisLoverWingStrategy implements PoliticalDeductionStrategy {

    private PoliticalOpinion opinion;

    public CanabisLoverWingStrategy(PoliticalOpinion opinion) {
        this.opinion = opinion;
    }

    @Override
    public double getDeduction() {
        return opinion.securityQuestionDoYouWantAnAirportInAProtectedArea()
                ? 0.85 /** OK, it's our elector */
                : 1.25; /* Treator */
    }
}
