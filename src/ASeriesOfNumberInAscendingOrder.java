public class ASeriesOfNumberInAscendingOrder {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 1;

        System.out.println("Число переменной а = " + a + ", число переменной b = " + b + ", число переменной c = " + c);

        if(a < b && a < c && b < c) {
            System.out.println(a + ", " + b + ", " + c);
        }else if (b < a && b < c && a < c){
            System.out.println(b + ", " + a + ", " + c);
        }else if (c < a && c < b && a < b){
           System.out.println(c + ", " + a + ", " + b);
       }
        else if (c < a && c < b && b < a){
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
