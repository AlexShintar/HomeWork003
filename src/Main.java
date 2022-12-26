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
            int i = 32_768;
            byte b = 21;
            short s = -32768;
            long l = 999_999_999_999L;
            float f = 3.141_592_653_5f; //убедился что значимы 7 знаков, сработало округление
            double d = 3.141_592_653_5;
            System.out.println("Значение переменной i с типом int равно "+ i);
            System.out.println("Значение переменной b с типом byte равно "+ b);
            System.out.println("Значение переменной s с типом short равно "+ s);
            System.out.println("Значение переменной l с типом long равно "+ l);
            System.out.println("Значение переменной f с типом float равно "+ f);
            System.out.println("Значение переменной d с типом double равно "+ d);

    }
    public static void task2 () {
        System.out.println("\nЗадача 2");
            float a = 27.12f;
            long b = 987_678_965_549L;
            float c = 2.786f;
            short d = 569;
            short e = -159;
            short f = 27_897;
            byte g = 67;
            //System.out.println(a);System.out.println(b);System.out.println(c);System.out.println(d);
            //System.out.println(e);System.out.println(f);System.out.println(g);
    }
    public static void task3 () {
        System.out.println("\nЗадача 3");
            byte teacher_LP = 23, teacher_AS = 27, teacher_EA = 30;
            short sheetsOfPaper = 480;
            System.out.println("На каждого ученика рассчитано "+(sheetsOfPaper/(teacher_AS+teacher_EA+teacher_LP))+" листов бумаги");
    }
    public static void task4 () {
        System.out.println("\nЗадача 4");
        byte machinePerformance = 16 / 2; //бутылок за минуту
        int fewMinutePerformance = 20 * machinePerformance;
        int oneDayPerformance = 24 * 60 * machinePerformance;
        int fewDayPerformance = 3 * oneDayPerformance;
        int monthPerformance = 30 * oneDayPerformance;
        System.out.println("За 20 минут машина произвела " + fewMinutePerformance + " штук бутылок");
        System.out.println("За сутки машина произвела "+ oneDayPerformance + " штук бутылок");
        System.out.println("За 3 дня машина произвела "+ fewDayPerformance + " штук бутылок");
        System.out.println("За 1 месяц машина произвела "+ monthPerformance + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("\nЗадача 5");
        byte totalPaintCans = 120, whiteCans = 2, brownCans = 4;
        int totalClasses, totalWhiteCans, totalBrownCans;
        totalClasses = totalPaintCans / (whiteCans + brownCans);
        totalWhiteCans = whiteCans * totalClasses;
        totalBrownCans = brownCans * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и "
                + totalBrownCans + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("\nЗадача 6");
        int banana = 5 * 80, iceCream = 2 * 100, eggs = 4 * 70, milk = 200 * 105 / 100, breakfast;
        breakfast = banana + milk + iceCream + eggs;
        System.out.println(breakfast + " грамм");
        float breakfastKg = breakfast / 1000f;
        System.out.println(breakfastKg + " кг.");
    }
    public static void task7 () {
        System.out.println("\nЗадача 7");
            int mastDropped = 7, dayLow, dayHigh, dayAverage;
            int lossLow = 250, lossHigh = 500;
            dayLow = mastDropped * 1000 / lossLow;
            dayHigh = mastDropped * 1000 / lossHigh;
            dayAverage = (dayLow + dayHigh) / 2;
        System.out.println(dayLow);
        System.out.println(dayHigh);
        System.out.println(dayAverage);
    }
    public static void task8 () {
        System.out.println("\nЗадача 8");
        int salaryMasha = 67760, salaryDenis = 83690, salaryKristina = 76230;
        float newSalaryMasha = salaryMasha * 1.1f, newSalaryDenis = salaryDenis * 1.1f, newSalaryKristina = salaryKristina * 1.1f;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newSalaryMasha - salaryMasha) * 12 + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryDenis - salaryDenis) * 12 + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (newSalaryKristina - salaryKristina) * 12 + " рублей");
    }
}