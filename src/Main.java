// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
        System.out.println("Задание 1");
        int accumulation = 0;
        int accumulationPerMounth = 15_000;
        int month = 0;
        while (accumulation < 2_459_000) {
            accumulation = accumulation + accumulationPerMounth;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        while (number > 0) {
            System.out.print(number + " ");
            number--;
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            year++;
            int fertility = population * 17 / 1000;
            int mortality = population * 8 / 1000;
            population = population + fertility - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        int total = 15_000;
        int percent = 7;
        int month = 0;
        while (total < 12_000_000) {
            total = total + total * percent / 100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int total = 15_000;
        int percent = 7;
        int month = 0;
        while (total <= 12_000_000) {
            total = total + total * percent / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
            }
        }
    }
    public static void task6() {
        System.out.println("Задание 6");
        int total = 15_000;
        int percent = 7;
        int month = 0;
        int monthPerYear = 12; // Переменная, содержащая количество месяцев в году, вдруг Василий копит во время покорения Марса.
        int year = 9;
        while (month <= monthPerYear * year) {
            total = total + total * percent / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
            }
        }
    }
    public static void task7() {
        System.out.println("Задание 7");
        int friday = 4;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7; // дополнительные проверки условий избыточны, если по условиям мы четко знаем число первой пятницы месяца
        }
    }
    public static void task8() {
        System.out.println("Задание 8");
        int currentYear = 2023;
        int pastYear = currentYear - 200; // Этот же год берем начальной точкой отсчета.
        int futureYear = currentYear + 100;
        while (pastYear <= futureYear) {
            if (pastYear % 79 == 0) {
                System.out.println(pastYear);
            }
            pastYear++;
        }

    }
}