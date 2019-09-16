import java.util.Scanner;

public class FiveLetterWord {
    public static void main(String[] args) {
        System.out.println("Введите слово из пяти букв:");

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        if (string.length() == 5) {

            System.out.println("Слово палиндром");
        }else{
            System.out.println("Слово не палиндром");
        }

    }
}

