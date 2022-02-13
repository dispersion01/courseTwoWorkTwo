package ru.spypro.homework;

public class Hogwarts {
    private String name;
    private String surName;
    private int power;
    private int transgression;

    public Hogwarts(String name, String surName, int power, int transgression) {
        this.name = name;
        this.surName = surName;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", transgression=" + transgression +
                "power=" + power+
        '}';
    }
}
