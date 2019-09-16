public class Factorial {
    public static long getFactorial(long n) {
        if (n < 0)
            throw new IllegalArgumentException();
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static void print(int n, int m) {
        for (int i = 1; i <= n; i++) {
            long number = getFactorial(i);
            if (number <= m * i)
                System.out.println(number);
            else
                System.out.println("No");

        }
    }


    public static void main(String[] args) {
        int n = 10;
        int m = 15;

        print(n, m);
    }
}
