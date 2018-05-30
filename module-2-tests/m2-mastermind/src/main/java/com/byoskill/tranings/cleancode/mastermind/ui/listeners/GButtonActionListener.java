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

/**
 * Green button
 *
 * @author sleroy
 *
 */
public class GButtonActionListener implements ActionListener {

    /**
     *
     */
    private final MasterMindGame masterMindGame;

    /**
     * Instantiates a new g button action listener.
     *
     * @param masterMindGame
     *            the master mind game
     */
    public GButtonActionListener(final MasterMindGame masterMindGame) {
	this.masterMindGame = masterMindGame;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
	masterMindGame.addGreenBall();
    }
}