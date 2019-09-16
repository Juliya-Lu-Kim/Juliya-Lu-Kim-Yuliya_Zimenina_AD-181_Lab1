import java.util.Scanner;

public class TheSumOfTwoNumbers {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        System.out.println("Введите два целых числа");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");

        if (scanner.hasNextInt()) {
            a = scanner.nextInt();

            System.out.println("Ввведите второе число:");
            Scanner scanner1 = new Scanner(System.in);
            if (scanner1.hasNextInt()) {
                b = scanner1.nextInt();
                c = a + b;

                System.out.println("Сумма введённых чисел равна:" + c);
            }
            else{
                System.out.println("Введённое число не является целым!");
            }
        } else{
            System.out.println("Введённое число не является целым!");
        }
    }
}
