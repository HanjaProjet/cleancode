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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.byoskill.tranings.cleancode.mastermind.game.BallColor;
import com.byoskill.tranings.cleancode.mastermind.game.MasterMindGame;

/**
 * Created by JasonPan on 4/30/15.<br/>
 * Modified by Sylvain Leroy MASTER MIND Player to guess what computer think.
 */
public class MasterMindFrame extends JPanel {

    class ConfirmPanel extends JPanel {

	Trial[] trials;

	ConfirmPanel() {
	    setLayout(new GridLayout(0, 1));
	    trials = new Trial[10];
	    for (int i = 0; i < 10; i++) {
		add(trials[i] = new Trial(i + 1));
	    }
	}

    }

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

    /**
     * Panel containing the submit button.
     *
     * @author sleroy
     *
     */
    class SubmitPanel extends JPanel {

	class BackspaceActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(final ActionEvent e) {

		masterMindGame.backspaceAction();

	    }
	}

	/**
	 * Blue button
	 *
	 * @author sleroy
	 *
	 */
	class BButtonActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(final ActionEvent e) {
		masterMindGame.setBallChoice(new BallColor());
	    }
	}

	/**
	 * Green button
	 *
	 * @author sleroy
	 *
	 */
	class GButtonActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(final ActionEvent e) {
		masterMindGame.setBallChoice(new BallColor());
	    }
	}

	class OButtonActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(final ActionEvent e) {
		masterMindGame.setBallChoice(new BallColor());
	    }
	}

	/**
	 * Red button aka Trump button
	 *
	 * @author sleroy
	 *
	 */
	class RButtonActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(final ActionEvent e) {
		masterMindGame.setBallChoice(new BallColor());
	    }
	}

	class SubmitActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(final ActionEvent e) {
		masterMindGame.submitPlayerAction();

		// if(guessTimes < 10) {
		// JTextField temp = conPanel.trials[guessTimes].field;
		// String gottenString = temp.getText();
		// if (gottenString.length() == 5) {
		// player.setPlayerColor(temp.getText());
		// GamePlayer.PinCount count = GamePlayer.compare(player, computer);
		// conPanel.trials[guessTimes].bkField.setText("" + count.BKCount);
		// conPanel.trials[guessTimes].whField.setText("" + count.WHCount);
		// guessTimes++;
		// if (count.BKCount == 5) {
		// finalMessage.setText("YOU WIN!!!!!");
		// guessTimes = 10;
		// } else if (guessTimes >= 10) {
		// finalMessage.setText("Sorry, try Again.");
		// }
		// } else {
		// JOptionPane.showMessageDialog(new Frame(),
		// "Input can't less than 5 characters",
		// "Invalid Input",
		// JOptionPane.ERROR_MESSAGE);
		// }
		// }else{
		// JOptionPane.showMessageDialog(new Frame(),
		// "GAME OVER",
		// "GAME OVER",
		// JOptionPane.ERROR_MESSAGE);
		// }
	    }
	}

	/**
	 * Yellow button
	 *
	 * @author sleroy
	 *
	 */
	class YButtonActionListener implements ActionListener {

	    @Override
	    public void actionPerformed(final ActionEvent e) {
		masterMindGame.setBallChoice(new BallColor());
		/**
		 * JTextField temp = conPanel.trials[guessTimes].field;
		 * if(temp.getText().length() < 5) temp.setText(temp.getText() + "Y");*
		 */
	    }
	}

	JButton	RButton;
	JButton	GButton;
	JButton	BButton;
	JButton	YButton;
	JButton	OButton;

	JButton SubmitButton;

	JButton BackspaceButton;

	JPanel buttonPanel;

	JPanel subPanel;

	SubmitPanel() {
	    setLayout(new GridLayout(2, 0));
	    buttonPanel = new JPanel(new GridLayout(0, 5));
	    buttonPanel.add(RButton = new JButton("R"));
	    RButton.addActionListener(new RButtonActionListener());
	    RButton.setBackground(Color.RED);

	    buttonPanel.add(GButton = new JButton("G"));
	    GButton.addActionListener(new GButtonActionListener());
	    GButton.setBackground(Color.GREEN);

	    buttonPanel.add(BButton = new JButton("B"));
	    BButton.addActionListener(new BButtonActionListener());
	    BButton.setBackground(Color.BLUE);

	    buttonPanel.add(YButton = new JButton("Y"));
	    YButton.addActionListener(new YButtonActionListener());
	    YButton.setBackground(Color.YELLOW);

	    buttonPanel.add(OButton = new JButton("O"));
	    OButton.addActionListener(new OButtonActionListener());
	    OButton.setBackground(Color.ORANGE);

	    subPanel = new JPanel(new GridLayout(0, 2));
	    subPanel.add(SubmitButton = new JButton("Submit"));
	    subPanel.add(BackspaceButton = new JButton("Backspace"));
	    BackspaceButton.addActionListener(new BackspaceActionListener());
	    SubmitButton.addActionListener(new SubmitActionListener());
	    this.add(buttonPanel);
	    this.add(subPanel);
	}
    }

    class Trial extends JPanel {

	JLabel trialLabel;
	// JTextField field;
	JBall[] bullets = new JBall[BOARD_LENGTH];

	JLabel	   blackPin;
	JTextField bkField;
	JLabel	   whitePin;
	JTextField whField;

	private final int numberBalls = 0;

	Trial() {
	}

	Trial(final int num) {
	    // We are building the board here
	    setLayout(new FlowLayout());
	    this.add(trialLabel = new JLabel("Trial " + num));

	    // this.add(field = new JTextField(14));
	    for (int i = 0; i < bullets.length; ++i) {
		add(bullets[i] = new JBall());
	    }
	    this.add(blackPin = new JLabel("BK"));
	    this.add(bkField = new JTextField(3));
	    this.add(whitePin = new JLabel("WH"));
	    this.add(whField = new JTextField(3));
	    // field.setEditable(false);
	    bkField.setEditable(false);
	    whField.setEditable(false);
	}

	void setButtonEnabled(final boolean enabled) {
	    blackPin.setEnabled(enabled);
	    whitePin.setEnabled(enabled);
	}
    }

    public static final int BOARD_LENGTH = 5;

    private final MasterMindGame masterMindGame	= new MasterMindGame();
    private final SubmitPanel	 subPanel;
    private final ConfirmPanel	 conPanel;

    private final JTextField finalMessage;

    MasterMindFrame() {
	// The game works for only one guess
	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	conPanel = new ConfirmPanel();
	this.add(conPanel);
	subPanel = new SubmitPanel();
	this.add(subPanel);
	finalMessage = new JTextField(30);
	finalMessage.setEditable(false);
	this.add(finalMessage);
    }

}
