package ua.goit.fifth;

public class ArrayUtils {

    static int[] array;
    static int min = array[0];
    static int max = array[0];

    public static MinMaxPair getMinMax() {

        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
            if (max < array[i])
                max = array[i];
            System.out.println("Minimum: " + min + ". Maximum: " + max);
        } return getMinMax();
    }
    public static int[] sorting() {         //        used bubble sort
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
        return sorting();
    }
}






