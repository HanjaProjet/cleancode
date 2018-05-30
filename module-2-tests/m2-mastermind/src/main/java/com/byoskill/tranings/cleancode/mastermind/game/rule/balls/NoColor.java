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
package com.byoskill.tranings.cleancode.mastermind.game.rule.balls;

import java.awt.Color;

import com.byoskill.tranings.cleancode.mastermind.game.api.BallColor;

public class NoColor implements BallColor {

    @Override
    public boolean equals(final Object obj) {
	return obj != null && (super.equals(obj) || getClass().equals(obj.getClass()));
    }

    @Override
    public Color getColor() {

	return Color.BLACK;
    }

}
