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

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Band.
 */
public class Band {

    /** The members. */
    private List<Member> members = new ArrayList<>();
    private final String name;

    /**
     * Instantiates a new band.
     *
     * @param name
     *            the name
     */
    public Band(final String name) {
	this.name = name;
    }

    /**
     * Adds the member.
     *
     * @param member
     *            the member
     */
    public void addMember(final Member member) {
	members.add(member);
    }

    /**
     * Gets the members.
     *
     * @return the members
     */
    public List<Member> getMembers() {
	return members;
    }

    /**
     * Sets the members.
     *
     * @param members
     *            the new members
     */
    public void setMembers(final List<Member> members) {
	this.members = members;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Band [members=" + members + "]";
    }
}
