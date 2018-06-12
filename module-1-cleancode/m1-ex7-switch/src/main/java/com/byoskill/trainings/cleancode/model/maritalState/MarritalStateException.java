package com.byoskill.trainings.cleancode.model.maritalState;

public class MarritalStateException extends RuntimeException {

    private final String errorCode = "001";

    public MarritalStateException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }
}
