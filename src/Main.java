public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println();
        System.out.println("Задание 1");

        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println();
        System.out.println("Задание 2");

        int temp = 8;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        System.out.println();
        System.out.println("Задание 3");

        int speed = 87;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч то, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + temp + " км/ч то, можно ездить спокойно");
        }

        System.out.println();
        System.out.println("Задание 4");

        int peopleYears = 18;
        if (peopleYears >= 2 && peopleYears <= 6) {
            System.out.println("Если возраст человека равен " + peopleYears + " то ему нужно ходить в детский сад.");
        } else if (peopleYears >= 7 && peopleYears <= 17) {
            System.out.println("Если возраст человека равен " + peopleYears + " то ему нужно ходить в школу.");
        } else if (peopleYears >= 18 && peopleYears <= 24) {
            System.out.println("Если возраст человека равен " + peopleYears + " то его место в университете.");
        } else if (peopleYears > 24) {
            System.out.println("Если возраст человека равен " + peopleYears + " то ему пора ходить на работу.");
        }

        System.out.println();
        System.out.println("Задание 5");

        int childYears = 22;
        if (childYears < 5) {
            System.out.println("Если возраст ребенка равен " + childYears + " то он не может кататься на аттракционе.");
        } else if (childYears >= 5 && childYears <= 14) {
            System.out.println("Если возраст ребенка равен " + childYears + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (childYears > 14) {
            System.out.println("Если возраст ребенка равен " + childYears + " то он может кататься без сопровождения взрослого.");
        }

        System.out.println();
        System.out.println("Задание 6");


        int passengers = 88;
        int placesInTotal = 102;
        int seatingPlaces = 60;
        int standingRoom = placesInTotal - seatingPlaces;
        if (passengers <= seatingPlaces) {
            System.out.println("В вагоне доступны сидячие места");
        } else if (passengers >= seatingPlaces && passengers <= placesInTotal) {
            System.out.println("В вагоне доступны стоячие места");
        } else if (passengers > seatingPlaces && passengers > placesInTotal) {
            System.out.println("Вагон полностью занят");
        }

        System.out.println();
        System.out.println("Задание 7");

        int one = 15;
        int two = 28;
        int three = 22;
        if (one >= two && one >= three){
            System.out.println("Самое большое представленное число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое представленное число " + two);
        } else if (three >= one && three >= two) {
            System.out.println("Самое большое представленное число " + three);
        }

    }
}


