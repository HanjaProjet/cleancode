package com.byoskill.trainings.cleancode.model.politicalDeductionStrategy;

import com.byoskill.trainings.cleancode.model.PoliticalDeductionStrategy;

public class BasExtremistDeductionStrategy implements PoliticalDeductionStrategy {

    @Override
    public double getDeduction() {
        return 1.25;
    }
}
