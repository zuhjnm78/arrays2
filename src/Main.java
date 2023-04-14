import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }


    public static void task1() {

        System.out.println("Задача 1");


        int[] book = new int[30];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < book.length; i++) {
            book[i] = random.nextInt(100001) + 100000; // генерируем случайное число от 100000 до 200000
            sum += book[i]; // добавляем число в сумму
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей .");

    }

    public static void task2() {

        System.out.println("Задача 2");

        int[] book = new int[30];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < book.length; i++) {
            book[i] = random.nextInt(100001) + 100000;
            sum += book[i];
        }

        int maxSalary = book[0];
        int minSalary = book[0];
        for (int index = 0; index < book.length; index++) {
            if (book[index] > maxSalary) {
                maxSalary = book[index];
            }
            if (book[index] < minSalary) {
                minSalary = book[index];

            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary +
                " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей.");

    }

    public static void task3() {

        System.out.println("Задача 3");


        int[] book = new int[30];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < book.length; i++) {
            book[i] = random.nextInt(100001) + 100000; // генерируем случайное число от 100000 до 200000
            sum += book[i]; // добавляем число в сумму
        }
        double averageSalary = 0;
        if (book.length > 0) {

            double totalSalary = 0;
            for (int j = 0; j < book.length; j++) {
                totalSalary += book[j];
            }
            averageSalary = totalSalary / book.length;
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей. %n", averageSalary);


        }
    }

    public static void task4() {

        System.out.println("Задача 4");

        char reversFullName[] = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reversFullName.length / 2; i++) {
            char c = reversFullName[i];
            reversFullName[i] = reversFullName[reversFullName.length - 1 - i];
            reversFullName[reversFullName.length - 1 - i] = c;
        }


        System.out.print(reversFullName);
    }
}