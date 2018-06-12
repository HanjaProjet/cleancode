package com.byoskill.trainings.cleancode;

import java.text.MessageFormat;

public class EmailNotValidException extends Exception {


    public EmailNotValidException(String emailAddress) {
        super(MessageFormat.format("the email address '{}' is not valid", emailAddress));
    }
}
