package com.byoskill.trainings.cleancode;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final String NAMEPATTERN = "[A-Za-z\\.]+";
    private static final String ARROBASE = "@";

    private String emailAddress;

    public EmailValidator(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public void validateEmail() throws EmailNotValidException {
        if (isNotValid()) {
            throw new EmailNotValidException(emailAddress);
        }
    }

    private boolean isNotValid() {
        return !isValid();
    }

    private boolean isValid() {

        return isNotBlanck() && isComposedOfTwoFragment() && isLocalPartValid();
    }

    private boolean isComposedOfTwoFragment() {

        return getEmailFragments().length == 2; //$NON-NLS-1$
    }

    private boolean isNotBlanck() {
        return StringUtils.isNotBlank(emailAddress);
    }

    private boolean isLocalPartValid() {
        return Pattern.compile(NAMEPATTERN)
                      .matcher(getLocalPart())
                      .matches();
    }


    private String[] getEmailFragments() {
        return emailAddress.split(ARROBASE);
    }

    String getLocalPart() {
        return getEmailFragments()[0];
    }

    String getServerAddressPart() {
        return getEmailFragments()[1];
    }

}
