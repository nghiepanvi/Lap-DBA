package Exercise12_1;

import java.util.Scanner;

public class Codelearn72 {
    public static void quickSort(int[] array, int left, int right) {
        int i = left, j = right;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }
        if (i < right) {
            quickSort(array, i, right);
        }
    }

    public static int solve(int[] array, int n) {
        int k = 1;
        quickSort(array, 0, n - 1);

        int stiffness = array[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            k = k + 1;
            stiffness = stiffness - 1;

            if (stiffness > array[i]) {
                stiffness = array[i];
            }

            if (stiffness == 0) {
                return k;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(solve(array, n));
    }
}
