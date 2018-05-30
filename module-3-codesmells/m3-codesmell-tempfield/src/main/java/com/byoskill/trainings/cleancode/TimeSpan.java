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

/**
 * The Class TimeSpan represents a duration in seconds.
 */
public class TimeSpan {

    private final double duration;

    public TimeSpan(final double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public TimeSpan plus(final TimeSpan margin) {

        return new TimeSpan(duration + margin.getDuration());
    }

}
