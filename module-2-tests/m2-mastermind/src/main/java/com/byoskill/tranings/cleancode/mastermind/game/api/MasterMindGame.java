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
package com.byoskill.tranings.cleancode.mastermind.game.api;

public interface MasterMindGame {

    /**
     * Adds the blue ball.
     */
    public void addBlueBall();

    /**
     * Adds the green ball.
     */
    public void addGreenBall();

    /**
     * Adds the orange ball.
     */
    public void addOrangeBall();

    /**
     * Adds the red ball.
     */
    public void addRedBall();

    /**
     * Adds the yellow ball to the current trial
     */
    public void addYellowBall();

    /**
     * Implements the action to remove a ball from the Trial.
     */
    public void backspaceAction();

    /**
     * Gets the current ball (the slot number where the next choice will be
     * inserted)
     *
     * @return the current ball
     */
    public int getNumberOfSelectedBalls();

    /**
     * Gets the number of attempts.
     *
     * @return the number of attempts
     */
    public int getNumberOfAttempts();

    /**
     * Gets the previous ball.
     *
     * @return the previous ball
     */
    public BallColor getPreviousBall();

    /**
     * Submit player action. The attempt is evaluated against the solution.
     *
     * @return the trial result
     */
    public AttemptResult submitPlayerAction();

}
