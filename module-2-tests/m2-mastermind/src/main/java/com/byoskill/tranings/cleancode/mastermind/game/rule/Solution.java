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
package com.byoskill.tranings.cleancode.mastermind.game.rule;

import com.byoskill.tranings.cleancode.mastermind.game.api.BallColor;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.BlueBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.GreenBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.OrangeBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.RedBall;
import com.byoskill.tranings.cleancode.mastermind.game.rule.balls.YellowBall;

public class Solution extends Attempt {

    public Solution() {
        super(-1);
        attempt = new BallColor[]{new BlueBall(), new GreenBall(), new OrangeBall(),
                new RedBall(), new YellowBall()};
    }

}
