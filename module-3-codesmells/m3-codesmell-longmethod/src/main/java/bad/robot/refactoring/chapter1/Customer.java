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
package bad.robot.refactoring.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String       name;
    private final List<Rental> rentals = new ArrayList<Rental>();

    public Customer(final String name) {
	this.name = name;
    }

    public void addRental(final Rental rental) {
	rentals.add(rental);
    }

    public String getName() {
	return name;
    }

    public String statement() {
	double totalAmount = 0;
	int frequentRenterPoints = 0;

	String result = "Rental record for " + getName() + "\n";
	for (final Rental rental : rentals) {
	    double amount = 0;
	    switch (rental.getMovie().getPriceCode()) {
	    case Movie.REGULAR:
		amount += 2;
		if (rental.getDaysRented() > 2) {
		    amount += (rental.getDaysRented() - 2) * 1.5;
		}
		break;
	    case Movie.NEW_RELEASE:
		amount += rental.getDaysRented() * 3;
		break;
	    case Movie.CHILDREN:
		amount += 1.5;
		if (rental.getDaysRented() > 3) {
		    amount += (rental.getDaysRented() - 3) * 1.5;
		}
		break;
	    }

	    // add frequent renter points
	    frequentRenterPoints++;
	    // add bonus for a two day new release rental
	    if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
		frequentRenterPoints++;
	    }

	    // show figures for this rental
	    result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(amount) + "\n";

	    totalAmount += amount;
	}

	result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
	result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

	return result;
    }
}
