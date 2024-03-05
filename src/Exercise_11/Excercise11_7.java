package Exercise_11;

import java.util.Scanner;

import static java.lang.Math.sqrt;

// nhập vào n. tính tổng các ước  nhỏ hơn nó
public class Excercise11_7 {
    public static boolean a[]= new boolean [10000001];
     public static void snt(int n){
        for (int i = 2; i <= n; i++)
            a[i]= true;
        a[0] = a[1] =  false;
        for (int i = 2; i <= sqrt(n); i++)
            if (a[i])
                for (int j = 2 * i; j <= n; j += i)
                    a[j] = false;
    }
    public static int primeSum(int n)
    {
        int mod = 22082018;
        snt(n);
        int d = 0;
        for (int i = 2; i <= n; i++)
            if (a[i]) d = (d + i % mod) % mod;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = primeSum(n);

        System.out.println("Sum of primes less than or equal to " + n + " is: " + result);
    }

}
