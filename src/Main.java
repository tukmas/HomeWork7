public class Main {
    public static void main(String[] args) {
// Домащнее задание №1
        System.out.println("Домащнее задание №1");
// Задание 1
System.out.println("Задание 1");
int salary1 = 15000;
int total1 = 0;
int s = 1;
for (;total1 < 2459000; s++){
total1 = total1 + total1/100;
total1 = total1 + salary1;
System.out.println("Месяц " + s + " сумма накоплений равна " + total1 +  "рублей");}
// Задание 2
        System.out.println("Задание 2");
int i1 = 0;
while (i1 < 10) {
i1++;
System.out.print (i1);}
// Задание while
        System.out.println(" while");
int i = 10;
for (; i > 0; i--) {
System.out.print (i);}
// Задание for
        System.out.println(" for");
// Задание 3
        System.out.println("Задание 3");
        int Y = 12_000_000;
        int Y1 = Y / 1000;
        int fertility = Y1 * 17;
        int mortality = Y1 * 8;
        int growth = fertility - mortality;
        int years = 0;
        while (years < 10) {
            years++;
            Y = Y + growth;
            System.out.println("Год " + years + " численность населения составляет "+ Y);}
// Домащнее задание №2
    System.out.println("Домащнее задание №2");
// Задание 1
    System.out.println("Задание 1");
int anInitialFee= 15_000;
int month = 0;
while (anInitialFee <= 12_000_000){
     anInitialFee = anInitialFee + anInitialFee/100*7;
     month++;
            System.out.println("Сумма накоплений на "+ month +" месяц равна " + anInitialFee);}
// Задание 2
        System.out.println("Задание 2");
int anInitialFee1 = 15_000;
int month1 = 0;
while (anInitialFee1 <= 12_000_000){
      anInitialFee1 = anInitialFee1 + anInitialFee1/100*7;
      month1++;
      if (month1 % 6 == 0){
      System.out.println("Сумма накоплений на "+ month1 +" месяц равна " + anInitialFee1);}}
// Задание 3
        System.out.println("Задание 3");
int anInitialFee2 = 15_000;
int year5 = 9;
int month2 = year5 * 12;
int month3 = 0;
while (month3 <= month2){
    anInitialFee2 = anInitialFee2 + anInitialFee2/100*7;
    month3++;
    if (month3 % 6 == 0){
    System.out.println("Сумма накоплений на "+ month3 +" месяц равна " + anInitialFee2);}}
// Задание 4
        System.out.println("Задание 4");
int dayOfTheMonth = 2;
for (dayOfTheMonth = 2; dayOfTheMonth <= 31;dayOfTheMonth = dayOfTheMonth + 7) {
    System.out.println("Сегодня пятница, " + dayOfTheMonth +" -е число. Необходимо подготовить отчет.");}
// Домащнее задание №3
        System.out.println("Домащнее задание №3");
// Задание 1
        System.out.println("Задание 1");
int year11 = 79;
int year10 = 1821;
do { year10++;
    if (year10 % year11 == 0)
    System.out.println(year10);}
while (year10 < 2121);
// Задание 2
        System.out.println("Задание 2");
int t = 1;
int k = 2 * t;
for (t = 1; t <= 10; t++){
    k = 2 * t;
    System.out.println("2*" + t + "=" +k);
}


    }
}