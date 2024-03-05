package Exercise_11;
// find chu so thu 2 gan cuoi cùng của n!
public class Excercise11_5 {
public static int numOf0S ( int n) {
    long res = 1;
    for (int i = 2; i <= n; i++) {
        res *= i;
        while (res % 100 == 0) {
            res /= 10;
            res = res % 100;
        }
    }
        while (res % 10 == 0) {
            res = res / 10;
        }
        return (int) res % 10;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = Excercise11_5.numOf0S(n);
        System.out.println(result);
    }
}

