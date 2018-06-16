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

    private final String name;
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

    public String StringStatement() {
        RentalRecordForCustomer rentalRecord = calculateRentalRecord();
        return rentalRecord.getMessageRecordForCustomer(this.getName());
    }

    private RentalRecordForCustomer calculateRentalRecord() {

        RentalRecordForCustomer temp = rentals.stream()
                                              .map(this::createRecordFromRental)
                                              .reduce(RentalRecordForCustomer.NEW_RECORD, RentalRecordForCustomer::addition);
        System.out.println(temp.getMessageRecordForCustomer(this.getName()));
        return temp;

    }

    private RentalRecordForCustomer createRecordFromRental(Rental rental) {

        double amount = rental.calculateAmount();
        int frequentRenterPoints = calculateFrequentRenterPoints(rental);

        return RentalRecordForCustomer.newRentalRecord(frequentRenterPoints, rental.getMovie()
                                                                                   .getTitle(), amount);
    }

    private int calculateFrequentRenterPoints(Rental rental) {
        int frequentRenterPoints = 1;
        frequentRenterPoints = addBonusOf2DaysForNewReleaseDenial(frequentRenterPoints, rental);
        return frequentRenterPoints;
    }

    private int addBonusOf2DaysForNewReleaseDenial(int frequentRenterPoints, Rental rental) {
        if (rental.hasExpired()) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

}
