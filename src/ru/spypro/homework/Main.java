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
/*
        System.out.println("Лучший из Грифиндора");
        betterOfGryffindor(gryffindor);
        System.out.println();
        System.out.println("Лучший из Слизерина");
        betterOfSlytherin(slytherin);
        System.out.println();
        System.out.println("Лучший из Когтевран");
        betterOfRavenclaw(ravenclaw);
        System.out.println();
        System.out.println("Сравнение Грифиндора с другими студентами");
        System.out.println();
        System.out.println("Сравнение Слизерина с другими студентами");
        System.out.println();
        System.out.println("Сравнение Когтевран с другими студентами");
*/
//        gryffindor.twoStudentsFormOneClass(gryffindor); ошибка вызова метода из класса Gryffindor

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

/* сравнение объектов внутри одного и того же класса
   вместо этого сравнения добавила метод twoStudentsFormOneClass в каждый их 4х классов/факультетов
    public static void betterOfGryffindor(Gryffindor[] gryffindor) {
        for (int i = 0; i < gryffindor.length; i++) {
            for (int j = 0; j < gryffindor.length; j++) {
                if (j < i) continue;
                if (gryffindor[j].equals(gryffindor[i])) {
                    System.out.println(gryffindor[i]);
                }
            }
        }
    }

    public static void betterOfSlytherin(Slytherin[] slytherin) {
        for (int i = 0; i < slytherin.length; i++) {
            for (int j = 0; j < slytherin.length; j++) {
                if (j < i) continue;
                if (slytherin[j].equals(slytherin[i])) {
                    System.out.println(slytherin[i]);
                }
            }
        }
    }

    public static void betterOfRavenclaw(Ravenclaw[] ravenclaw) {
        for (int i = 0; i < ravenclaw.length; i++) {
            for (int j = 0; j < ravenclaw.length; j++) {
                if (j < i) continue;
                if (ravenclaw[j].equals(ravenclaw[i])) {
                    System.out.println(ravenclaw[i]);
                }
            }
        }
    }
*/

/* сравнение каждого из 4х классов/факультетов сравниваются со всеми студентами содержащимися в Хогвартс
    вместо этих методов добавила метод twoStudentsFormDifferentClass в классе Hogwarts
    public static void bestGryffindor(Hogwarts students, Gryffindor gryffindorStudent) {
        if (students.getPower() > gryffindorStudent.getPower()) {
            System.out.println(students.getName() + " " + "умнее чем" + " " + gryffindorStudent.getName());
        } else {
            System.out.println(gryffindorStudent.getName() + " " + "умнее чем" + " " + students.getName());
        }
    }

    public static void bestOfSlytherin(Hogwarts students, Slytherin slytherinStudent) {
        if (students.getPower() > slytherinStudent.getPower()) {
            System.out.println(students.getName() + " " + "умнее чем" + " " + slytherinStudent.getName());
        } else {
            System.out.println(slytherinStudent.getName() + " " + "умнее чем" + " " + students.getName());
        }
    }

    public static void bestOfRavenclaw(Hogwarts students, Ravenclaw ravenclawStudent) {
        if (students.getPower() > ravenclawStudent.getPower()) {
            System.out.println(students.getName() + " " + "умнее чем" + " " + ravenclawStudent.getName());
        } else {
            System.out.println(ravenclawStudent.getName() + " " + "умнее чем" + " " + students.getName());
        }
    }
*/


}
