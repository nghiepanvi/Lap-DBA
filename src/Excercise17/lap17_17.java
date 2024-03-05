package Excercise17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// nhập n và queue q với n phần từ nhập int k và đảo phần tử thứ k về cuối queue
public class lap17_17 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k,n, teamp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++ ){
            teamp = sc.nextInt();
            q.add(teamp);
        }
        k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int x = q.remove();
            q.add(x);
        }
        while(!q.isEmpty()) {
            System.out.print(q.element() + " ");
            q.remove();
        }
        sc.close();

    }
}
