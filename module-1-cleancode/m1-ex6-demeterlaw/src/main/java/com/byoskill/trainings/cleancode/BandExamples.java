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

import com.neovisionaries.i18n.CountryCode;

public class BandExamples {

    private static Instrument bassGuitar() {
        return new Instrument(InstrumentFamily.CHORDOPHONE, "Bass guitar");
    }

    private static Instrument drums() {
        return new Instrument(InstrumentFamily.MEMBRANOPHONE, "Drums");
    }

    private static Instrument electricGuitar() {
        return new Instrument(InstrumentFamily.CHORDOPHONE, "Electric guitar");
    }

    public static Band getBand1() {
        final Band band = new Band("Metallica");

        final Member james = new Member("James", "Hetfield");
        james.addInstrument(electricGuitar());
        james.addInstrument(voice());
        james.getAddress()
             .setCountry(CountryCode.US);

        final Member lars = new Member("Lars", "Ulrich");
        lars.addInstrument(drums());
        lars.getAddress()
            .setCountry(CountryCode.DK);

        final Member kirk = new Member("Kirk", "Hammett");
        kirk.addInstrument(electricGuitar());
        kirk.getAddress()
            .setCountry(CountryCode.US);

        final Member cliff = new Member("Cliff", "Burton");
        cliff.addInstrument(bassGuitar());
        cliff.getAddress()
             .setCountry(CountryCode.SE);

        band.addMember(james);
        band.addMember(lars);
        band.addMember(cliff);
        band.addMember(kirk);

        return band;
    }

    private static Instrument voice() {
        return new Instrument(InstrumentFamily.VOICE, "Voice");
    }

}
