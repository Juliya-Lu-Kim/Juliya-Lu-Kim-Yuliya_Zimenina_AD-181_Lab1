public class TheNumberClosetsToTen {
    public static void main(String[] args) {
        int x = 10;
        double n = 8.5;
        double m = 11.45;

        double y = Math.abs(x - n);
        double z = Math.abs(x - m);

        if (y == z){
            System.out.println("Числа " + n  + " и " + m + " равноудалены от " + x);
        }

        if (y > z){
            System.out.println("Число " + m + " ближе " + x);
        }

        if (y < z){
            System.out.println("Числа " + n + " ближе " + x);
        }


    }
}
