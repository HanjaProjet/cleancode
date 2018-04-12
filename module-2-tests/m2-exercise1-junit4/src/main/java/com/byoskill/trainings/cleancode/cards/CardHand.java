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

/**
 * The Class CardHand represents the hand of player (the current cards that he
 * holds)
 */
public class CardHand {

    private Player  currentPlayer;
    private CardSet takeCards;

    /**
     * Instantiates a new card hand.
     *
     * @param currentPlayer
     *            the current player
     * @param takeCards
     *            the take cards
     */
    public CardHand(final Player currentPlayer, final CardSet takeCards) {
	this.currentPlayer = currentPlayer;
	this.takeCards = takeCards;
    }

    public Player getCurrentPlayer() {
	return currentPlayer;
    }

    public CardSet getTakeCards() {
	return takeCards;
    }

    public void setCurrentPlayer(final Player currentPlayer) {
	this.currentPlayer = currentPlayer;
    }

    public void setTakeCards(final CardSet takeCards) {
	this.takeCards = takeCards;
    }

}
