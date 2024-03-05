package lap16_2;

import java.util.LinkedList;
import java.util.Scanner;

public class lap16_2_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập n
        int n = sc.nextInt();
        LinkedList<Integer> a = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        // nhập k, x
        int k = sc.nextInt();
        int x = sc.nextInt();
        if(k >= n){
            n++;
            k = (n-1);
        }
        //chèn phần tử x vào chỉ số k
        a.add(k,x);
        a.forEach(i -> System.out.print(i + " "));
    }
}
