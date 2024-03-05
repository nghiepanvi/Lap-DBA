package Excercise17;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// nhập số n trả về các số nguyên tố từ 2 đến n
public class lap17_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> dq = new LinkedList<>();
        for(int i = 2; i <= n && i < 10 ; i++){
            if(isPrime(i)){
                dq.add(i);
            }
        }
        while(! dq.isEmpty()){
            for(int i = 1; i<= 9; i++){
                int k = dq.peek()*10+i;
                if(k <= n && isPrime(k)){
                    dq.add(k);
                }
            }
            System.out.print(dq.peek() + " ");
            dq.remove();
        }
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    }
