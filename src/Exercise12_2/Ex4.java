package Exercise12_2;

public class Ex4 {
    public static long decorateRom (int r, int g, int b) {
        int bb= Math.max(r, Math.max(g,b));
        int rr = Math.min(r,Math.min(g,b));
        long gg = (r+g+b) - (rr + bb);
        return (rr+ gg+ bb)/3;
    }

    public static void main(String[] args) {
        int r= 2;
        int g = 1;
        int b = 3;
        long ans = decorateRom(r,g,b);
        System.out.println(ans);

    }
}
