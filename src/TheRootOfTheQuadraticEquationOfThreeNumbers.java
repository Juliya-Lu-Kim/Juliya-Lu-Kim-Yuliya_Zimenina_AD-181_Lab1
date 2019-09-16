public class TheRootOfTheQuadraticEquationOfThreeNumbers {
    public static void main(String[] args) {
        float a = 8;
        float b = 15;
        float c = 25;

        double d = (b * b) - (4 * a * c);

        float e = 0;
        float f = 0;

        if (d == 0){
            e = -1 * (b/(2 * a));
            System.out.println("Уравнение имеет один квадратный корень, равный " + e);
        }
        else{
            if(d > 0){
                e = ((-1 * b) + (float) Math.sqrt(d))/(2 * a);
                f = ((-1 * b) - (float) Math.sqrt(d))/ (2 * a);
                System.out.println("Уравнение имеет два квадратных корня, равных " + e + " и " + f);
            }
            else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}
