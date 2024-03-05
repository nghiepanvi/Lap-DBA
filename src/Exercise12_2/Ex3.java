package Exercise12_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 {
    public static int maximizeSum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list);

        int s = 0, n = list.size();
        for (int i = 0; i < n / 2; i++) {
            s += Math.abs(list.get(n - i - 1) - list.get(i));
        }
        return s * 2;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int ans = maximizeSum(arr);
        System.out.println(ans);
    }
}
