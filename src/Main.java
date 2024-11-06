public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n\n");

        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + "\t");
        }
        System.out.print("\n\n");

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i+=2) {
            System.out.print(i + "\t");
        }
        System.out.print("\n\n");

        System.out.println("Task 4" + "\t");
        for (int i = 10; i >=-10 ; i--) {
            System.out.print(i + "\t");
        }
        System.out.print("\n\n");

        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        System.out.println("Task 6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + "\t");
        }
        System.out.print("\n\n");

        System.out.println("Task 7");
        for (int i = 2; i <= 512; i*=2) {
            System.out.print(i + "\t");
        }
        System.out.print("\n\n");

        System.out.println("Task 8");
        int accumulation = 0;
        for (int i = 1; i <=12; i++) {
            accumulation+=29_000;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, accumulation);
        }
        System.out.print("\n");

        System.out.println("Task 9");
        float accumulation9 = 0.0f;
        for (int i = 1; i <=12; i++) {
            accumulation9 = (float) (accumulation9*1.01 + 29_000);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, accumulation9);
        }
        System.out.print("\n");        

        System.out.println("Task 10");
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("2*%d=%d\n", i, 2*i);
        }
    }
}