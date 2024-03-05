package lap11;

import java.util.Scanner;

public class FibonacciLastDigit {
    // tính chữ số cuối cùng của fibonaci
    private static int getFibonacciLastDigitNaive(int n) {
        if(n<=1) return n;
        int previous =0;
        int current = 1;
        // gán previous = current, current = revious + current
        //p = 0, c = 1;
        // p = 1, c = 0+1 = 1;
        // p = 1, c = 1+1 = 2
        // p = 2, c = 2+1 = 3;

        for (int i=0; i< n-1; ++i){
            int tmp = previous;
            previous = current;
            current = tmp + current;
        }
        //tim chữ số cuối cùng bằng cách chia 10 lấy phần dư
        return  current %10;
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}
