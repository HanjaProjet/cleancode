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
package com.byoskill.trainings.cleancode.model;

public enum PayerType {
    ILLEGAL_IMMIGRANT(0.0), LEGAL_IMMIGRANT(1.0), NATIONAL(1.0), EMBASSY(0), ENEMY_POLITICIAN(1.25), FRIENDLY_POLITICIAN(0.35);

    private double dedution;

    PayerType(double dedution) {
        this.dedution = dedution;
    }

    public double getDedution() {
        return dedution;
    }
}
