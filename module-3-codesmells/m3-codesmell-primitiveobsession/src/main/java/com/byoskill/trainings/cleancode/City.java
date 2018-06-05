package com.byoskill.trainings.cleancode;

public class City {

    private String name;
    private int Population;

    public City(String name, int population) {
        this.name = name;
        Population = population;
    }


    public String getName() {
        return name;
    }

    public int getPopulation() {
        return Population;
    }
}
