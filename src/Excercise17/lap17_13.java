package Excercise17;

import java.util.Scanner;
import java.util.Stack;

public class lap17_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack <Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()) {
            System.out.print(st.peek());
            st.pop();
        }
    }
}
