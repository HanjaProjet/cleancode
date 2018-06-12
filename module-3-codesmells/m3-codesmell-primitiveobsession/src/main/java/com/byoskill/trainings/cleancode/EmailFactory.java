package com.byoskill.trainings.cleancode;

public class EmailFactory {



    private static EmailFactory instance;

    public static EmailFactory getInstance() {
        if (instance == null) {
            instance = new EmailFactory();
        }
        return instance;
    }

    public Email createEmailFromStringAddress(String emailAddress) throws EmailNotValidException {
        EmailValidator validator = new EmailValidator( emailAddress);
        validator.validateEmail();
        String localPart = validator.getLocalPart();
        String serverAddressPart = validator.getServerAddressPart();
        return new Email(localPart, serverAddressPart);
    }





}
