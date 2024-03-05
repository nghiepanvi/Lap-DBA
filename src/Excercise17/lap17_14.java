package Excercise17;

import java.util.Scanner;
import java.util.Stack;

public class lap17_14 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0) {
         st.push((char) (n%2 + '0'));
         n/=2;
        }
        while(!st.isEmpty()) {
            System.out.print(st.peek());
            st.pop();
        }
    }
}
