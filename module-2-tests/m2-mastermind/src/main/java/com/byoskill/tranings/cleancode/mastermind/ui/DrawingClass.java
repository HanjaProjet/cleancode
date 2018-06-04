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
import java.awt.Graphics2D;

import com.byoskill.tranings.cleancode.mastermind.game.api.BallColor;

/**
 * The Class DrawingClass.
 *
 * @author sleroy
 */
class DrawingClass {

    /**
     * Draw bullet.
     *
     * @param g2d    the g 2 d
     * @param width  the width
     * @param height the height
     * @param choice the choice
     */
    static void drawBall(final Graphics2D g2d, final int width, final int height, final BallColor choice) {
        // Depending of the choice; a different color
        if (choice == null) {
            g2d.setColor(Color.BLACK);
        } else {
            g2d.setColor(choice.getColor());
        }
        g2d.fillOval(5, 5, width / 2, height / 2);
    }
}
