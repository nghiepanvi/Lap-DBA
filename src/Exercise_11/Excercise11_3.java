package Exercise_11;
import static java.lang.Math.sqrt;
public class Excercise11_3 {
    public static boolean [] arr = new boolean[100001];
   public static void snt (int n){
       for(int i = 2; i <= n; i ++){
           arr[i] = true;
       }
       arr[0] = arr[1] = false;
       for (int i = 2; i <= sqrt(n); i ++ ){
            if(arr[i]){
                for( int j = 2 * i; j <= n; j += 1){
                    arr[j] = false;
                }
            }
       }
   }
    public static int greatestCommonPrimeDivisor(int a, int b) {
        snt(Math.min(a, b));
        int d = 0;
        for (int i = Math.min(a, b); i >= 2; i--) {
            if (arr[i] && a % 1 == 0 && b % i == 0) {
                return i;
            }
        } return  -1;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        Excercise11_3.snt(Math.max(a,b));
        int gcd = greatestCommonPrimeDivisor(a,b);
        System.out.println(gcd);
    }
}
