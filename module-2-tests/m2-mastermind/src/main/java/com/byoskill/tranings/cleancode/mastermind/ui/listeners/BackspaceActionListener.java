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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.byoskill.tranings.cleancode.mastermind.game.api.MasterMindGame;

public class BackspaceActionListener implements ActionListener {

    private final MasterMindGame masterMindGame;

    /**
     * @param submitPanel
     */
    public BackspaceActionListener(final MasterMindGame masterMindGame) {
	this.masterMindGame = masterMindGame;

    }

    @Override
    public void actionPerformed(final ActionEvent e) {

	masterMindGame.backspaceAction();

    }
}