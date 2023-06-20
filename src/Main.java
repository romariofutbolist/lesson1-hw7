public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int savesAmount = 15000;
        int total = 0;
        int month = 0;
        int target = 2459000;
        while (total < target) {
            total += savesAmount;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int people = 12000000;
        float fertility = 17 / 1000f;
        float mortality = 8 / 1000f;
        int target = 10;
        int year = 0;
        while (year <= target) {
            System.out.println("Год " + year + ", численность населения составляет " + people);
            float peopleWereBorn = people * fertility;
            float peopleDied = people * mortality;
            people = people + (int) peopleWereBorn - (int) peopleDied;
            year++;
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int savesAmount = 15000;
        int percent = 7;
        int total = 0;
        int month = 0;
        int target = 12000000;
        while (total < target) {
            total = total + total * percent / 100;
            total = total + savesAmount;
            month++;
            System.out.println("Месяц " + month + ": сумма накоплений составляет " + total);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int savesAmount = 15000;
        int percent = 7;
        int total = 0;
        int month = 0;
        int target = 12000000;
        while (total < target) {
            total = total + total * percent / 100;
            total = total + savesAmount;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ": сумма накоплений составляет " + total);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int savesAmount = 15000;
        int percent = 7;
        int total = 0;
        int month = 0;
        int year = 9;
        double totalYear;
        int totalMonth = year * 12;
        while (month <= totalMonth) {
            total = total + total * percent / 100;
            total = total + savesAmount;
            month++;
            if (month % 6 == 0) {
                totalYear = (double) month / 12;
                if (totalYear == 1.0) {
                    System.out.println(totalYear + " год: сумма накоплений составляет " + total);
                } else if (totalYear >= 5.0) {
                    System.out.println(totalYear + " лет: сумма накоплений составляет " + total);
                } else {
                    System.out.println(totalYear + " года: сумма накоплений составляет " + total);
                }
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;
        int daysPerMonth = 31;
        for (; firstFriday <= daysPerMonth; firstFriday +=7) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            }
        }
    public static void task8() {
        System.out.println("Задача 8");
        int cometAppearance = 79;
        int thisYear = 2023;
        int twoHundredYears = thisYear - 200;
        int HundredYears = thisYear + 100;
        for (int i = 0; i <= HundredYears; i = i + cometAppearance) {
            if (i >= twoHundredYears) {
                System.out.println(i);
            }
        }
    }
}
