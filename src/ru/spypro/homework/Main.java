package ru.spypro.homework;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри", "Поттер", 90, 90, 90, 90, 90),
                new Gryffindor("Гермиона", "Грейнджер", 100, 100, 99, 94, 100),
                new Gryffindor("Рон", "Уизли", 10, 30, 50, 90, 88),
        };
        Slytherin[] slytherin = {
                new Slytherin("Драко", "Малфой", 100, 100, 100, 100, 100, 100, 100),
                new Slytherin("Грэхэм", "Монтегю", 20, 59, 80, 40, 10, 5, 33),
                new Slytherin("Грэхэм", "Монтегю", 3, 56, 30, 9, 40, 30, 50),
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу", "Чанг", 30, 60, 44, 56, 10, 10),
                new Ravenclaw("Маркус", "Белби", 50, 60, 44, 56, 10, 25),
                new Ravenclaw("Падма", "Патил", 60, 44, 56, 10, 60, 30),
        };
        Hogwarts[] hogwarts = {
                new Gryffindor("Гарри", "Поттер", 90, 90, 90, 90, 90),
                new Slytherin("Драко", "Малфой", 100, 100, 100, 100, 100, 100, 100),
                new Ravenclaw("Падма", "Патил", 60, 44, 56, 10, 60, 30),
        };
        System.out.println("Гриффиндор");
        printGryffindor(gryffindor);
        System.out.println();
        System.out.println("Слизерин");
        printSlytherin(slytherin);
        System.out.println();
        System.out.println("Когтевранцы");
        printRavenclaw(ravenclaw);
        System.out.println();
        gryffindor[0].twoStudentsFormOneClass(gryffindor[1]);
        System.out.println();
        ravenclaw[0].twoStudentsFormOneClass(ravenclaw[1]);
        System.out.println();
        slytherin[0].twoStudentsFormOneClass(slytherin[1]);
        System.out.println();
        hogwarts[0].twoStudentsFormDifferentClass(hogwarts[1]);
    }

    public static void printGryffindor(Gryffindor[] gryffindor) {
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindors = gryffindor[i];
            System.out.println("Имя " + gryffindors.getName() +
                    " Фамилия " + gryffindors.getSurName() + "  " + gryffindor[i]);
        }
    }

    public static void printSlytherin(Slytherin[] slytherin) {
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin slytherins = slytherin[i];
            System.out.println("Имя " + slytherins.getName() +
                    " Фамилия " + slytherins.getSurName() + "  " + slytherin[i]);
        }
    }

    public static void printRavenclaw(Ravenclaw[] ravenclaw) {
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw ravenclaws = ravenclaw[i];
            System.out.println("Имя " + ravenclaws.getName() +
                    " Фамилия " + ravenclaws.getSurName() + "  " + ravenclaw[i]);
        }
    }



}
