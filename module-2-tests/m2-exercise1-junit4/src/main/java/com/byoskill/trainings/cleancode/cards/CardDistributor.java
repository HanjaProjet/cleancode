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

import java.util.ArrayList;

public class CardDistributor {

    private final Deck deck;

    private final PlayerRotator playerRotator;

    private int numberOfTurns = 1;

    private Player firstPlayer;

    /**
     * Instantiates a new card distributor.
     *
     * @param deck2
     *            the deck 2
     * @param playerList
     *            the list of players in their order of play
     */
    public CardDistributor(final Deck deck, final ArrayList<Player> playerList) {
	this.deck = deck;
	// TODO:: add constraints here
	playerRotator = new PlayerRotator(playerList);
	firstPlayer = playerList.get(0);
    }

    /**
     * Instantiates a new card distributor.
     *
     * @param deck
     *            the deck
     * @param playerRotator
     *            the player rotator
     */
    public CardDistributor(final Deck deck, final PlayerRotator playerRotator) {
	super();
	this.deck = deck;
	this.playerRotator = playerRotator;
    }

    /**
     * Distribute a certain number of cards for the current player
     *
     * @param numberOfCards
     *            the number of cards
     * @return the card set for a specific player (card hand)
     */
    public CardHand distribute(final int numberOfCards) {
	return new CardHand(playerRotator.currentPlayer(), deck.takeCards(numberOfCards));
    }

    /**
     * Gets the number of turns.
     *
     * @return the number of turns
     */
    public int getNumberOfTurns() {
	return numberOfTurns;
    }

    /**
     * Switch of player.
     *
     * @return the current player
     */
    public Player switchPlayer() {
	final Player currentPlayer = playerRotator.switchPlayer();
	if (currentPlayer.equals(firstPlayer)) {
	    numberOfTurns++;
	}
	return currentPlayer;
    }

    @Override
    public String toString() {
	return "CardDistributor [deck=" + deck + ", playerRotator=" + playerRotator + ", numberOfTurns=" + numberOfTurns
		+ ", firstPlayer=" + firstPlayer + "]";
    }
}
