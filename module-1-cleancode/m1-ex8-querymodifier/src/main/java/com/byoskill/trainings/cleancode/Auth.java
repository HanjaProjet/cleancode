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

import java.time.LocalDateTime;
import java.util.Arrays;

public class Auth {

    private String username;

    private boolean isAllowed;

    private LocalDateTime connectionTime;

    private int numberOfConnections;

    private String[] rights;

    private String password;

    /**
     * Instantiates a new auth.
     *
     * @param username the username
     */
    public Auth(final String username) {
        this.username = username;
    }

    public LocalDateTime getConnectionTime() {
        return connectionTime;
    }

    public int getNumberOfConnections() {
        return numberOfConnections;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRights() {
        return rights;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(final boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public void setConnectionTime(final LocalDateTime connectionTime) {
        this.connectionTime = connectionTime;
    }

    public void setNumberOfConnections(final int numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setRights(final String... rights) {
        this.rights = rights;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Auth [username=" + username + ", isAllowed=" + isAllowed + ", connectionTime=" + connectionTime
                + ", numberOfConnections=" + numberOfConnections + ", rights=" + Arrays.toString(rights) + ", password="
                + password + "]";
    }

}
