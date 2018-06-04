package com.byoskill.trainings.cleancode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodeChallengeTest {

    @Test
    public void treatString() {

        String message = CodeChallenge.reverseString("hello");

        assertEquals("olleh", message);
    }


}