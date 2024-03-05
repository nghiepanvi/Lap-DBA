package lap16_1;

import java.util.Scanner;
// chèn phần tử x sau phần tử a[k]
public class lap16_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int a[] = new int[101];
        int n = sc.nextInt();
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        for(i = n; i >= k+1; i--){
            a[i] = a[i - 1];
        }
        a[k] = x;
        n++;
        for(i = 0; i < n; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
