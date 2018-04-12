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
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.byoskill.trainings.cleancode.cards.exceptions.EmptyDeckException;

public class Deck {

    private final Stack<PlayingCard> availableCards = new Stack<>();

    /**
     * Instantiates a new deck.
     *
     * @param playingCards
     *            the playing cards
     */
    public Deck(final List<PlayingCard> playingCards) {
	availableCards.addAll(playingCards);
    }

    /**
     * Removes a card from the deck.
     *
     * @return the playing card or an exception if the deck is already empty
     */
    public PlayingCard pop() {
	if (availableCards.isEmpty()) {
	    throw new EmptyDeckException();
	}
	return availableCards.pop();
    }

    /**
     * Take all cards.
     *
     * @return the list
     */
    public List<PlayingCard> takeAllCards() {
	return new ArrayList<>(availableCards);
    }

    /**
     * Take a certain number of cards out of the deck.
     *
     * @param numberOfCards
     *            the number of cards
     * @return the card set
     */
    public CardSet takeCards(final int numberOfCards) {
	final List<PlayingCard> collect = IntStream.range(0, numberOfCards).mapToObj(i -> pop())
		.collect(Collectors.toList());
	return new CardSet(collect);
    }

}
