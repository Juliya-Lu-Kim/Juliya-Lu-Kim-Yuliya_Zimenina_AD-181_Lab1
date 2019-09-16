
public class RandomNumber {
    public static void main(String[] args) {
        int x = (int)(Math.random()* 150 + 1) + 5;

        if (x <= 25||x >= 100){
            System.out.println("Число " + x + " не расположено в интервале (25, 100)");
        }
        else {
            System.out.println("Число " + x + " находится в интервале (25, 100)");
        }
    }
}
