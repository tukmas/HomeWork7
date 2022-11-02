public class Main {
    public static void main(String[] args) {
// Домащнее задание №1
        System.out.println("Домащнее задание №1");
// Задание 1
        System.out.println("Задание 1");
        int salary1 = 15000;
        int total1 = 0;
        int month = 1;
        for (; total1 < 2459000; month++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total1 + "рублей");
        }
// Задание 2
        System.out.println("Задание 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println("\n");
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
// Задание 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRatePerThousand = 17;
        int mortalityRatePerThousand = 8;
        for (int i = 1; i <= 10; i++) {
            int birthRate = birthRatePerThousand * (population / 1000);
            int mortalityRate = mortalityRatePerThousand * (population / 1000);
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
// Домащнее задание №2
            System.out.println("Домащнее задание №2");
// Задание 1
            System.out.println("Задание 1");
            int anInitialFee = 15_000;
            int month99 = 0;
            while (anInitialFee <= 12_000_000) {
                anInitialFee = anInitialFee + anInitialFee / 100 * 7;
                month99++;
                System.out.println("Сумма накоплений на " + month99 + " месяц равна " + anInitialFee);
            }
// Задание 2
            System.out.println("Задание 2");
            int anInitialFee1 = 15_000;
            int month1 = 0;
            while (anInitialFee1 <= 12_000_000) {
                anInitialFee1 = anInitialFee1 + anInitialFee1 / 100 * 7;
                month1++;
                if (month1 % 6 == 0) {
                    System.out.println("Сумма накоплений на " + month1 + " месяц равна " + anInitialFee1);
                }
            }
// Задание 3
            System.out.println("Задание 3");
            int anInitialFee2 = 15_000;
            int year5 = 9;
            int month2 = year5 * 12;
            int month3 = 0;
            while (month3 <= month2) {
                anInitialFee2 = anInitialFee2 + anInitialFee2 / 100 * 7;
                month3++;
                if (month3 % 6 == 0) {
                    System.out.println("Сумма накоплений на " + month3 + " месяц равна " + anInitialFee2);
                }
            }
// Задание 4
            System.out.println("Задание 4");
            int dayOfTheMonth = 2;
            for (dayOfTheMonth = 2; dayOfTheMonth <= 31; dayOfTheMonth = dayOfTheMonth + 7) {
                System.out.println("Сегодня пятница, " + dayOfTheMonth + " -е число. Необходимо подготовить отчет.");
            }
// Домащнее задание №3
            System.out.println("Домащнее задание №3");
// Задание 1
            System.out.println("Задание 1");
            int year11 = 79;
            int year10 = 1821;
            do {
                year10++;
                if (year10 % year11 == 0)
                    System.out.println(year10);
            }
            while (year10 < 2121);
// Задание 2
            System.out.println("Задание 2");
            int t = 1;
            int k = 2 * t;
            for (t = 1; t <= 10; t++) {
                k = 2 * t;
                System.out.println("2*" + t + "=" + k);
            }
        }}}