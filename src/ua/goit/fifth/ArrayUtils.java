package ua.goit.fifth;

import java.util.Arrays;

public class ArrayUtils {

    public static MinMaxPair getMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
                 for (int i = 0; i < array.length; i++) {
                if (min > array[i])
                    min = array[i];
                if (max < array[i])
                    max = array[i];
                System.out.println("Minimum: " + min + ". Maximum: " + max);
            }
            return new MinMaxPair(min, max);
    }
    public static int[] sorting(int[] array,int length) {         //        used bubble sort
        int[] sort = Arrays.copyOf(array, length);
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int j = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = j;
                    swapped = true;
                }
            }
        }
        for (int element : array) {
            System.out.println("Your sorted array's elements: " + element);
        }
        return sort;
    }
}






