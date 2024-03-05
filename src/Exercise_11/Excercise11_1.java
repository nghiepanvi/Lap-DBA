package Exercise_11;

import java.util.Scanner;

public class Excercise11_1 {
    public static boolean isPrime( int n){
        if(n <= 1) return  false;
        for (int i = 2; i <= n-1; i++ ){
            if(n % i ==0) return false;

        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Excercise11_1.isPrime(n));

    }
}