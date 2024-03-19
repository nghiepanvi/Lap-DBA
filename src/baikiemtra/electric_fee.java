package baikiemtra;

import java.util.Scanner;

public class electric_fee {
    public static void main(String[] args) {
        final int SUBMONEY = 1000;
        int fee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số kw điện");
        int kw = sc.nextInt();
        if(kw > 0 && kw <= 50){
            fee = kw * 230 + SUBMONEY;
            System.out.println("Số tiền điện tháng này của bạn là: "+ fee);
        } else if (kw > 50 && kw <=100) {
            fee = kw * 480 + SUBMONEY;
            System.out.println("Số tiền điện tháng này của bạn là: "+ fee);
        } else if (kw > 100 && kw <=150) {
            fee = kw * 700 + SUBMONEY;
            System.out.println("Số tiền điện tháng này của bạn là: "+ fee);
        } else if (kw > 150) {
            fee = kw * 900 + SUBMONEY;
            System.out.println("Số tiền điện tháng này của bạn là: "+ fee);
        }
    }
}
