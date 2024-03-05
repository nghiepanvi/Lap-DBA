package Exercise_11;

import java.util.Scanner;
//chat nhập số n. tìm số mà các chữ số của nó nhân với nhau bang n
public class Excercise11_6 {
    public static int digitsProduct(int product) {
        if (product == 1) return 1;
        if (product == 0) return 10;
        int ans = 0;
        for( int i = 9; i >=2; i --){
            while(product % i==0){
                ans = ans * 10 + i;
                product /= i;
            }
        }
        int ans2 = 0;
        while(ans >0){
            ans2= ans2 * 10 + ans % 10;
            ans /= 10;
        }
        return (product == 1) ? ans2 : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int result=  Excercise11_6.digitsProduct(n);
        System.out.println(result);
    }
}
