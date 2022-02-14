package ru.spypro.homework;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower ;

    public Slytherin(String name, String surName, int power, int transgression,int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surName, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Качества: " +
                "Хитрость " + cunning +
                ", Решительность " + determination +
                ", Амбициозность " + ambition +
                ", Находчивость " + resourcefulness +
                ", Жажда власти " + lustForPower;
    }
    public void twoStudentsFormOneClass(Slytherin student) {
        if (this.cunning > student.getCunning()) {
            System.out.println(this.getName() + " хитрее чем " + student.getName());
        } else if (this.cunning < student.getCunning()) {
            System.out.println(this.getName() + " бесхитростнее чем" + student.getName());
        } else {
            System.out.println(this.getName() + " одинаково хитрые с " + student.getName());
        }
        if (this.determination > student.getDetermination()) {
            System.out.println(this.getName() + " решительнее чем " + student.getName());
        } else if (this.determination < student.getDetermination()) {
            System.out.println(this.getName() + " не решительный по сравнению с " + student.getName());
        } else {
            System.out.println(this.getName() + " решительность на равне с " + student.getName());
        }
        if (this.ambition > student.getAmbition()) {
            System.out.println(this.getName() + " амбициознее чем " + student.getName());
        } else if (this.ambition < student.getAmbition()) {
            System.out.println(this.getName() + " менее абмициозный чем" + student.getName());
        } else {
            System.out.println(this.getName() + " амбициозность на равне с " + student.getName());
        }
        if (this.resourcefulness > student.getResourcefulness()) {
            System.out.println(this.getName() + " находчивее чем " + student.getName());
        } else if (this.resourcefulness < student.getResourcefulness()) {
            System.out.println(this.getName() + " менее неходчивый чем" + student.getName());
        } else {
            System.out.println(this.getName() + " благородство на равне с " + student.getName());
        }
        if (this.lustForPower > student.getLustForPower()) {
            System.out.println(this.getName() + " властолюбивее чем " + student.getName());
        } else if (this.lustForPower < student.getLustForPower()) {
            System.out.println(this.getName() + " менее властолюбивый чем" + student.getName());
        } else {
            System.out.println(this.getName() + " властолюбие на равне с " + student.getName());
        }
    }
}
