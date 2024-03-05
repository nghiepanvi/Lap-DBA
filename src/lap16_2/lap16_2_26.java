package lap16_2;

import java.util.LinkedList;
import java.util.Scanner;
// nhập list với n phần tử. nhập day số từ n -> 1 -> n vào list
public class lap16_2_26 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
     int n = sc.nextInt();
     for (int i = n; i >= 1; i --){
         list.offer(i);
     }
     for (int i = 2; i <= n; i ++){
         list.offer(i);
     }
        for (int i: list
             ) {
            System.out.print(i + " ");
        }
    }
}
