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

import java.util.List;

public class Example2 {

    public static class QueryExecutor {

	public Object executeDelete(final String query, final List<?> parameters) {
	    return executeQuery("DELETE", query, parameters);
	}

	public Object executeInsert(final String query, final List<?> parameters) {
	    return executeQuery("INSERT", query, parameters);
	}

	private Object executeQuery(final String mode, final String query, final List<?> parameters) {
	    return null;
	}

	public Object executeSelect(final String query, final List<?> parameters) {
	    return executeQuery("SELECT", query, parameters);
	}

	public Object executeUpdate(final String query, final List<?> parameters) {
	    return executeQuery("UPDATE", query, parameters);
	}
    }

}
