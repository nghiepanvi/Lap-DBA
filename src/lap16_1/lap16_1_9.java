package lap16_1;
import java.util.Scanner;
// nhập n
// nhao a[] n phan tu
// nham m
// nhap b [] n phan tử
// tra ve c[] có các phần tử m+ n tăng dan
public class lap16_1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100001];
        int b[] = new int[100001];
        int c[] = new int[200002]; // Tăng kích thước mảng "c" để chứa tối đa 200002 phần tử
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int size = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[size] = a[i];
                size = size + 1;
                i = i + 1;
            } else if (a[i] > b[j]) {
                c[size] = b[j];
                size = size + 1;
                j = j + 1;
            } else { // Phần này được thêm vào để xử lý trường hợp phần tử trùng nhau
                c[size] = a[i];
                size = size + 1;
                c[size] = b[j];
                size = size + 1;
                i = i + 1;
                j = j + 1;
            }
        }

        // Sau khi xử lý đúng 3 trường hợp: (a[i] < b[j]), (a[i] > b[j]), và (a[i] = b[j])
        // cần kiểm tra các phần tử còn lại trong mảng a và b
        while (i < n) {
            c[size] = a[i];
            size = size + 1;
            i = i + 1;
        }

        while (j < m) {
            c[size] = b[j];
            size = size + 1;
            j = j + 1;
        }

        for (int k = 0; k < size; k++) {
            System.out.print(c[k] + " ");
        }
    }
}