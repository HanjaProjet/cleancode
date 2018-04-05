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
package com.byoskill.trainings.cleancode.garage;

import org.joda.time.DateTime;

import com.byoskill.trainings.cleancode.garage.data.Customer1;
import com.byoskill.trainings.cleancode.garage.data.Customer2;
import com.byoskill.trainings.cleancode.garage.data.ModernCar1;
import com.byoskill.trainings.cleancode.garage.data.ModernCar2;
import com.byoskill.trainings.cleancode.garage.data.OldCar1;
import com.byoskill.trainings.cleancode.garage.data.OldCar2;
import com.byoskill.trainings.cleancode.garage.data.OldCar3;
import com.byoskill.trainings.cleancode.garage.model.Garage;

public class GarageExample {

    public static void main(final String[] args) {
	final Garage garage = new Garage();

	// Register cars
	final ModernCar1 modernCar1 = new ModernCar1();
	final ModernCar2 modernCar2 = new ModernCar2();
	final OldCar1 oldCar1 = new OldCar1();
	final OldCar2 oldCar2 = new OldCar2();
	final OldCar3 oldCar3 = new OldCar3();
	final Customer1 customer1 = new Customer1();
	final Customer2 customer2 = new Customer2();

	garage.getPark().registerVehicle(modernCar1);
	garage.getPark().registerVehicle(modernCar2);
	garage.getPark().registerVehicle(oldCar1);
	garage.getPark().registerVehicle(oldCar2);
	garage.getPark().registerVehicle(oldCar3);

	garage.getCustomerDatase().registerCustomer(customer1);
	garage.getCustomerDatase().registerCustomer(customer2);

	// Create short leasing (< 1 month)
	garage.getShortTermLeasings().createNewLeasing(modernCar1, customer1, DateTime.now(),
		DateTime.now().plusDays(10));

	// Create invalid short leasing (> 1 month)
	garage.getShortTermLeasings().createNewLeasing(modernCar1, customer1, DateTime.now(),
		DateTime.now().plusMonths(2));
	// Create invalid short leasing (already booked)
	garage.getShortTermLeasings().createNewLeasing(modernCar1, customer1, DateTime.now(),
		DateTime.now().plusDays(10));

	// Create invalid short leasing (customer has already a leasing)
	garage.getShortTermLeasings().createNewLeasing(modernCar2, customer1, DateTime.now(),
		DateTime.now().plusDays(10));

	// Create long leasing (> 1 month)
	garage.getShortTermLeasings().createNewLeasing(modernCar1, customer2, DateTime.now(),
		DateTime.now().plusDays(10));

	// Create invalid long leasing (< 1 month)
	garage.getShortTermLeasings().createNewLeasing(modernCar1, customer2, DateTime.now(),
		DateTime.now().plusMonths(2));

	// Create invalid long leasing (already booked)
	garage.getShortTermLeasings().createNewLeasing(modernCar1, customer2, DateTime.now(),
		DateTime.now().plusDays(10));

	// Create invalid long leasing (customer has already a leasing)
	garage.getShortTermLeasings().createNewLeasing(modernCar2, customer2, DateTime.now(),
		DateTime.now().plusDays(10));
    }
}
