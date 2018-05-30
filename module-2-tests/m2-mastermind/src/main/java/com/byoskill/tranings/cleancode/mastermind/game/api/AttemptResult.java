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

/**
 * The Interface AttemptResult contains the evaluation of the player trial.
 */
public interface AttemptResult {

    int getNumberOfInvalidBalls();

    /**
     * Gets the number of valid balls (right color, right place)
     *
     * @return the number of valid balls
     */
    int getNumberOfValidBalls();

    /**
     * Gets the trial number.
     *
     * @return the trial number
     */
    int getTrialNumber();

    /**
     * Checks for enough balls. The player has to add enough balls.
     *
     * @return true, if successful
     */
    boolean hasEnoughBalls();

    /**
     * Checks if the trial was perfect.
     *
     * @return true, if successful
     */
    boolean hasGuessedAllBalls();

    /**
     * Checks for more trials allowed ?
     *
     * @return true, if successful
     */
    boolean hasMoreTrials();

    /**
     * Checks if is game finished (solution found or no more attempts)
     *
     * @return true, if is game finished
     */
    boolean isGameFinished();

}
