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

import org.junit.Assert;
import org.junit.Test;

public class Example1Test {

    @Test
    public void testIsCorporateEmail() throws Exception {
        final Example1 example1 = new Example1();
        Assert.assertTrue(example1.isCorporateEmail("lynda.martin@corporate.com"));
        Assert.assertFalse(example1.isCorporateEmail("lynda.martin@facebook.com"));
        Assert.assertFalse(example1.isCorporateEmail("@facebook.com"));
        Assert.assertFalse(example1.isCorporateEmail("@corporate.com"));
        Assert.assertFalse(example1.isCorporateEmail(""));
        Assert.assertFalse(example1.isCorporateEmail("lynda.martin@corporate.com "));
        Assert.assertFalse(example1.isCorporateEmail(" lynda.martin@corporate.com"));

    }

    @Test
    public void testIsFacebookEmail() throws Exception {
        final Example1 example1 = new Example1();
        Assert.assertTrue(example1.isSocialNetworkEmail("lynda.martin@facebook.com"));
        Assert.assertFalse(example1.isSocialNetworkEmail("lynda.martin@corporate.com"));
        Assert.assertFalse(example1.isSocialNetworkEmail("@facebook.com"));
        Assert.assertFalse(example1.isSocialNetworkEmail("@corporate.com"));
        Assert.assertFalse(example1.isSocialNetworkEmail("lynda.martin@facebook.com "));
        Assert.assertFalse(example1.isSocialNetworkEmail(" lynda.martin@facebook.com"));

    }

}
