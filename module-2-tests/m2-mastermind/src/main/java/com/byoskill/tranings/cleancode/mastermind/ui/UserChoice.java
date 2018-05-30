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

package com.byoskill.tranings.cleancode.mastermind.ui;

import java.util.function.Function;

/**
 * This class contains the choice of the user for one slot in the mastermind
 * board.
 *
 * @author sleroy
 */
public class UserChoice<T> {

    private T choice;

    private final Function<T, Void> trigger;

    /**
     * Initializes the object and associate its state with a trigger.
     *
     * @param trigger
     *            the trigger
     */
    public UserChoice(final Function<T, Void> trigger) {
	this.trigger = trigger;

    }

    public T getChoice() {
	return choice;
    }

    /**
     * Tests if the ball has a color.
     *
     * @return true if the color has an assigned color
     */
    public boolean hasValue() {
	return this.choice != null;
    }

    private void registerOnModification(final T choice) {
	// Invoking the trigger
	trigger.apply(choice);
    }

    public void setChoice(final T newChoice) {
	if (choice == null || choice.equals(newChoice)) {
	    return;
	}
	choice = newChoice;
	registerOnModification(choice);
    }

}
