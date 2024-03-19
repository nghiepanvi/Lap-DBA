package baikiemtra;

import java.util.Scanner;
public class promotionMonney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền");
        int monney = sc.nextInt();
        if(monney >= 200 && monney < 300) {
            monney = monney + (monney * 20) / 100;
            System.out.println("Bạn được khuyến mại 20%. Tổng số tiền là: " + monney);
        } else if (monney >= 300) {
            monney = monney + (monney * 30) / 100;
            System.out.println("Bạn được khuyến ma 30%.Tổng số tiền là: " + monney);
        } else {
            System.out.println("Tổng số tiền là: " + monney);
        }
    }
}
