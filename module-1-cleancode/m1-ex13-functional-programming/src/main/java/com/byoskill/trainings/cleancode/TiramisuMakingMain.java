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

public class TiramisuMakingMain {

    /**
     * http://cuisine.journaldesfemmes.fr/recette/316093-tiramisu
     *
     * @param args
     */
    public static void main(final String[] args) {
        final TiramisuMachine tiramisuMachine = new TiramisuMachine();
        final TiramisuIngredients tiramisuIngredients = new TiramisuIngredients();
        tiramisuMachine.prepare(tiramisuIngredients, 3);
    }

}
