public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte b = 120;
        short s = 32544;
        int i = 212345678;
        long l = 81234567845621L;
        float f = 3.14159f;
        double d = 3.1415926535f;
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
}