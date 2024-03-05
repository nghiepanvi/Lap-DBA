package Exercise_11;
//chat nhập vào số n tinh số con số ể đánh số trang quyển sách n trang
import java.util.Scanner;
public class Excercise11_8 {
    public static int pagesNumbering(int n) {
        int k = 1;
        int v1 = 0;
        int v2= 0;
        int m = String.valueOf(n).length();
        if(n < 10 && n > 0) {
            v1 = n;
            v2 = 0;
        } else {
            for(int i = 1; i <=m - 1; i ++){
                v1 = (n-(int) Math.pow(10,i) + 1)*m;
                v2 = v2+ (9*i) *k;
                k = k * 10;
            }
        }
        return (v1+ v2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Excercise11_8.pagesNumbering(n);

        System.out.println(  result);
    }
}
