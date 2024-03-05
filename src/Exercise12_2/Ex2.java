package Exercise12_2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int [] s = {1,3};
        int [] e = {3,5};
        int ans = mettingRoom(s, e);
        System.out.println(ans);
    }
    public static int  mettingRoom(int[] s, int[] e) {
        int n = s.length, ans = 1;
        int[][] arr = new int[n][2];
        for(int i =0; i < n; i++){
            arr[i][0] = s[i];
            arr[i][1] = e[i];
        }
        Arrays.sort(arr,(a, b)->(a[1]-b[1])); // O(n*logn)
        int prev = arr[0][1];
        for(int i = 1; i < n; i++){
            if (arr[i][0] >= prev){
                ans++;
                prev = arr[i][1];
            }
        }
        return ans;
    }
}
