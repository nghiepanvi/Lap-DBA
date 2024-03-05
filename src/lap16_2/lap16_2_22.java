package lap16_2;

import java.util.LinkedList;
import java.util.Scanner;

public class lap16_2_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập n
        int n = sc.nextInt();
        LinkedList<Integer> a = new LinkedList<>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        // nhập k
        int k = sc.nextInt();

        // xóa phẩn tử chỉ số k
        a.remove(k);
        for (int i:a
             ) {
            System.out.print(i + " ");
        }
    }
}
