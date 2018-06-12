package com.byoskill.trainings.cleancode;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class Email {

    private static final String NAMEPATTERN = "[A-Za-z\\.]+";
    private static final String SOCIAL_EMAIL = "facebook.com";
    private static final String CORPORATE_EMAIL = "corporate.com";
    private static final String ARROBASE = "@";

    private String emailAdress;

    public Email(String emailAdress) {
        this.emailAdress = emailAdress;
    }


    public boolean isCorporateEmail() {
        return isValid() && IsserverAddressPartEqualTo(CORPORATE_EMAIL);
    }

    public boolean isSocialNetworkEmail() {
        return isValid() && IsserverAddressPartEqualTo(SOCIAL_EMAIL);
    }

    private boolean IsserverAddressPartEqualTo(String address) {
        return getServerAddressPart().equals(address);
    }

    private boolean isValid() {

        return isNotBlanck() && isComposedOfTwoFragment() && isLocalPartValid();
    }

    private boolean isComposedOfTwoFragment() {

        return getEmailFragments().length == 2; //$NON-NLS-1$
    }

    private boolean isNotBlanck() {
        return StringUtils.isNotBlank(emailAdress);
    }

    private boolean isLocalPartValid() {
        return Pattern.compile(NAMEPATTERN)
                      .matcher(getLocalPart())
                      .matches();
    }

    private String getLocalPart() {
        return getEmailFragments()[0];
    }

    private String getServerAddressPart() {
        return getEmailFragments()[1];
    }


    private String[] getEmailFragments() {
        return this.emailAdress.split(ARROBASE);
    }


}
