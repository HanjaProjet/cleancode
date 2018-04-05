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
package com.byoskill.trainings.cleancode.garage.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 * The Class ObjectNotValidException is thrown when an invalid object has been
 * passed through the validator.
 */
public class ObjectNotValidException extends ConstraintViolationException {

    /**
     * Instantiates a new command not valid exception.
     *
     * @param constraintViolations
     *            the constraint violations
     */
    public ObjectNotValidException(final Set<? extends ConstraintViolation<?>> constraintViolations) {
	super(constraintViolations);
    }

    /**
     * Instantiates a new command not valid exception.
     *
     * @param message
     *            the message
     * @param constraintViolations
     *            the constraint violations
     */
    public ObjectNotValidException(final String message,
	    final Set<? extends ConstraintViolation<?>> constraintViolations) {
	super(message, constraintViolations);

    }

    @Override
    public String toString() {
	return "ObjectNotValidException [getConstraintViolations()=" + getConstraintViolations() + ", getMessage()="
		+ getMessage() + "]";
    }

}
