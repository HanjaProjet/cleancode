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

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.byoskill.tranings.cleancode.mastermind.game.api.MasterMindGame;
import com.byoskill.tranings.cleancode.mastermind.game.rule.MasterMindGameFactory;

/**
 * Created by JasonPan on 4/30/15.<br/>
 * Modified by Sylvain Leroy MASTER MIND Player to guess what computer think.
 */
public class MasterMindFrame extends JPanel {

    final MasterMindGame      masterMindGame = MasterMindGameFactory.newGame();
    private final SubmitPanel subPanel;
    public final ConfirmPanel conPanel;

    public final JTextField finalMessage;

    public MasterMindFrame() {
	// The game works for only one guess
	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	conPanel = new ConfirmPanel();
	this.add(conPanel);
	subPanel = new SubmitPanel(this);
	this.add(subPanel);
	finalMessage = new JTextField(30);
	finalMessage.setEditable(false);
	this.add(finalMessage);
    }

    public Trial getCurrentTrial() {
	return conPanel.trials[masterMindGame.getNumberOfAttempts() - 1];
    }

}
