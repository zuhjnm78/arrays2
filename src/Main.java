

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {

        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей .");

    }

    public static void task2() {

        System.out.println("Задача 2");

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int maxSalary = arr[0];
        int minSalary = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > maxSalary) {
                maxSalary = arr[index];
            }
            if (arr[index] < minSalary) {
                minSalary = arr[index];

            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary +
                " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей.");

    }

    public static void task3() {

        System.out.println("Задача 3");

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // добавляем число в сумму
        }
        double averageSalary = 0;

            double totalSalary = 0;
            for (int j = 0; j < arr.length; j++) {
                totalSalary += arr[j];
            }
            averageSalary = totalSalary / arr.length;
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей. %n", averageSalary);

        }


    public static void task4() {

        System.out.println("Задача 4");

        char [] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reversFullName.length / 2; i++) {
            char c = reversFullName[i];
            reversFullName[i] = reversFullName[reversFullName.length - 1 - i];
            reversFullName[reversFullName.length - 1 - i] = c;
        }


        System.out.print(reversFullName);
    }
}


