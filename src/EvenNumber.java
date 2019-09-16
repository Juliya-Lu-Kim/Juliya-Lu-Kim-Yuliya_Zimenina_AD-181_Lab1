import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int x;
        System.out.println("Введите целое число:");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
            if (x % 2 == 0) {
                System.out.println("Введено чётное число");
            } else {
                System.out.println("Введено нечётное число.");
            }
            }else{
                System.out.println("Ошибка! Введенное число не является целым!");
            }

        }
    }
