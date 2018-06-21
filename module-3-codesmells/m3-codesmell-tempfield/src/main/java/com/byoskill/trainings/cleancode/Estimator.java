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
package com.byoskill.trainings.cleancode;

import java.util.List;
import java.util.stream.Collectors;

public class Estimator {
    private final TimeSpan defaultEstimate;

    public Estimator(final TimeSpan defaultEstimate) {
        this.defaultEstimate = defaultEstimate;
    }


    public TimeSpan CalculateEstimate(final List<TimeSpan> durations) {

        if (durations.size() == 0) {
            return defaultEstimate;
        }

        TimeSpan average = CalculateAverage(durations);
        TimeSpan standardDeviation = CalculateStandardDeviation(durations, average);

        final TimeSpan margin = new TimeSpan(standardDeviation.getDuration() * 3);
        return average.plus(margin);
    }

    private TimeSpan CalculateAverage(final List<TimeSpan> durations) {
        return new TimeSpan(durations.stream()
                                     .collect(Collectors.averagingDouble(TimeSpan::getDuration)));
    }


    private TimeSpan CalculateStandardDeviation(final List<TimeSpan> durations, TimeSpan average) {
        final Double variance = durations.stream()
                                         .collect(Collectors.averagingDouble(ts -> Math.pow(ts.getDuration() - average.getDuration(), 2)));

        return new TimeSpan(Math.sqrt(variance));
    }
}