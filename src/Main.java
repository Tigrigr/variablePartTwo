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

    public static void task1 () {
        System.out.println("Задача 1");
        byte b = 120;
        short s = 32544;
        int i = 212345678;
        long l = 81234567845621L;
        float f = 3.14159f;
        double d = 3.1415926535f;   // Почему в консоль выводится 3.1415927410125732
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }
    public static void task2 () {
        System.out.println();
        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        float f2 = 2.786f;
        short s = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b = 67;
        System.out.println(f);
        System.out.println(l);
        System.out.println(f2);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(b);
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherThree = 30;
        short papers = 480;
        System.out.println("На каждого ученика рассчитано " + (papers/(teacherOne+teacherTwo+teacherThree)) + " листов бумаги");
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача 4");
        byte bottlePerMin = 16/2;
        short minPerDay = 24 * 60;
        short minPerThreeDay = 72 * 60;
        int minPerMonth = (31*24) * 60;
        int bottlePerDay = bottlePerMin * minPerDay;  // Почему нельзя переменную short?
        int bottlePerThreeDay = bottlePerMin * minPerThreeDay; // Сколько памяти будет использовано при такой записи int bottlePerThreeDay = (short)bottlePerMin * minPerThreeDay;
        int bottlePerMonth = bottlePerMin * minPerMonth;
        System.out.println("За 20 минут машина произвела " + (bottlePerMin * 20) + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlePerDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottlePerThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println();
        System.out.println("Задача 5");
        byte paintTotal = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int classesTotal = paintTotal/(whitePerClass+brownPerClass);
        int whitePaint = classesTotal * whitePerClass;
        int brownPaint = classesTotal * brownPerClass;
        System.out.println("В школе, где " + classesTotal + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println();
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte bananaTotal = 5;
        float milkWeightFloat = 100/105f; // Как ограничивать float на количество знаков?
        short milkTotal = 200;
        short iceCrWeight = 100;
        short iceCrTotal = 2;
        byte eggWeight = 70;
        byte eggTotal = 4;
        float totalWeight = (bananaWeight*bananaTotal)+(milkWeightFloat*milkTotal)+(iceCrWeight*iceCrTotal)+(eggWeight*eggTotal);
        float totalWeightKg = totalWeight/1000;
        System.out.println(totalWeight + " грамм"); // как форматировать вывод, чтобы float показывал нужное мне количество знаков
        System.out.println(totalWeightKg + " килограмм");
    }

    public static void task7 () {
        System.out.println();
        System.out.println("Задача 7");
        short targetWeight = 7000;
        short weightLossEasy = 250;
        short weightLossHard = 500;
        int daysEasy = targetWeight/weightLossEasy;
        int daysHard = targetWeight/weightLossHard;
        int averageDays = (daysEasy + daysHard)/2;
        System.out.println(daysEasy + " дней потребуется спортсмену, если он будет худеть на 250г в день.");
        System.out.println(daysHard + " дней потребуется спортсмену, если он будет худеть на 500г в день.");
        System.out.println(averageDays + " среднее количество дней, которое потребуется спортсмену.");
    }
    public static void task8 () {
        System.out.println();
        System.out.println("Задача 8");
        int moneyMasha = 67760;
        int moneyDenis = 83690;
        int moneyKris = 76230;
        float upPercent = 0.1f;
        int yearMasha = moneyMasha*12;
        int yearDenis = moneyDenis*12;
        int yearKris = moneyKris*12;
        float newMoneyMasha = (moneyMasha*upPercent) + moneyMasha;
        float newMoneyDenis = (moneyDenis*upPercent) + moneyDenis;
        float newMoneyKris = (moneyKris*upPercent) + moneyKris;
        float newYearMasha = newMoneyMasha*12;
        float newYearDenis = newMoneyDenis*12;
        float newYearKris = newMoneyKris*12;

        System.out.println("Маша теперь получает " + newMoneyMasha + " рублей. Годовой доход вырос на " + (newYearMasha - yearMasha) + " рублей");
        System.out.println("Денис теперь получает " + newMoneyDenis + " рублей. Годовой доход вырос на " + (newYearDenis - yearDenis) + " рублей");
        System.out.println("Кристина теперь получает " + newMoneyKris + " рублей. Годовой доход вырос на " + (newYearKris - yearKris) + " рублей");

    }
}