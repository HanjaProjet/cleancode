package com.byoskill.trainings.cleancode;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class Email {

    private static final String SOCIAL_EMAIL = "facebook.com";
    private static final String CORPORATE_EMAIL = "corporate.com";

    private String localPart;
    private String serverAddressPart;

    public Email(String localPart, String serverAddressPart) {
        this.localPart = localPart;
        this.serverAddressPart = serverAddressPart;
    }


    public boolean isCorporateEmail() {
        return IsserverAddressPartEqualTo(CORPORATE_EMAIL);
    }

    public boolean isSocialNetworkEmail() {
        return IsserverAddressPartEqualTo(SOCIAL_EMAIL);
    }

    private boolean IsserverAddressPartEqualTo(String address) {
        return serverAddressPart.equals(address);
    }

}
