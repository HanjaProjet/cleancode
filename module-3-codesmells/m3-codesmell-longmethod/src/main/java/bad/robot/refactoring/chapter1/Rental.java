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

public class Rental {

    private final Movie	movie;
    private final int	daysRented;

    public Rental(final Movie movie, final int daysRented) {
	this.movie = movie;
	this.daysRented = daysRented;
    }

    public int getDaysRented() {
	return daysRented;
    }

    public Movie getMovie() {
	return movie;
    }

    public double calculateAmount() {
        return movie.calculateAmount(this.getDaysRented());
    }

    public boolean hasExpired() {

        return movie.hasExpired(daysRented);
    }
}
