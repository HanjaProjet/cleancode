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
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.byoskill.tranings.cleancode.mastermind.ui.listeners.BButtonActionListener;
import com.byoskill.tranings.cleancode.mastermind.ui.listeners.BackspaceActionListener;
import com.byoskill.tranings.cleancode.mastermind.ui.listeners.GButtonActionListener;
import com.byoskill.tranings.cleancode.mastermind.ui.listeners.OButtonActionListener;
import com.byoskill.tranings.cleancode.mastermind.ui.listeners.RButtonActionListener;
import com.byoskill.tranings.cleancode.mastermind.ui.listeners.SubmitActionListener;
import com.byoskill.tranings.cleancode.mastermind.ui.listeners.YButtonActionListener;

/**
 * Panel containing the submit button.
 *
 * @author sleroy
 */
public class SubmitPanel extends JPanel {

    /**
     *
     */
    final MasterMindFrame masterMindFrame;

    JButton RButton;
    JButton GButton;
    JButton BButton;
    JButton YButton;
    JButton OButton;

    JButton SubmitButton;

    JButton BackspaceButton;

    JPanel buttonPanel;

    JPanel subPanel;

    SubmitPanel(final MasterMindFrame masterMindFrame) {
        this.masterMindFrame = masterMindFrame;
        setLayout(new GridLayout(2, 0));
        buttonPanel = new JPanel(new GridLayout(0, 5));
        buttonPanel.add(RButton = new JButton("R"));
        RButton.addActionListener(
                new JBallTrigger(masterMindFrame, new RButtonActionListener(masterMindFrame.masterMindGame)));
        RButton.setBackground(Color.RED);

        buttonPanel.add(GButton = new JButton("G"));
        GButton.addActionListener(
                new JBallTrigger(masterMindFrame, new GButtonActionListener(masterMindFrame.masterMindGame)));
        GButton.setBackground(Color.GREEN);

        buttonPanel.add(BButton = new JButton("B"));
        BButton.addActionListener(
                new JBallTrigger(masterMindFrame, new BButtonActionListener(masterMindFrame.masterMindGame)));
        BButton.setBackground(Color.BLUE);

        buttonPanel.add(YButton = new JButton("Y"));
        YButton.addActionListener(
                new JBallTrigger(masterMindFrame, new YButtonActionListener(masterMindFrame.masterMindGame)));
        YButton.setBackground(Color.YELLOW);

        buttonPanel.add(OButton = new JButton("O"));
        OButton.addActionListener(
                new JBallTrigger(masterMindFrame, new OButtonActionListener(masterMindFrame.masterMindGame)));
        OButton.setBackground(Color.ORANGE);

        subPanel = new JPanel(new GridLayout(0, 2));
        subPanel.add(SubmitButton = new JButton("Submit"));
        subPanel.add(BackspaceButton = new JButton("Backspace"));
        BackspaceButton.addActionListener(new BackspaceActionListener(masterMindFrame.masterMindGame));
        SubmitButton.addActionListener(new SubmitActionListener(masterMindFrame.masterMindGame, masterMindFrame));
        this.add(buttonPanel);
        this.add(subPanel);
    }
}