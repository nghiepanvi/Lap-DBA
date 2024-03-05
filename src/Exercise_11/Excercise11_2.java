package Exercise_11;

import java.util.Scanner;

public class Excercise11_2 {

public static int solve(int n){
        int k = 2;
        int sum = 0;
        while (n > 1) {
        while (n % k == 0) {
        sum += k;
        n /= k;
        }
        k++;
        }
        return sum;
        }
public static int factorSum ( int n ){
        while (n != solve(n))
        n = solve(n);
        return n;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Excercise11_2.factorSum(n));
    }
}
