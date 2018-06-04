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

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

public class BankAccountScenario extends JUnitStory {

    // Here we specify the steps classes
    @Override
    public List<CandidateSteps> candidateSteps() {
        // varargs, can have more that one steps classes
        return new InstanceStepsFactory(configuration(), new BankAccountStep()).createCandidateSteps();
    }

    // Here we specify the configuration, starting from default
    // MostUsefulConfiguration, and changing only what is needed
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                // where to find the stories
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                // CONSOLE and TXT reporting
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats()
                                                                   .withFormats(
                                                                           StoryReporterBuilder.Format.CONSOLE, StoryReporterBuilder.Format.TXT,
                                                                           StoryReporterBuilder.Format.HTML, StoryReporterBuilder.Format.XML));
    }

    //
}