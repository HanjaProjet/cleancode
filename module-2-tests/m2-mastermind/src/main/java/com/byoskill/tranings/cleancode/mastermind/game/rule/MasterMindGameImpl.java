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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.byoskill.tranings.cleancode.mastermind.game.api.AttemptResult;
import com.byoskill.tranings.cleancode.mastermind.game.api.BallColor;
import com.byoskill.tranings.cleancode.mastermind.game.api.MasterMindGame;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.BlueBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.GreenBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.OrangeBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.RedBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.YellowBall;

public class MasterMindGameImpl implements MasterMindGame {

    private static final Logger LOGGER = LoggerFactory.getLogger(MasterMindGameImpl.class);

    private Attempt	      attempt;
    private final Solution    solution	  = new Solution();
    private final SimpleRules simpleRules = new SimpleRules();

    public MasterMindGameImpl() {
	attempt = simpleRules.newAttempt();
    }

    @Override
    public void addBlueBall() {
	attempt.addBall(new BlueBall());

    }

    @Override
    public void addGreenBall() {
	attempt.addBall(new GreenBall());

    }

    @Override
    public void addOrangeBall() {
	attempt.addBall(new OrangeBall());

    }

    @Override
    public void addRedBall() {
	attempt.addBall(new RedBall());

    }

    @Override
    public void addYellowBall() {
	attempt.addBall(new YellowBall());

    }

    @Override
    public void backspaceAction() {
	attempt.resetLastChoice();

    }

    @Override
    public int getNumberOfAttempts() {
	return simpleRules.getNumberOfAttempts();
    }

    @Override
    public int getNumberOfSelectedBalls() {
	return attempt.getCurrentBall();
    }

    @Override
    public BallColor getPreviousBall() {
	return attempt.getPreviousBall();
    }

    @Override
    public AttemptResult submitPlayerAction() {
	LOGGER.info("Submit player action");
	final AttemptResult attemptResult = simpleRules.attempt(attempt, solution);
	attempt = simpleRules.newAttempt();
	return attemptResult;
    }

}
