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
package com.byoskill.trainings.cleancode.cards;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.byoskill.trainings.cleancode.cards.exceptions.PlayerNotFoundException;

public class PlayerRotator {

    private final LinkedList<Player> players = new LinkedList<>();

    /**
     * Instantiates a new player rotator by providing the list of players in their
     * order of play.
     *
     * @param originalOrder the original order
     */
    public PlayerRotator(final List<Player> originalOrder) {
        players.addAll(originalOrder);

    }

    /**
     * Returns the Current player.
     *
     * @return the current player
     */
    public Player currentPlayer() {
        return players.get(0);
    }

    /**
     * Sets the current turn for a given player.
     *
     * @param player the player defined as the current player
     */
    public void setTurn(final Player player) {
        final int indexOf = players.indexOf(player);
        if (-1 == indexOf) {
            throw new PlayerNotFoundException(player);
        }
    }

    /**
     * Switch player.
     *
     * @return the current player
     */
    public Player switchPlayer() {
        Collections.rotate(players, 1);
        return players.get(0);

    }

}
