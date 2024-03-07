package lap17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) throws IOException, IOException {
        //nhập dữ liệu từ bản phím, kiểm tra tính hợp lệ của dấu ngoặc
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
                opening_brackets_stack.push(new Bracket(next, position));
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
                if (opening_brackets_stack.isEmpty()) {
                    System.out.println(position + 1);
                    return;
                }

                Bracket top = opening_brackets_stack.pop();
                if (!top.Match(next)) {
                    System.out.println(position + 1);
                    return;
                }
            }
        }

        // Printing answer, write your code here
        if (opening_brackets_stack.isEmpty()) {
            System.out.println("Success");
        } else {
            System.out.println(opening_brackets_stack.pop().position + 1);
        }
        }
}

