package com.byoskill.trainings.cleancode;

import java.util.regex.Pattern;

public class Email {

    private static final String NAMEPATTERN = "[A-Za-z\\.]+";

    private String emailAdress;

    public Email(String emailAdress) {
        this.emailAdress = emailAdress;
    }


    public boolean isCorporateEmail() {
        if (this.emailAdress.isEmpty()) {
            return false;
        }
        if (this.emailAdress.trim()
                            .isEmpty()) {
            return false;
        }
        if (!this.emailAdress.contains("@")) {
            return false;
        }
        final String[] emailFragments = this.emailAdress.split("@"); //$NON-NLS-1$
        if (emailFragments.length != 2) {
            return false;
        }
        if (!Pattern.compile(NAMEPATTERN)
                    .matcher(emailFragments[0])
                    .matches()) {
            return false;
        }
        if ("corporate.com".equals(emailFragments[1])) {
            return true;
        }
        return false;
    }

    public boolean isSocialNetworkEmail() {
        if (this.emailAdress.isEmpty()) {
            return false;
        }
        if (this.emailAdress.trim()
                            .isEmpty()) {
            return false;
        }
        if (!this.emailAdress.contains("@")) {
            return false;
        }
        final String[] emailFragments = this.emailAdress.split("@"); //$NON-NLS-1$
        if (emailFragments.length != 2) {
            return false;
        }
        if (!Pattern.compile(NAMEPATTERN)
                    .matcher(emailFragments[0])
                    .matches()) {
            return false;
        }
        if ("facebook.com".equals(emailFragments[1])) {
            return true;
        }
        return false;
    }

    public String getAddress() {
        return this.emailAdress;
    }
}
