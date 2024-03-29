package Lap15;
import java.io.*;
import java.util.*;

public class Lap15_1 {
    private static Random random = new Random();
// thuật toán quizsort sắp xếp mang n phần tử
    private static int[] partition3(int[] a, int l, int r) {
        int x = a[l];
        int m1 = l;
        int m2 = l;

        for (int i = l + 1; i <= r; i++) {
            if (a[i] < x) {
                m2++;
                swap(a, i, m2);
                swap(a, m1, m2);
                m1++;
            } else if (a[i] == x) {
                m2++;
                swap(a, i, m2);
            }
        }

        int[] m = { m1, m2 };
        return m;
    }
    //  đổi chỗ phần tử
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int partition2(int[] a, int l, int r) {
        int x = a[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (a[i] <= x) {
                j++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[l];
        a[l] = a[j];
        a[j] = t;
        return j;
    }
// sắp xếp phần tử vị trí 1 đến r
    private static void randomizedQuickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int k = random.nextInt(r - l + 1) + l;
        int t = a[l];
        a[l] = a[k];
        a[k] = t;
        //use partition3
        //gọi hàm partiion2
        int m = partition2(a, l, r);
        // gọi đệ quy
        randomizedQuickSort(a, l, m - 1);
        randomizedQuickSort(a, m + 1, r);
    }
 // hàm main nhập các giá trị
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // goi hàm ranzoom
        randomizedQuickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}


