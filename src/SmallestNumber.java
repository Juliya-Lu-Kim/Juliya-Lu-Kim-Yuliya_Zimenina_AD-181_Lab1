import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        System.out.println("Введите три вещественных числа для сравнения.");

        System.out.println("Введите первое число:");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNextFloat()) {
            float x = Math.abs(scanner1.nextFloat());

            System.out.println("Введите второе число:");
            Scanner scanner2 = new Scanner(System.in);
            if (scanner2.hasNextFloat()) {
                float y = Math.abs(scanner2.nextFloat());

                System.out.println("Введите третье число:");
                Scanner scanner3 = new Scanner(System.in);
                if (scanner3.hasNextFloat()) {
                    float z = Math.abs(scanner3.nextFloat());

                    if(x <= y & x <= z)
                        System.out.println("Меньшее число по модулю "+x);
                    if(y < x & y <= z)
                        System.out.println("Меньшее число по модулю "+y);
                    if(z < x & z < y)
                        System.out.println("Меньшее число по модулю "+z);
                }
                else System.out.println("Ошибка. Вы ввели не вещественное число");
            }
            else System.out.println("Ошибка. Вы ввели не вещественное число");
        }
        else System.out.println("Ошибка. Вы ввели не вещественное число");
    }
}