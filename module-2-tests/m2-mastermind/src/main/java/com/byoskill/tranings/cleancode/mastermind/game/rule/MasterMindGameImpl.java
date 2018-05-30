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

public class MasterMindGameImpl implements MasterMindGame {

    private static final Logger LOGGER = LoggerFactory.getLogger(MasterMindGameImpl.class);

    @Override
    public void addBlueBall() {
        LOGGER.info("Add blue ball");

    }

    @Override
    public void addGreenBall() {
        LOGGER.info("Add green ball");

    }

    @Override
    public void addOrangeBall() {
        LOGGER.info("Add orange ball");

    }

    @Override
    public void addRedBall() {
        LOGGER.info("Add red ball");

    }

    @Override
    public void addYellowBall() {
        LOGGER.info("Add yellow ball");

    }

    @Override
    public void backspaceAction() {
        LOGGER.info("Backspace action");

    }

    @Override
    public int getNumberOfAttempts() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getNumberOfSelectedBalls() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public BallColor getPreviousBall() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AttemptResult submitPlayerAction() {
        // TODO Auto-generated method stub
        LOGGER.info("Submit player action");
        return new AttemptResultImpl();
    }

}
