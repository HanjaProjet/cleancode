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

public class CardSet extends ArrayList<PlayingCard> {

    /**
     * Instantiates a new card set.
     *
     * @param listOfcards the list ofcards
     */
    public CardSet(final List<PlayingCard> listOfcards) {
        addAll(listOfcards);
    }

    /**
     * Tests if the cardset contains a card with the given figure
     *
     * @param figure the figure
     * @return true, if successful
     */
    public boolean containsCard(final Figure figure) {
        return stream().filter(c -> c.getFigure()
                                     .equals(figure))
                       .findFirst()
                       .isPresent();
    }

}
