package baikiemtra;

import java.util.Scanner;

public class taxi_fee {
    public static void main(String[] args) {
        int fee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập quãng đường");
        int distance = sc.nextInt();
        if (distance == 1){
           fee = 14000;
            System.out.println(" Số tiền bạn phải trả là: " + fee);
        } else if (distance > 1 && distance <=30) {
            fee = distance *13000;
            System.out.println(" Số tiền bạn phải trả là: " + fee);
        } else if (distance > 30) {
            fee = distance * 11000;
            System.out.println(" Số tiền bạn phải trả là: " + fee);
        }
    }
}
