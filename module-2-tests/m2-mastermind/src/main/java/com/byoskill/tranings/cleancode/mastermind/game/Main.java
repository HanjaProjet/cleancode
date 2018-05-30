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
package com.byoskill.tranings.cleancode.mastermind.game;

import javax.swing.JFrame;

import com.byoskill.tranings.cleancode.mastermind.ui.MasterMindFrame;

public class Main {

    public static void main(final String[] args) {
	// write your code here
	final JFrame a = new JFrame();
	a.add(new MasterMindFrame());
	a.pack();
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	a.setVisible(true);
    }
}
