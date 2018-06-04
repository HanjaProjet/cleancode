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

import org.apache.commons.lang3.StringUtils;

public class InsuranceAdvisor {

    private static final int FIXED_PRICE = 1250;

    public HealthOffer evaluateClaim(final HealthCustomerClaim healthCustomerClaim) {
		if (StringUtils.isEmpty(healthCustomerClaim.getFirstName())) {
			throw new InvalidClaimException("Firstname");
		}
		if (StringUtils.isEmpty(healthCustomerClaim.getLastName())) {
			throw new InvalidClaimException("Lastname");
		}
		if (!(healthCustomerClaim.getAge() >= 0 && healthCustomerClaim.getAge() <= 120)) {
			throw new InvalidClaimException("age");
		}
		HealthOffer healthOffer = new HealthOffer(FIXED_PRICE);
		switch (healthCustomerClaim.getHealthState()) {
			case HEALTHY:
				healthOffer = new HealthOffer(FIXED_PRICE * (1.0 - (100 - healthCustomerClaim.getAge()) / 100.0));
		}
		return healthOffer;
	}
}
