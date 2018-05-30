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

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Created by mrk on 4/7/14.
 */
public class BoardTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testBoardHasNineSpots() {
        final Board board = new Board();
        assertEquals(9, board.spots.size());
    }

    @Test
    public void testBoardReturnsFirstRow() {
        final Board board = new Board();
        final ArrayList<PlayerColor> rowOne = new ArrayList<>();
        rowOne.add(PlayerColor.RED);
        rowOne.add(PlayerColor.RED);
        rowOne.add(PlayerColor.RED);

        assertEquals(rowOne, board.firstRow());
    }

    @Test
    public void testBoardReturnsSecondRow() {
        final Board board = new Board();
        final ArrayList<PlayerColor> rowTwo = new ArrayList<>();
        rowTwo.add(PlayerColor.RED);
        rowTwo.add(PlayerColor.RED);
        rowTwo.add(PlayerColor.RED);

        assertEquals(rowTwo, board.secondRow());
    }

    @Test
    public void testBoardReturnsThirdRow() {
        final Board board = new Board();
        final ArrayList<PlayerColor> rowThree = new ArrayList<>();
        rowThree.add(PlayerColor.RED);
        rowThree.add(PlayerColor.RED);
        rowThree.add(PlayerColor.RED);

        assertEquals(rowThree, board.thirdRow());
    }

    @Test
    public void testPlay() throws Exception {
        final Board board = new Board();
        board.play(0, 0, PlayerColor.RED);
        board.play(1, 0, PlayerColor.RED);
        board.play(2, 0, PlayerColor.RED);
        board.play(0, 1, PlayerColor.BLACK);
        board.play(1, 1, PlayerColor.BLACK);
        board.play(2, 1, PlayerColor.BLACK);
        board.play(0, 2, PlayerColor.RED);
        board.play(1, 2, PlayerColor.RED);
        board.play(2, 2, PlayerColor.RED);

        final List<PlayerColor> redColor = new ArrayList<>();
        redColor.add(PlayerColor.RED);
        redColor.add(PlayerColor.RED);
        redColor.add(PlayerColor.RED);

        final List<PlayerColor> blackColor = new ArrayList<>();
        blackColor.add(PlayerColor.BLACK);
        blackColor.add(PlayerColor.BLACK);
        blackColor.add(PlayerColor.BLACK);

        assertEquals(board.firstRow(), redColor);
        assertEquals(board.secondRow(), blackColor);
        assertEquals(board.thirdRow(), redColor);
    }

    @Test
    public void testPrintsBoardToConsole() {
        final Board board = new Board();
        System.setOut(new PrintStream(outContent));
        board.display();
        assertEquals("RED | RED | RED\nRED | RED | RED\nRED | RED | RED", outContent.toString());
    }
}
