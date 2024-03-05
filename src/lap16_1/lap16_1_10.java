package lap16_1;

import java.util.Scanner;

public class lap16_1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[100][100];
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }
}
