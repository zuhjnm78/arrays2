import java.util.Random;

public class Main {

        public static void main(String[] args) {
            task1();
            //task2();
            //task3();
            //task4();

        }


    public static void task1() {


            int[] book = new int[30];
            Random random = new Random();
            int sum = 0;

            for (int i = 0; i < book.length; i++) {
                book[i] = random.nextInt(100001) + 100000; // генерируем случайное число от 100000 до 200000
                sum += book[i]; // добавляем число в сумму
            }

            System.out.println("Сумма трат за месяц составила " + sum + " рублей .") ;

    }

}