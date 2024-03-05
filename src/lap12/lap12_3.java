package lap12;
import java.util.Scanner;
import  java.util.Arrays;
public class lap12_3 {
    // Phương thức tính giá trị tối đa của số tiền thu được từ việc kích quảng cáo trong 1 vị trí / 1 ngày
    private static long maxDotProduct(int[] a, int[] b) {
        // Sắp xếp mảng a và b
        Arrays.sort(a);
        Arrays.sort(b);

        long result = 0; // Khởi tạo biến result để lưu giá trị tối đa

        // Duyệt qua mảng a và b để tính giá trị tối đa
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
            // Cộng dồn vào result tích của phần tử a và b tại vị trí i
        }

        return result; // Trả về giá trị tối đa
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        // In ra kết quả từ phương thức maxDotProduct với 2 mảng a và b đã được nhập
        System.out.println(maxDotProduct(a, b));
    }
}
