public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 1;
        while (i <= 10) {
        System.out.print(i++ + " ");
    }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание 2
        int friday = 5;
        for (int day = friday; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3
        int currentYear = 2022;
        int year200YearsBefore = currentYear - 200;
        int year100YearsAfter = currentYear + 100;
        for (i = 0; i % 79 == 0; i = i + 79) {
            if (i >= year200YearsBefore && i <= year100YearsAfter) {
                System.out.println(i);
            }
        }

        //Задание 4
        i = 1;
        for (; i <= 30; i++) {
            System.out.println(i + ":");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            }
            else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            }
            else if (i % 5 ==0) {
                System.out.println(i + ": pong");
            }
        }

        //Задание 5
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " " );
        for (i = 0; i < 8; i++) {
            int c;
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }



    }
}