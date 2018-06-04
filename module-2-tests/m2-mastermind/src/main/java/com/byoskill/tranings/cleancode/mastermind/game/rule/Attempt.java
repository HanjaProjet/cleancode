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

import java.util.Arrays;

import com.byoskill.tranings.cleancode.mastermind.game.api.BallColor;
import com.byoskill.tranings.cleancode.mastermind.game.api.Constants;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.NoColor;

public class Attempt {

    protected BallColor[] attempt = new BallColor[Constants.BOARD_LENGTH];

    private int numberBalls = 0;

    private final int trialOrder;

    public Attempt(final int trialOrder) {
        this.trialOrder = trialOrder;
        Arrays.fill(attempt, new NoColor());
    }

    /**
     * Adds the ball.
     *
     * @param ballColor the ball color
     */
    public void addBall(final BallColor ballColor) {
        if (numberBalls < Constants.BOARD_LENGTH) {
            attempt[numberBalls++] = ballColor;
        }
    }

    /**
     * Gets the ball.
     *
     * @param ballNumber the number ball
     * @return the ball
     */
    public BallColor getBall(final int ballNumber) {
        if (ballNumber >= 0 && ballNumber < Constants.BOARD_LENGTH) {
            return attempt[ballNumber];
        }
        throw new ArrayIndexOutOfBoundsException(ballNumber);

    }

    public int getCurrentBall() {
        return numberBalls;
    }

    /**
     * Gets the previous ball.
     *
     * @return the previous ball
     */
    public BallColor getPreviousBall() {
        if (numberBalls > 0) {
            return attempt[numberBalls - 1];
        } else {
            return new NoColor();

        }
    }

    /**
     * Gets the trial number.
     *
     * @return the trial number
     */
    public int getTrialNumber() {
        return trialOrder;
    }

    /**
     * Reset last choice.
     */
    public void resetLastChoice() {
        if (numberBalls > 0) {
            attempt[--numberBalls] = null;
        }

    }

}
