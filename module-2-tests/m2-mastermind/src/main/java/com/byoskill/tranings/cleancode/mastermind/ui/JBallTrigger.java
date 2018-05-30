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
package com.byoskill.tranings.cleancode.mastermind.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.byoskill.tranings.cleancode.mastermind.game.api.Constants;

public class JBallTrigger implements ActionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(JBallTrigger.class);

    private final ActionListener  actionListener;
    private final MasterMindFrame masterMindFrame;

    public JBallTrigger(final MasterMindFrame masterMindFrame, final ActionListener actionListener) {
	this.masterMindFrame = masterMindFrame;
	this.actionListener = actionListener;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
	LOGGER.info("Picking a color");
	final int currentPos = getMasterMindFrame().masterMindGame.getNumberOfSelectedBalls();
	actionListener.actionPerformed(e);
	if (currentPos < Constants.BOARD_LENGTH) {
	    masterMindFrame.getCurrentTrial().getSlot(currentPos)
		    .setChoice(masterMindFrame.masterMindGame.getPreviousBall());
	}
    }

    public MasterMindFrame getMasterMindFrame() {
	return masterMindFrame;
    }

}
