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
package com.byoskill.trainings.cleancode.stubs;

import java.util.List;

public class BillingPlan {

    private static final BillingPlan BASIC_BILLING_PLAN = new BasicBillingPlan();

    public static BillingPlan basic() {

	return BASIC_BILLING_PLAN;
    }

    private List<String> allowedFeatures;

    public BillingPlan() {

    }

    public List<String> getAllowedFeatures() {
	return allowedFeatures;
    }

    public void setAllowedFeatures(List<String> allowedFeatures) {
	this.allowedFeatures = allowedFeatures;
    }

}
