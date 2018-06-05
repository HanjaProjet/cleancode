package com.byoskill.trainings.cleancode;

public class CityBuilder {
    private String name = "";
    private int population = 0;

    public CityBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CityBuilder withPopulation(int population) {
        this.population = population;
        return this;
    }

    public City createCity() {
        return new City(name, population);
    }
}