package com.byoskill.trainings.cleancode;

public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String gender;
    private String occupation;
    private String city;

    public Person(String firstName, String lastName, Integer age, String gender, String occupation, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.city = city;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getCity() {
        return city;
    }

    public boolean hasIdNotValid() {
        return firstName.isEmpty() || lastName.isEmpty();
    }
}
