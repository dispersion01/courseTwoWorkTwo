package ru.spypro.homework;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surName, int power, int transgression, int hardworking, int loyal, int honest) {
        super(name, surName, power, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "Трудолюбие " + hardworking +
                ", Верность " + loyal +
                ", Честность " + honest +
                '}';
    }
    public void twoStudentsFormOneClass(Hufflepuff student) {
        if (this.hardworking > student.getHardworking()) {
            System.out.println(this.getName() + " трудолюбивие чем " + student.getName());
        } else if (this.hardworking < student.getHardworking()) {
            System.out.println(this.getName() + " менее трудолюбивый чем" + student.getName());
        } else {
            System.out.println(this.getName() + " трудолюбие на равне с " + student.getName());
        }
        if (this.loyal > student.getLoyal()) {
            System.out.println(this.getName() + " вернее чем " + student.getName());
        } else if (this.loyal < student.getLoyal()) {
            System.out.println(this.getName() + " менее верный чем" + student.getName());
        } else {
            System.out.println(this.getName() + " верность на равне с " + student.getName());
        }
        if (this.honest > student.getHonest()) {
            System.out.println(this.getName() + " благороднее чем " + student.getName());
        } else if (this.honest < student.getHonest()) {
            System.out.println(this.getName() + " менее благородный чем" + student.getName());
        } else {
            System.out.println(this.getName() + " благородство на равне с " + student.getName());
        }
    }
}
