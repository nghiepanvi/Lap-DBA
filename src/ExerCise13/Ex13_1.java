package ExerCise13;

import java.util.Scanner;

public class Ex13_1 {
    public static int numberOccurrences (int[] a,int l, int r, int x){
        if(l == r){
            if(a[l] == x) {return  1;} else { return 0;}
        } else {
            int mid = l + (r-1)/2;
            return numberOccurrences(a, l ,mid,x) + numberOccurrences(a, l, mid, x);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int i = 0; i < n; i ++) {
             a[i] = sc.nextInt();
        }
       int x = sc.nextInt();
    int ans= numberOccurrences(a,0, n-1,x);
        System.out.println(ans);
    }
}
