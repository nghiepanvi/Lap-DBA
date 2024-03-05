package Excercise17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lap17_19 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] b = new boolean[1001];
        int [] a = new int [1001];
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < 1001; i++){
            b[i] = false;
        }
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        k = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(!b[a[i]]){
                if(q.size() <k){
                    b[a[i]] = true;
                    q.add(a[i]);

                } else {
                    b[q.peek()] = false;
                    b[a[i]] = true;
                    q.add(a[i]);
                    q.poll();
                }
            }
        }
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}
