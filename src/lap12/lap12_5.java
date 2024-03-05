package lap12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// nhập n cái kẹo. tính số k nguoi tối da có the chia keo
public class lap12_5 {
    private static List<Integer> optimalSummands(int n) {

        List<Integer> summands = new ArrayList<Integer>();

        int k = 1;

 //  phân tích số n thành tổng các số nguyên dương sao cho tối ưu
        while (n > 0) {
            // Kiểm tra nếu n - k nhỏ hơn hoặc bằng k
            if (n - k <= k) {
                summands.add(n);
// Nếu điều kiện đúng, thêm n vào danh sách summands và kết thúc vòng lặp
                break;
            } else {
                summands.add(k);
                // Nếu điều kiện không đúng, thêm k vào danh sách summands
                n = n - k;
                k++; //
            }
        }

        // Trả về danh sách summands chứa các summands tối ưu
        return summands;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}
