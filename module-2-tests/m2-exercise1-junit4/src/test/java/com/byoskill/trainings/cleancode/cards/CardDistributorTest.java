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
import java.util.List;

import org.junit.Test;

public class CardDistributorTest {

    private Deck	      deck;
    private ArrayList	      players;
    private CardDistributor   cardDistributor;
    private List<PlayingCard> playingCards;

    public void before() {
	// initialize a list of players
	players = new ArrayList<>();

	// Initialize cards

	// initialize a deck
	deck = new Deck(playingCards);

	// initialize the Card distributor
	cardDistributor = new CardDistributor(deck, players);
    }

    /**
     * This test is initializing a deck, players and attempt to distribute 3 cards
     * per user. a full turn.
     *
     */
    @Test
    public void testDistributeAFullRound_threePlayers_enough_cards() {
	throw new RuntimeException("not yet implemented");
    }

    /**
     * This test is initializing a deck, players and attempt to distribute too much
     * card to a player.
     *
     */
    @Test
    public void testDistributeAndNoEnoughCard() {
    }

    /**
     * This test is initializing a deck, players and attempt to distribute 3 cards
     * per user. two full turn. The deck has enough cards.
     */
    @Test
    public void testDistributeTwoFullRound_threePlayers_enough_cards() {
	throw new RuntimeException("not yet implemented");
    }

}
