package lap16_1;

import java.util.Scanner;
//tính tổng các phẩn tử array
public class lap16_1_2 {
    public static void main(String[] args) {
        int a[] = new int[101];
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
