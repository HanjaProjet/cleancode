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

public class Movie {


    private final String title;
    private MovieState state;

    public Movie(final String title, final MovieState price) {
        this.title = title;
        this.state = price;
    }

    public String getTitle() {
        return title;
    }

    public double calculateAmount(int rentalDays) {
        return state.calculateAmount(rentalDays);
    }


    public boolean hasExpired(int daysRented) {
        return state.hasExpired(daysRented);
    }
}
