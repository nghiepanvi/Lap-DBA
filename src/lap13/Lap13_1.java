package lap13;

import java.util.Scanner;
// tìm chỉ mục các phần tử bằng nhau 2 dãy số
public class Lap13_1 {
    //binary search: Tìm chỉ mục của các phần tử dãy số m trên dãy n
    static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length - 1;   // Điều chỉnh chỉ số kết thúc mảng

        while (left <= right) {     // Xử lý vòng lặp cho đến khi left > right
            int mid = left + (right - left) / 2;   // Tìm chỉ số giữa của mảng

            if (a[mid] == x) {
                return mid;     // Trả về chỉ số mid nếu tìm thấy x
            } else if (a[mid] < x) {
                left = mid + 1;     // Nếu x lớn hơn phần tử giữa, tìm kiếm nửa phải của mảng
            } else {
                right = mid - 1;    // Nếu x nhỏ hơn phần tử giữa, tìm kiếm nửa trái của mảng
            }
        }
        return -1;
    }

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
           // System.out.print(linearSearch(a, b[i]) + " ");
            System.out.print(binarySearch(a, b[i]) + " ");
        }
    }
}


