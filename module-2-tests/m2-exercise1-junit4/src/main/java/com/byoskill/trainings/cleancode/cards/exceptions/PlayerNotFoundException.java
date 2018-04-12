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
package com.byoskill.trainings.cleancode.cards.exceptions;

import com.byoskill.trainings.cleancode.cards.Player;

public class PlayerNotFoundException extends RuntimeException {

    public PlayerNotFoundException(final Player player) {
	super("This player is not defined in the game " + player.getName());
    }

}
