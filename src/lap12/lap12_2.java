package lap12;

import java.util.Scanner;

// tính số vật phẩm có giá trị lớn nhất cho vừa vào túi tên trộm
public class lap12_2 {
    private static double getOptimalValue(int n, int W, int[] v, int[] w) {
        // khai báo mảng 2 chiều lưu
        double[][] dp = new double[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                //kiểm tra xem trọng lượng vật phẩm có nhỏ hơn s lượng vật phẩm không
                if (w[i - 1] <= j) {
                    //chat tìm giá trị max của dp [i]
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                } else {
                    // không thì trả về dp[i-1][j]
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        // trả về giá trị tối ưu n là số vật phẩm w là trọng lượng tô da
        return dp[n][W];
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // số vật phẩm
        int n = scanner.nextInt();
        //dung tích túi
        int capacity = scanner.nextInt();
        //giá trị túi
        int[] values = new int[n];
        //trọng lượng vật phẩm
        int[] weights = new int[n];
        //vòng lặp nhập giá trí và trọng lượng các vật phẩm vào mảng
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        // gọi hàm tính tổng giá trị vật phẩm
        System.out.println(getOptimalValue( n, capacity, values, weights));
    }
}
