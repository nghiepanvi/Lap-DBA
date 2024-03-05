package lap16_1;

import java.util.Scanner;
// kiểm tra xem day số có phải dãy số đơn điệu không
public class lap16_1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100001];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean kt1 = true; // kiem tra day tang.
        boolean kt2 = true; // kiem tra day giam.

        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i-1])
                kt1 = false;
            if (a[i] >= a[i-1])
                kt2 = false;
        }

        if (kt1 || kt2)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close(); // Dong Scanner
    }
}
