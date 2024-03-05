package lap13;
import java.util.Scanner;

public class lap13_2 {
    public static int devideAndConquer(int a[], int l, int r, int x) {
        if (l == r) {
            if (a[l] == x) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int mid = l + (r - l) / 2;
            return devideAndConquer(a, l, mid, x) + devideAndConquer(a, mid + 1, r, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Nhập n
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Nhập a[i]
        }
        int x = sc.nextInt();
        System.out.println(devideAndConquer(a, 0, n - 1, x));
        sc.close();
    }
}

