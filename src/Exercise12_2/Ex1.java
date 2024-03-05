package Exercise12_2;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static int numberOfToys (List<Integer> arr, int k) {
        int ans = 0;
        arr.sort(null);
        for (int i = 0; i < arr.size(); i ++) {
            if(k >= arr.get(i)){
                ans ++;
                k -= arr.get(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     List<Integer> arr = Arrays.asList(1,2,3);
     int k = 5;
     int result = numberOfToys(arr, k);
        System.out.println(result);
    }
}
