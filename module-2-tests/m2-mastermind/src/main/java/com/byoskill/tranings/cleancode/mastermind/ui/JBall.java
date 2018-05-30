package com.byoskill.tranings.cleancode.mastermind.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

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

    private UserChoice<BallColor> userChoice;

    JBall() {
        userChoice = new UserChoice((choice) -> {
    	revalidate();
    	this.repaint();
    	return null;
        });

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
     * @param color
     *            the color
     */
    public void setChoice(final BallColor color) {
        userChoice.setChoice(color);

    }
}