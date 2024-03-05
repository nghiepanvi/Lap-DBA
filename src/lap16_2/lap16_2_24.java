package lap16_2;

import java.util.LinkedList;
import java.util.Scanner;

public class lap16_2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập n
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        // nhập a, b
        int a = sc.nextInt();
        int b = sc.nextInt();
     for(int i = 0; i < n; i++){
         //thay phân tử chỉ số a bằng b
         if(list.get(i) == a){ list.set(i,b) ;}
     }
        for (int i: list
        ) {
            System.out.print(i + " ");
        }

    }
}
