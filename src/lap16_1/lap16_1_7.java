package lap16_1;

import java.util.Scanner;
// đếm số lần xuất hiện của phần tử
public class lap16_1_7 {
    public static void main (String[] args ) {
        int a[] = new int[100001];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int Max = a[0];
        for(int i = 0; i < n; i ++) {
            if(a[i] > Max){
                Max = a[i];
            }
        }
        int b[] = new int [1001];
        for(int i = 0; i <= Max; i ++){
            b[i] =0;
        }
        for(int i = 0; i < n; i ++){
            b[a[i]] += 1;
        }
        for(int i = 0; i <= Max; i ++){
            if(b[i] >0) {
                System.out.print(i + " - " + b[i]+ "; ");
            }
        }

    }
}
