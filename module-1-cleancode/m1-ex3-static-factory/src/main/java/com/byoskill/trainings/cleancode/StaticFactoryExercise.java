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

import java.awt.Color;
import java.util.Currency;

/**
 * The Class StaticFactoryExercise is a clean code exercise to learn how to
 * implement static factory methods.
 */
public class StaticFactoryExercise {

    /**
     * The Class Birthdate describes the birth date of an User.
     */
    public static class BirthDate {

	public static class UnknownBirthDate extends BirthDate {
	    public UnknownBirthDate() {
		setYear(0);
		setDay(1);
		setMonth(1);
	    }

	    @Override
	    public String toString() {

		return "Unknown Birth date";
	    }
	}

	public static final BirthDate UNKNOWN = new UnknownBirthDate();

	// @formatter:off
	private int year;
	private int month;
	private int day;

	protected BirthDate() {
	    super();
	}

	public BirthDate(final int day, final int month, final int year) {
	    this.year = year;
	    this.month = month;
	    this.day = day;
	}

	public int getDay() {
	    return day;
	}

	public int getMonth() {
	    return month;
	}

	public int getYear() {
	    return year;
	}

	public void setDay(final int day) {
	    this.day = day;
	}

	public void setMonth(final int month) {
	    this.month = month;
	}

	public void setYear(final int year) {
	    this.year = year;
	}
	// @formatter:on

	@Override
	public String toString() {
	    return "Birthdate [year=" + year + ", \nmonth=" + month + ", \nday=" + day + "]";
	}
    }

    public static class FavoriteColor {
	// @formatter:off
	private final int red;
	private final int blue;
	private final int green;
	// @formatter:on

	public FavoriteColor(final Color predefinedColor) {
	    red = predefinedColor.getRed();
	    blue = predefinedColor.getBlue();
	    green = predefinedColor.getGreen();
	}

	public FavoriteColor(final int red, final int green, final int blue) {
	    this.red = red;
	    this.green = green;
	    this.blue = blue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	    return "FavoriteColor [red=" + red + ", \nblue=" + blue + ", \ngreen=" + green + "]";
	}
    }

    /**
     * The Class Salary.
     */
    public static class Salary {

	// @formatter:off
	private final Currency currency;
	private float	       amount = 0.0f;

	public Salary(final float amount, final Currency currency) {
	    this.amount = amount;
	    this.currency = currency;
	}

	// @formatter:on
	public Salary(final String amount) {
	    this.amount = Float.parseFloat(amount.substring(0, amount.length() - 1));
	    currency = Currency.getInstance("USD");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	    return "Salary [currency=" + currency + ", \namount=" + amount + "]";
	}

    }

    /**
     * The Class User.
     */
    public static class User {
	// @formatter:off
	private final String firstName;

	private final String lastName;
	private final String birthPlace;

	private Salary	      salary;
	private BirthDate     birthDate;
	private FavoriteColor favoriteColor;

	// @formatter:on
	public User(final String firstName, final String lastName) {
	    this(firstName, lastName, "UNKNOWN");
	}

	public User(final String firstName, final String lastName, final String birthPlace) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.birthPlace = birthPlace;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	    return "User [firstName=" + firstName + ", \nlastName=" + lastName + ", \nbirthPlace=" + birthPlace
		    + ", \nsalary=" + salary + ", \nbirthDate="
		    + birthDate
		    + ", \nfavoriteColor=" + favoriteColor + "]";
	}
    }

    public static void main(final String[] args) {
	final User johnWick = new User("John", "Wick");
	johnWick.salary = new Salary("100000$");
	johnWick.favoriteColor = new FavoriteColor(Color.BLACK);
	johnWick.birthDate = BirthDate.UNKNOWN;

	System.out.println("John wick profile : " + johnWick);
	System.out.println();

	final User donaldTrump = new User("Donald", "Trump", "Queens, New York, NY, États-Unis");
	donaldTrump.salary = new Salary(1000000, Currency.getInstance("USD"));
	donaldTrump.favoriteColor = new FavoriteColor(255, 255, 51);
	donaldTrump.birthDate = new BirthDate(14, 06, 1946);
	System.out.println();
	System.out.println("Donald Trump profile : " + donaldTrump);
    }

}
