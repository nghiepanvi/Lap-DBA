package lap11;

import java.util.Scanner;
public class Fibonacci {
    //Tính dãy số fibonaci. input n. out put. values of f(n)
  private  static long calc_fib(int n){
      if(n<=1) return n;
      //call function recusiver n
      return calc_fib(n-1) + calc_fib(n-2);
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
