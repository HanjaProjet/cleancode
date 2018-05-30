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

import java.util.HashMap;
import java.util.Map;

import com.byoskill.trainings.cleancode.cards.exceptions.PlayerHasAlreadyPlayedException;

public class Turn {
    private final Map<Player, CardSet> playedCards = new HashMap<>();

    /**
     * Checks if is player allowed to play again.
     *
     * @param player the player
     * @return true, if is player allowed to play again
     */
    private boolean isPlayerAllowedToPlayAgain(final Player player) {
        final CardSet cardSet = playedCards.get(player);
        if (cardSet == null) {
            return true;
        }
        if (cardSet.containsCard(Figure.FOOL)) {
            return true;
        }
        return cardSet.size() >= 1;
    }

    /**
     * Performs the action to play by the player.
     *
     * @param player the player
     * @param card   the card to be played
     */
    public void playerPlay(final Player player, final PlayingCard card) {

        if (playedCards.containsKey(player)) {
            if (isPlayerAllowedToPlayAgain(player)) {
                playedCards.get(player)
                           .add(card);
            } else {
                throw new PlayerHasAlreadyPlayedException(player);
            }
        } else {
            playedCards.get(player)
                       .add(card);
        }
    }
}
