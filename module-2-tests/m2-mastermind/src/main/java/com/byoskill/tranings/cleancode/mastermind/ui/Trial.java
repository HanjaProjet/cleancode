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

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.byoskill.tranings.cleancode.mastermind.game.api.Constants;

public class Trial extends JPanel {

    JLabel trialLabel;
    // JTextField field;
    JBall[] slots = new JBall[Constants.BOARD_LENGTH];

    JLabel	       blackPin;
    private JTextField bkField;
    JLabel	       whitePin;
    private JTextField whField;

    Trial() {
    }

    Trial(final int num) {
	// We are building the board here
	setLayout(new FlowLayout());
	this.add(trialLabel = new JLabel("Trial " + num));

	// this.add(field = new JTextField(14));
	for (int i = 0; i < slots.length; ++i) {
	    add(slots[i] = new JBall((choice) -> {
		revalidate();
		this.repaint();
		return null;
	    }));
	}
	this.add(blackPin = new JLabel("BK"));
	this.add(bkField = new JTextField(3));
	this.add(whitePin = new JLabel("WH"));
	this.add(whField = new JTextField(3));
	// field.setEditable(false);
	bkField.setEditable(false);
	whField.setEditable(false);
    }

    public JTextField getBkField() {
	return bkField;
    }

    public JBall getSlot(final int currentPos) {
	return slots[currentPos];
    }

    public JTextField getWhField() {
	return whField;
    }

    public void setBkField(final JTextField bkField) {
	this.bkField = bkField;
    }

    void setButtonEnabled(final boolean enabled) {
	blackPin.setEnabled(enabled);
	whitePin.setEnabled(enabled);
    }

    public void setWhField(final JTextField whField) {
	this.whField = whField;
    }
}