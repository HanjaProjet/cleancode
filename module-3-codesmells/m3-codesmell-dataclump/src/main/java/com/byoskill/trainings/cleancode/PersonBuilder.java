package com.byoskill.trainings.cleancode;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age = 0;
    private String gender = "";
    private String occupation = "";
    private String city = "";

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder withOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    public PersonBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public Person createPerson() {
        return new Person(firstName, lastName, age, gender, occupation, city);
    }
}