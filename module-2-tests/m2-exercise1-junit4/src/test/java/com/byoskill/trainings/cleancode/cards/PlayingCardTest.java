package com.byoskill.trainings.cleancode.cards;

import org.junit.Assert;
import org.junit.Test;

public class PlayingCardTest {

    @Test
    public final void testCardColorIsBlack() {

        // TODO:: Write your assertions
        Assert.fail("Not implemented");
    }

    @Test
    public final void testCardColorIsRed() {

        // TODO:: Write your assertions
        Assert.fail("Not implemented");
    }

    @Test
    public final void testDoesNotHaveTheSamePower() {
        final PlayingCard playingCard = new PlayingCard(CardColor.BLACK, Figure.KING);
        final PlayingCard playingCard2 = new PlayingCard(CardColor.RED, Figure.KING);

        // TODO:: Write your assertions
        Assert.fail("Not implemented");
    }

    @Test
    public final void testHasSamePower() {
        final PlayingCard playingCard = new PlayingCard(CardColor.RED, Figure.KING);
        final PlayingCard playingCard2 = new PlayingCard(CardColor.RED, Figure.KING);

        // TODO:: Write your assertions
        Assert.fail("Not implemented");
    }

    @Test
    public final void testIsMorePowerful() {
        final PlayingCard playingCard = new PlayingCard(CardColor.RED, Figure.KING);
        final PlayingCard playingCard2 = new PlayingCard(CardColor.RED, Figure.JACK);

        // TODO:: Write your assertions
        Assert.fail("Not implemented");

    }

}
