package ExerCise13;

import java.util.Scanner;

public class EX13_2 {
    public static int findFirstIndex(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Nhập số nguyên dương n
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Nhập các phần tử của dãy a
        }
        int x = sc.nextInt(); // Nhập số nguyên x

        int result = findFirstIndex(a, x);
        System.out.println(result);

        sc.close();
    }
}
