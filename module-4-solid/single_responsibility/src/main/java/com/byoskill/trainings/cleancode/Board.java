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

import java.util.ArrayList;

/**
 * Created by mrk on 4/7/14.
 */
public class Board {
    ArrayList<PlayerColor> spots;

    public Board() {
        spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            spots.add(PlayerColor.RED);
        }
    }

    public void display() {
        final String formattedFirstRow = spots.get(0) + " | " + spots.get(1) + " | " + spots.get(2) + "\n"
                + spots.get(3) + " | " + spots.get(4) + " | " + spots.get(5) + "\n" + spots.get(6) + " | "
                + spots.get(7) + " | " + spots.get(8);
        System.out.print(formattedFirstRow);
    }

    public ArrayList<PlayerColor> firstRow() {
        final ArrayList<PlayerColor> firstRow = new ArrayList<>();
        firstRow.add(spots.get(0));
        firstRow.add(spots.get(1));
        firstRow.add(spots.get(2));
        return firstRow;
    }

    /**
     * Performs the  action to play.
     *
     * @param x           the x
     * @param y           the y
     * @param playerColor the player color
     */
    public void play(final int x, final int y, final PlayerColor playerColor) {
        spots.set(y * 3 + x, playerColor);
    }

    public ArrayList<PlayerColor> secondRow() {
        final ArrayList<PlayerColor> secondRow = new ArrayList<>();
        secondRow.add(spots.get(3));
        secondRow.add(spots.get(4));
        secondRow.add(spots.get(5));
        return secondRow;
    }

    public ArrayList<PlayerColor> thirdRow() {
        final ArrayList<PlayerColor> thirdRow = new ArrayList<>();
        thirdRow.add(spots.get(6));
        thirdRow.add(spots.get(7));
        thirdRow.add(spots.get(8));
        return thirdRow;
    }
}
