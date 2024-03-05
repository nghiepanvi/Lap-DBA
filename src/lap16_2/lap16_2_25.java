package lap16_2;

import java.util.LinkedList;
import java.util.Scanner;

public class lap16_2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập n
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        // nhập k
        int k = sc.nextInt();
        if (k < list.size()) {
            int valueAtK = list.get(k);
            int i = 0;
            while (i < list.size()) {
                if (list.get(i) > valueAtK) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
        }


        for (int i: list
             ) {
            System.out.print(i + " ");
        }

    }
}
