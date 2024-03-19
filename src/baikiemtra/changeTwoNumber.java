package baikiemtra;
import java.util.Scanner;
public class changeTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = sc.nextInt();
        System.out.println("Nhập b");
        int b = sc.nextInt();
        int team = a;
        a = b;
        b = team;
        System.out.print(a +" " +b);
    }
}
