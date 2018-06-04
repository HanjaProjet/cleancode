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
package com.byoskill.trainings.cleancode.bank.model;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccountStep {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccountStep.class);

    @When("I toggle the cell at ($column, $row)")
    public void iToggleTheCellAt(final int column, final int row) {
        //
        LOGGER.info("Column={} row={}", column, row);
    }

    @Given("a $width by $height game")
    @Aliases(values = {"a new game: $width by $height"})
    public void theGameIsRunning(final int width, final int height) {
        //
        LOGGER.info("Width={} height={}", width, height);
    }

    @Then("the grid should look like $grid")
    @Aliases(values = {"the grid should be $grid"})
    public void theGridShouldLookLike(final String grid) {
        //
        LOGGER.info("Grid={}", grid);
    }
}
