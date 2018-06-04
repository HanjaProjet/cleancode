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
import java.util.List;

/**
 * The Class DeckShuffler is a component to shuffle a deck. It returns a new
 * deck with the playing cards order shuffled.
 */
public class DeckShuffler {
    private final Deck deck;

    /**
     * Instantiates a new deck shuffler.
     *
     * @param deck the deck
     */
    public DeckShuffler(final Deck deck) {
        this.deck = deck;
    }

    /**
     * Shuffle the playing cards of the deck
     *
     * @return the deck
     */
    public Deck shuffle() {
        final List<PlayingCard> playingCards = deck.takeAllCards();
        Collections.shuffle(playingCards);
        return new Deck(playingCards);
    }
}
