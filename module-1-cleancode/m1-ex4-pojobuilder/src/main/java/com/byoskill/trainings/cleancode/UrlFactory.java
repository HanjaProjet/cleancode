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

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A factory for creating Url objects.
 */
public class UrlFactory {

    /**
     * Creates a new Url object.
     *
     * @param protocol the protocol
     * @param host     the host
     * @param page     the page
     * @return the url
     * @throws MalformedURLException the malformed URL exception
     */
    public static URL createUrl(final String protocol, final String host, final String page)
            throws MalformedURLException {
        return new URL(protocol, host, page);
    }
}
