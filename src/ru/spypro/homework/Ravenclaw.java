package ru.spypro.homework;

public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surName, int power, int transgression,int smart, int wise, int witty, int creative) {
        super(name, surName, power, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Качества: " +
                "Ум " + smart +
                ", Мудрость " + wise +
                ", Остроумие " + witty +
                ", Креативность " + creative ;
    }
    public void twoStudentsFormOneClass(Ravenclaw student) {
        if (this.smart > student.getSmart()) {
            System.out.println(this.getName() + " умнее чем " + student.getName());
        } else if (this.smart < student.getSmart()) {
            System.out.println(this.getName() + " глупее чем" + student.getName());
        } else {
            System.out.println(this.getName() + " ум на равне с " + student.getName());
        }
        if (this.wise > student.getWise()) {
            System.out.println(this.getName() + " удрее чем " + student.getName());
        } else if (this.wise < student.getWise()) {
            System.out.println(this.getName() + " менее мудрый чем" + student.getName());
        } else {
            System.out.println(this.getName() + " мудрость на равне с " + student.getName());
        }
        if (this.witty > student.getWitty()) {
            System.out.println(this.getName() + " остроумие чем " + student.getName());
        } else if (this.witty < student.getWitty()) {
            System.out.println(this.getName() + " менее остроумный чем" + student.getName());
        } else {
            System.out.println(this.getName() + " остроумие на равне с " + student.getName());
        }
        if (this.creative > student.getCreative()) {
            System.out.println(this.getName() + " креативнее чем " + student.getName());
        } else if (this.creative < student.getCreative()) {
            System.out.println(this.getName() + " менее креативный чем" + student.getName());
        } else {
            System.out.println(this.getName() + " креативность на равне с " + student.getName());
        }
    }
}
