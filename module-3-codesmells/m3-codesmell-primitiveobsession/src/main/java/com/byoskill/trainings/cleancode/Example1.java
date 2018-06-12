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

public class Example1 {


    public static void main(final String[] args) {


    }



	public boolean isCorporateEmail(String emailAddress) {
		try {
			Email email = EmailFactory.getInstance()
									  .createEmailFromStringAddress(emailAddress);
			return email.isCorporateEmail();
		} catch (EmailNotValidException e) {
			return false;
		}
	}

	public boolean isSocialNetworkEmail(String emailAddress) {
		try {
			Email email;
			email = EmailFactory.getInstance()
								.createEmailFromStringAddress(emailAddress);
			return email.isSocialNetworkEmail();
		} catch (EmailNotValidException e) {
			return false;
		}
	}
}
