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

import org.apache.commons.lang3.tuple.Pair;

public class TiramisuMachine {

    private Preparation ajouter(final Preparation melangeBlancMousseux, final Ingredient mascarpone) {
	return null;
    }

    private Preparation ajouter(final Preparation blancEnNeige, final Preparation cremeMascarpone) {
	return null;
    }

    private Pair<Ingredient, Ingredient> casserOeufs(final Ingredient eggs) {
	// condition
	return new Pair<Ingredient, Ingredient>() {

	    @Override
	    public Ingredient getLeft() {
		return new Ingredient("jaunes", eggs.getQuantity(), eggs.getUnit());
	    }

	    @Override
	    public Ingredient getRight() {
		return new Ingredient("blancs", eggs.getQuantity(), eggs.getUnit());
	    }

	    @Override
	    public Ingredient setValue(final Ingredient value) {
		return null;
	    }
	};
    }

    private void controlQuantities(final TiramisuIngredients tiramisuIngredients, final int numberOfPeople) {
	// TODO Auto-generated method stub

    }

    private Preparation fouettez(final Ingredient eggs, final Object object) {
	return null;

    }

    private Preparation melanger(final Preparation melangeBlancMousseuxMascarpone) {
	return null;
    }

    private Preparation melangerEnTournant(final Preparation cremeMascarponeBlancNonMel) {
	return null;
    }

    private Preparation monterEnNeige(final Ingredient blancs) {
	return null;
    }

    public void prepare(final TiramisuIngredients tiramisuIngredients, final int numberOfPeople) {
	controlQuantities(tiramisuIngredients, numberOfPeople);
	//
	final Pair<Ingredient, Ingredient> casserOeufs = casserOeufs(tiramisuIngredients.eggs);
	final Ingredient jaunes = casserOeufs.getLeft();
	final Ingredient blancs = casserOeufs.getRight();

	final Preparation oeufsBattus = fouettez(jaunes, null);
	final Preparation melangeBlancMousseux = fouettez(tiramisuIngredients.sucreGlace, oeufsBattus);
	final Preparation melangeBlancMousseuxMascarpone = ajouter(melangeBlancMousseux,
		tiramisuIngredients.mascarpone);
	final Preparation cremeMascarpone = melanger(melangeBlancMousseuxMascarpone);

	final Preparation blancEnNeige = monterEnNeige(blancs);
	final Preparation blancEnNeigeSalés = ajouter(blancEnNeige, tiramisuIngredients.salt);
	final Preparation cremeMascarponeBlancNonMel = ajouter(blancEnNeigeSalés, cremeMascarpone);
	final Preparation cremeMascarponeOeufsMelangee = melangerEnTournant(cremeMascarponeBlancNonMel);

	final Preparation coffee = preparerCafe(tiramisuIngredients.coffee);
	final Preparation coffeeAmaretto = ajouter(coffee, tiramisuIngredients.amaretto);

	final Preparation gateauxCoupés = couper(tiramisuIngredients.biscuits);
	//final Plat plat = preparerPlat(gateauxCoupés);
	//plat.ajouter
	//plat.ajouter
	//plat.ajouter
	//plat.ajouter	


    }

    private Preparation couper(final Ingredient biscuits) {
	return null;
    }

    private Preparation preparerCafe(final Ingredient coffee) {
	return null;
    }

}
