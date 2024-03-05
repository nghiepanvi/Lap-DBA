package lap12;

import java.util.Scanner;
//bài toàn đổi tiền
// input 2,28
public class lap12_1 {
    private static int getChange(int m) {
        // initialization coinCout
        int coinCount = 0;
        // initialization coint array with values 10,5,1
        int coint [] = {10,5,1};

        for(int i = 0; i < coint.length; i ++) {
            coinCount += m / coint[i] ; // chia giá trị m cho 10,5,1 tính tổng số  đồng xu
            m %= coint[i]; // sau mỗi lần chia, cập nhật m bng số d con lại
        }
        return coinCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.close();
        //gọi hàm getChange tính tổng số đồng xu của giá trị m
        System.out.println(getChange(m));

    }
}
