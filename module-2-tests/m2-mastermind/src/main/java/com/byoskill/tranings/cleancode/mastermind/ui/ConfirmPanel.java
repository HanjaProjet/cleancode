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

import java.awt.GridLayout;

import javax.swing.JPanel;

public class ConfirmPanel extends JPanel {

    public Trial[] trials;

    ConfirmPanel() {
	setLayout(new GridLayout(0, 1));
	trials = new Trial[10];
	for (int i = 0; i < 10; i++) {
	    add(trials[i] = new Trial(i + 1));
	}
    }

}