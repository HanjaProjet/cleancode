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

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.function.Function;

import javax.swing.JPanel;

import com.byoskill.tranings.cleancode.mastermind.game.api.BallColor;

/**
 * This class represents graphically a ball in the mastermind board. It holds a
 * choice that defines the colour of the ball.
 *
 * @author sleroy
 *
 */
class JBall extends JPanel {

    private final UserChoice<BallColor> userChoice;

    JBall(final Function<BallColor, Void> choice) {
	userChoice = new UserChoice(choice);

    }

    public BallColor getChoice() {
	return userChoice.getChoice();
    }

    @Override
    public Dimension getPreferredSize() {
	return new Dimension(40, 40);
    }

    @Override
    protected void paintComponent(final Graphics grphcs) {
	super.paintComponent(grphcs);
	final Graphics2D g2d = (Graphics2D) grphcs;
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	DrawingClass.drawBall(g2d, getWidth(), getHeight(), userChoice.getChoice());

    }

    /**
     * Set the color choice for this ball.
     *
     * @param object
     *            the color
     */
    public void setChoice(final BallColor object) {
	userChoice.setChoice(object);

    }
}