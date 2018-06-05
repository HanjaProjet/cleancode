package com.byoskill.trainings.cleancode;

public class UserAccount  {


    private String userFullName;
    private String pseudo;

    public UserAccount(String userFullName, String pseudo) {

        this.userFullName = userFullName;
        this.pseudo = pseudo;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public String getPseudo() {
        return pseudo;
    }
}
