package Excercise17;

import java.util.Scanner;
import java.util.Stack;

public class lap17_15 {
    public static String to_string(long n) {
            String s = "";
            while (n > 0) {
                s = (char) (n%10 + '0') + s;
                n /= 10;
            }
            return s;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s + '@';
        Stack<Character> stack = new Stack<>();
        String compressedString = "";
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty() || stack.peek() == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                int cout = 0;
                compressedString = compressedString + stack.peek();
                while(!stack.isEmpty()){
                    cout++;
                    stack.pop();
                }
                compressedString = compressedString + to_string(cout);

                stack.push(s.charAt(i));
            }
        }
        System.out.println(compressedString);
    }
}
