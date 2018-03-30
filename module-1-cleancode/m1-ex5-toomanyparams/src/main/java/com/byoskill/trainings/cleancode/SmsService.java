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

import java.net.URL;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.twilio.Twilio;

public class SmsService {

    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN  = "your_auth_token";

    private static final Logger LOGGER = LoggerFactory.getLogger(SmsService.class);

    public SmsService() {
	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    }

    /**
     * Send a media sms.
     *
     * @param toInternationalPhoneNumber
     *            the to international phone number
     * @param mediaURLS
     *            the media URLS
     */
    public void sendMediaSms(final String toInternationalPhoneNumber, final List<URL> mediaURLS) {
	LOGGER.info("Sending SMS to the phone number {} and the media {}", toInternationalPhoneNumber, mediaURLS);

	// TODO:: If you are interested you can implement the code using the following
	// instructions
	// TODO:: https://www.twilio.com/docs/libraries/java
	// final Message message = Message.creator(...);
	// System.out.println(message.getSid());

    }

    /**
     * Send a media sms.
     *
     * @param toRegionIndicator
     *            the region indicator
     * @param toPhoneNumber
     *            the phone number
     * @param mediaURLS
     *            the media URLS
     */
    public void sendMediaSms(final String toRegionIndicator, final String toPhoneNumber, final List<URL> mediaURLS) {
	final String internationalPhoneNumber = toRegionIndicator + toPhoneNumber;
	LOGGER.info("Sending SMS to the phone number {} and the media {}", internationalPhoneNumber, mediaURLS);

	// TODO:: If you are interested you can implement the code using the following
	// instructions
	// TODO:: https://www.twilio.com/docs/libraries/java
	// final Message message = Message.creator(...);
	// System.out.println(message.getSid());

    }

    /**
     * Send a media sms.
     *
     * @param toRegionIndicator
     *            the region indicator
     * @param toPhoneNumber
     *            the phone number
     * @param mediaURLS
     *            the media URLS
     */
    public void sendMediaSms(final String fromRegionIndicator, final String fromPhoneNumber,
	    final String toRegionIndicator, final String toPhoneNumber, final List<URL> mediaURLS) {
	final String internationalPhoneNumber = toRegionIndicator + toPhoneNumber;
	LOGGER.info("Sending SMS to the phone number {} and the media {}", internationalPhoneNumber, mediaURLS);

	// TODO:: If you are interested you can implement the code using the following
	// instructions
	// TODO:: https://www.twilio.com/docs/libraries/java
	// final Message message = Message.creator(...);
	// System.out.println(message.getSid());

    }

    /**
     * Send a text sms.
     *
     * @param toInternationalPhoneNumber
     *            the to international phone number
     * @param smsMessage
     *            the sms message
     */
    public void sendTextSms(final String toInternationalPhoneNumber, final String smsMessage) {
	LOGGER.info("Sending SMS to the phone number {} and the message {}", toInternationalPhoneNumber, smsMessage);

	// TODO:: If you are interested you can implement the code using the following
	// instructions
	// TODO:: https://www.twilio.com/docs/libraries/java
	// final Message message = Message.creator(...);
	// System.out.println(message.getSid());

    }

    /**
     * Send a text sms.
     *
     * @param toRegionIndicator
     *            the region indicator
     * @param toPhoneNumber
     *            the phone number
     * @param smsMessage
     *            the sms message
     */
    public void sendTextSms(final String toRegionIndicator, final String toPhoneNumber, final String smsMessage) {
	final String internationalPhoneNumber = toRegionIndicator + toPhoneNumber;
	LOGGER.info("Sending SMS to the phone number {} and the message {}", internationalPhoneNumber, smsMessage);

	// TODO:: If you are interested you can implement the code using the following
	// instructions
	// TODO:: https://www.twilio.com/docs/libraries/java
	// final Message message = Message.creator(...);
	// System.out.println(message.getSid());

    }

    /**
     * Send a text sms.
     *
     * @param fromRegionIndicator
     *            the from region indicator
     * @param fromPhoneNumber
     *            the from phone number
     * @param toRegionIndicator
     *            the region indicator
     * @param toPhoneNumber
     *            the phone number
     * @param smsMessage
     *            the sms message
     */
    public void sendTextSms(final String fromRegionIndicator, final String fromPhoneNumber,
	    final String toRegionIndicator, final String toPhoneNumber, final String smsMessage) {
	final String internationalPhoneNumber = toRegionIndicator + toPhoneNumber;
	LOGGER.info("Sending SMS to the phone number {} and the message {}", internationalPhoneNumber, smsMessage);

	// TODO:: If you are interested you can implement the code using the following
	// instructions
	// TODO:: https://www.twilio.com/docs/libraries/java
	// final Message message = Message.creator(...);
	// System.out.println(message.getSid());

    }
}
