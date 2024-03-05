package Exercise_11;

import java.util.Scanner;
// tính chữ số o tận cùng của n!
public class Excercise11_9 {
    public static  long numberZeroDigits(long n) {
        long d = 0;
        long k = 5;
        while (k < n){
            d +=( n/k);
            k *= 5;

        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long result = (int) Excercise11_9.numberZeroDigits(n);

        System.out.println(  result);
    }
}
