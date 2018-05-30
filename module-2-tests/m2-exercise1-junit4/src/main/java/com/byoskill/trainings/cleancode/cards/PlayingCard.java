/**
 * Copyright (C) 2017-2018 Credifix
 */
package com.byoskill.trainings.cleancode.cards;

import java.util.Objects;

/**
 * The Class PlayingCard is the data class to represent a playing card.
 */
public class PlayingCard {

    /**
     * The color.
     */
    private CardColor color = CardColor.NONE;

    /**
     * The figure.
     */
    private Figure figure;

    /**
     * The value.
     */
    private Integer value;

    public PlayingCard(final CardColor color, final Figure figure) {
        this.color = color;
        this.figure = figure;
    }

    /**
     * Instantiates a new playing card.
     *
     * @param color  the color
     * @param figure the figure
     * @param value  the value
     */
    public PlayingCard(final CardColor color, final Figure figure, final Integer value) {
        super();
        this.color = color;
        this.figure = figure;
        this.value = value;
    }

    /**
     * Gets the color.
     *
     * @return the color
     */
    public CardColor getColor() {
        return color;
    }

    /**
     * Gets the figure.
     *
     * @return the figure
     */
    public Figure getFigure() {
        return figure;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Method to evaluate if two cards have the same power using French Tarot rules.
     *
     * @param playingCard the playing card
     * @return true, if the two cards have the same power
     */
    public boolean hasSamePower(final PlayingCard playingCard) {
        return Objects.equals(figure, playingCard.figure)
                && Objects.equals(color, playingCard.color)
                && Objects.equals(value, playingCard.value);
    }

    /**
     * Returns true if the card is red.
     *
     * @return true if the card is red.
     */
    public boolean isBlack() {
        return CardColor.BLACK.equals(color);
    }

    /**
     * Method to evaluate if this card is more powerful than the card provided as
     * argument.
     *
     * @param playingCard the playing card
     * @return true, if this card is more powerful.
     */
    public boolean isMorePowerful(final PlayingCard playingCard) {
        // Opposite Fool always lose
        if (Objects.equals(Figure.FOOL, playingCard.figure)) {
            return true;
        }
        // Fool always lose
        if (Objects.equals(Figure.FOOL, figure)) {
            return false; // Fool always lose
        } else if (Objects.equals(Figure.ATOUT, figure)) {
            if (Objects.equals(figure, playingCard.figure)) {
                return value > playingCard.value;
            } else {
                return true; // Atout stronger than other cards
            }
        } else if (Objects.equals(Figure.NONE, figure)) {
            // Numbers
            if (Objects.equals(figure, playingCard.figure)) {
                return value > playingCard.value;
            } else {
                if (Objects.equals(Figure.ATOUT, playingCard.figure)) {
                    return false;
                } else {
                    if (Objects.equals(color, playingCard.color)) {
                        return false; // We have knights, king, etc of the same color
                    } else {
                        return true; // Different colors
                    }
                }
            }
        } else {
            // KING, KNIGHT, JACK
            if (Objects.equals(Figure.ATOUT, playingCard.figure)) {
                return false;
            } else if (Objects.equals(Figure.NONE, playingCard.figure)) {
                return true;
            } else {
                // We don't have fool, already treated
                if (!Objects.equals(color, playingCard.color)) {
                    return true;
                } else {
                    if (figure == Figure.KING) {
                        return !playingCard.figure.equals(Figure.KING);
                    } else if (figure == Figure.QUEEN) {
                        return !playingCard.figure.equals(Figure.KING) && !playingCard.figure.equals(Figure.QUEEN);
                    } else if (figure == Figure.KNIGHT) {
                        return playingCard.figure.equals(Figure.JACK);
                    } else if (figure == Figure.JACK) {
                        return false; // Valet always lose
                    } else {
                        return false; // Unlikely
                    }
                }
            }
        }
    }

    /**
     * Returns true if the card is red.
     *
     * @return true if the card is red.
     */
    public boolean isRed() {
        return CardColor.RED.equals(color);
    }

    /**
     * Sets the color.
     *
     * @param color the new color
     */
    public void setColor(final CardColor color) {
        this.color = color;
    }

    /**
     * Sets the figure.
     *
     * @param figure the new figure
     */
    public void setFigure(final Figure figure) {
        this.figure = figure;
    }

    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue(final int value) {
        this.value = value;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PlayingCard [color=" + color + ", figure=" + figure + ", value=" + value + "]";
    }

}
