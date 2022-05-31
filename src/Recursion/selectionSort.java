package Recursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {6, 6, 75, 4, 4, 2, 1, 0, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int little = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[little] > arr[j]) {
                    little = j;
                }
            }

            //optimization
            if (little != i) {
                int temp = arr[i];
                arr[i] = arr[little];
                arr[little] = temp;
            }

        }
    }

}
