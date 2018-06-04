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
package com.byoskill.tranings.cleancode.mastermind.ui.listeners;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.byoskill.tranings.cleancode.mastermind.game.api.AttemptResult;
import com.byoskill.tranings.cleancode.mastermind.game.api.MasterMindGame;
import com.byoskill.tranings.cleancode.mastermind.ui.MasterMindFrame;

public class SubmitActionListener implements ActionListener {

    /**
     *
     */
    private final MasterMindGame masterMindGame;
    private final MasterMindFrame masterMindFrame;

    /**
     * @param masterMindGame
     */
    public SubmitActionListener(final MasterMindGame masterMindGame, final MasterMindFrame masterMindFrame) {
        this.masterMindGame = masterMindGame;
        this.masterMindFrame = masterMindFrame;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        final AttemptResult trialResult = masterMindGame.submitPlayerAction();

        if (!trialResult.isGameFinished()) {

            if (trialResult.hasEnoughBalls()) {
                final int trialNumber = trialResult.getTrialNumber();
                masterMindFrame.conPanel.trials[trialNumber].getBkField()
                                                            .setText("" + trialResult.getNumberOfValidBalls());
                masterMindFrame.conPanel.trials[trialNumber].getWhField()
                                                            .setText("" + trialResult.getNumberOfInvalidBalls());
                if (trialResult.hasGuessedAllBalls()) {
                    masterMindFrame.finalMessage.setText("YOU WIN!!!!!");
                } else if (trialResult.hasMoreTrials()) {
                    masterMindFrame.finalMessage.setText("Sorry, try Again.");
                }
            } else {
                JOptionPane.showMessageDialog(new Frame(),
                        "Input can't less than 5 balls",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(new Frame(),
                    "GAME OVER",
                    "GAME OVER",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}