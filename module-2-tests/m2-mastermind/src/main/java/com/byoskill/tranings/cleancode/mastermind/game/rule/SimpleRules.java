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
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.NoColor;

public class SimpleRules {

    private int numberOfAttempts = 0;

    public AttemptResult attempt(final Attempt attempt, final Solution solution) {

	int validBalls = 0;
	int invalidBalls = 0;
	int numberBallsProvided = 0;
	for (int i = 0; i < Constants.BOARD_LENGTH; i++) {
	    if (!new NoColor().equals(attempt.getBall(i))) {
		numberBallsProvided++;
	    }
	    if (attempt.getBall(i).equals(solution.getBall(i))) {
		validBalls++;
	    } else {
		invalidBalls++;
	    }
	}
	final AttemptResultImpl attemptResultImpl = new AttemptResultImpl();
	attemptResultImpl.setNumberInvalidBalls(invalidBalls);
	attemptResultImpl.setNumberValidBalls(validBalls);
	attemptResultImpl.setTrialNumber(attempt.getTrialNumber());

	attemptResultImpl.setNumberBallsProvided(numberBallsProvided);

	return attemptResultImpl;
    }

    public int getNumberOfAttempts() {
	return numberOfAttempts;
    }

    public Attempt newAttempt() {
	return new Attempt(numberOfAttempts++);
    }

}
