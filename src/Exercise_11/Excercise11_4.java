package Exercise_11;

import java.util.List;
// give 2 list number. find  max index create = 2 list

public class Excercise11_4 {
  public static int maxFraction(List<Integer> numerators,List<Integer> denominator) {
    int cs = 0;
    for (int i = 1; i < numerators.size(); i ++) {
      if(numerators.get(cs) * denominator.get(i) < numerators.get(i) * denominator.get(cs)) {
        cs = i;
      }
    }
    return  cs;
  }
  public static void main(String[] args) {
    // Test example
    List<Integer> numerators = List.of(1, 2, 3);
    List<Integer> denominators = List.of(4, 5, 6);
    int result = maxFraction(numerators, denominators);
    System.out.println("Index of maximum fraction: " + result);
  }
}
