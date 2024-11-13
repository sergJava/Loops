public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        float accumulation = 0.0f;
        int month = 1;
        while (accumulation < 2_459_000) {
            accumulation = (float) (accumulation * 1.01 + 15_000);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", month, accumulation);
            month++;
        }
        System.out.println("\n");


        System.out.println("Task 2");

        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        for (; count >= 1; count--) {
            if (count > 10) {
                continue;
            }
            System.out.print(count + " ");
        }
        System.out.println("\n");

        System.out.println("Task 3");

        int people = 12_000_000;
        float fertility = (float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        float different = fertility - mortality;
        for (int year = 1; year <= 10; year++) {
            people = people + (int)(people * different);
            System.out.printf("Год %d, численность населения составляет %d\n", year, people);
        }
        System.out.println("\n");


        System.out.println("Task 4");

        float accumulation4 = 15_000.0f;
        int month4 = 1;
        while (accumulation4 < 12_000_000.0f) {
            accumulation4 *= 1.07;
            System.out.printf("Месяц %d, сумма вклада %.2f\n", month4, accumulation4);
            if (accumulation4 > 12_000_000) {
                continue;
            }
            month4++;
        }
        System.out.printf("\nВасилию нужно %d месяцев чтобы накопить больше 12 000 000 рублей\n\n", month4);


        System.out.println("Task 5");

        float accumulation5 = 15_000.0f;
        int month5 = 1;
        while (accumulation5 < 12_000_000.0f) {
            accumulation5 *= 1.07;
            if (month5 % 6 == 0) {
                System.out.printf("Месяц %d, сумма вклада %.2f\n", month5, accumulation5);
            }
            month5++;
        }
        System.out.println();


        System.out.println("Task 6");

        float accumulation6 = 15_000.0f;
        int month6 = 1;
        int depositPeriod = 12 * 9;
        int numberOfHalfYear = 1;
        for (; month6 <= depositPeriod; month6++) {
            accumulation6 *= 1.07;
            if (month6 % 6 == 0) {
                System.out.printf("полугодие %d, сумма вклада %.2f\n", numberOfHalfYear, accumulation6);
                numberOfHalfYear++;
            }
        }
        System.out.println();


        System.out.println("Task 7");

        int numberOfFirstFriday = 3;
        int numberOfDayOfMonth = numberOfFirstFriday;
//        for (; numberOfDayOfMonth <= 31; numberOfDayOfMonth++) {
        while (numberOfDayOfMonth <= 31) {
            System.out.printf("Сегодня пятница, %d-е число. Небходимо подготовить отчет.\n", numberOfDayOfMonth);
            numberOfDayOfMonth += 7;
        }
        System.out.println();


        System.out.println("Task 8");

        int actuallyYear = 2024;
        int previousPeriod = actuallyYear - 200;
        int nextPeriod = actuallyYear + 100;
        int yearOfComet = 0;
        while (yearOfComet <= nextPeriod) {
            yearOfComet+=79;
            if (yearOfComet >= previousPeriod && yearOfComet <= nextPeriod) {
                System.out.println(yearOfComet);
            }
        }

    }
}