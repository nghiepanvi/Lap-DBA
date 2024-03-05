package lap16_1;

import java.util.Scanner;
// thay doi gia tri các phan tử trong day so bang binh phuong chinh no
public class lap16_1_3 {
    public static void main(String[] args) {
        int a[] = new int[101];
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            a[i] = a[i]*a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
