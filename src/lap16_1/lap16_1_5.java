package lap16_1;

import java.util.Scanner;

public class lap16_1_5 {
    public static void main(String[] args) {
        int a[] = new int [100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = k; i <n; i ++) {
            a[i] = a[i+1];
        }
        n--;
        for(int i = 0; i < n; i ++){
            System.out.print(a[i] + " ");
        }
    }
}
