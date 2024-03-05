package Exercise12_1;

import java.util.Scanner;

public class Codelearn71 {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, n - 1);

        int k = 1;
        int max = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (array[i] + k > max) {
                max = array[i] + k;
            }
            k = k + 1;
        }

        System.out.println(max);
    }
}
