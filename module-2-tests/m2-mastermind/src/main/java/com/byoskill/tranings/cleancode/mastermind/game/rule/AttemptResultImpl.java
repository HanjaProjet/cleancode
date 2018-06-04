/*
 * Copyright (C) 2017 Sylvain Leroy - BYOSkill Company All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the MIT license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the MIT license with
 * this file. If not, please write to: sleroy at byoskill.com, or visit : www.byoskill.com
 *
 */
package com.byoskill.tranings.cleancode.mastermind.game.rule;

import com.byoskill.tranings.cleancode.mastermind.game.api.AttemptResult;
import com.byoskill.tranings.cleancode.mastermind.game.api.Constants;

public class AttemptResultImpl implements AttemptResult {

    private int numberInvalidBalls;
    private int numberValidBalls;
    private int trialNumber;
    private int numberBallsProvided;

    public int getNumberBallsProvided() {
        return numberBallsProvided;
    }

    public int getNumberInvalidBalls() {
        return numberInvalidBalls;
    }

    @Override
    public int getNumberOfInvalidBalls() {
        return numberInvalidBalls;
    }

    @Override
    public int getNumberOfValidBalls() {
        return numberValidBalls;
    }

    public int getNumberValidBalls() {
        return numberValidBalls;
    }

    @Override
    public int getTrialNumber() {
        return trialNumber;
    }

    @Override
    public boolean hasEnoughBalls() {
        return numberBallsProvided == Constants.BOARD_LENGTH;
    }

    @Override
    public boolean hasGuessedAllBalls() {
        return numberValidBalls == Constants.BOARD_LENGTH;
    }

    @Override
    public boolean hasMoreTrials() {
        return trialNumber < Constants.NUMBER_ATTEMPTS;
    }

    @Override
    public boolean isGameFinished() {
        return hasGuessedAllBalls() || !hasMoreTrials();
    }

    public void setNumberBallsProvided(final int numberBallsProvided) {
        this.numberBallsProvided = numberBallsProvided;
    }

    public void setNumberInvalidBalls(final int numberInvalidBalls) {
        this.numberInvalidBalls = numberInvalidBalls;
    }

    public void setNumberValidBalls(final int numberValidBalls) {
        this.numberValidBalls = numberValidBalls;
    }

    public void setTrialNumber(final int trialNumber) {
        this.trialNumber = trialNumber;
    }

}
