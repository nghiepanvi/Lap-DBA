package lap16_2;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class lap16_2_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.offer(sc.nextInt());
        }
        int k = sc.nextInt();
        for(int i = k; i < n; i++){
            list1.offer(list.get(i));
        }
        list1.forEach( i -> System.out.print(i + " "));
        for(int i = 0; i < k; i ++){
            System.out.print(list.get(i) + " ");
        }
    }
}
