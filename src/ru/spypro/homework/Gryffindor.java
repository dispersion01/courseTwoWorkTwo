package ru.spypro.homework;

import java.util.Objects;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor (String name, String surName, int power, int transgression,  int nobility, int honor, int courage) {
        super(name, surName, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Качества: " +
                "Благородство " + nobility +
                ", Честь " + honor +
                ", Храбрость " + courage ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, courage);
    }

    public void twoStudentsFormOneClass(Gryffindor student) {
     if (this.nobility > student.getNobility()) {
         System.out.println(this.getName() + " благороднее чем " + student.getName());
     } else if (this.nobility < student.getNobility()) {
         System.out.println(this.getName() + " менее благородный чем " + student.getName());
     } else {
         System.out.println(this.getName() + " благородство на равне с " + student.getName());
     }
        if (this.honor > student.getHonor()) {
            System.out.println(this.getName() + " доблестнее чем " + student.getName());
        } else if (this.honor < student.getHonor()) {
            System.out.println(this.getName() + " менее доблестный чем " + student.getName());
        } else {
            System.out.println(this.getName() + " честь на равне с " + student.getName());
        }
        if (this.courage > student.getCourage()) {
            System.out.println(this.getName() + " храбрее чем " + student.getName());
        } else if (this.courage < student.getCourage()) {
            System.out.println(this.getName() + " менее храбрый чем" + student.getName());
        } else {
            System.out.println(this.getName() + " храбрость на равне с " + student.getName());
        }
    }
}
