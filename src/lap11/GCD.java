package lap11;

public class GCD {
    //hàm tính ước chung lớn nhất
    public static int find_gcd(int a, int b) {
        //chat vong lặp gán gdc(a,b) = gcd (b, a%b)
        while (b!=0) {
            int temp = b;
            b = a% b;
            a = temp;
        }
        // trả về ươ chung lớn nhất
        return  a;
    }

    public static void main(String[] args) {
        int a = 357;
        int b= 234;
        int gcd= find_gcd(a,b);
        System.out.println("lap11.GCD= "+ gcd);
    }
}
