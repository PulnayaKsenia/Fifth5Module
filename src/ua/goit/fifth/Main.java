package ua.goit.fifth;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("HELLO! This program searches minimum and maximum values in an array of integers!\n" +
                "If you need to create an array, please, choose type of create:\n " +
                "User or Random or enter Out for exit: ");

        Scanner in = new Scanner(System.in);
        String s = in.next();

        try {
            if (s.equals("User")) {
                int[] arrayUser = createArray(in);

                System.out.println("Enter array's elements: ");

                for (int i = 0; i < arrayUser.length; i++) {
                    arrayUser[i] = in.nextInt();
                }

                System.out.println("Sorted array: " + Arrays.toString(ArrayUtils.sort(arrayUser)));

                MinMaxPair minMaxPair = ArrayUtils.getMinMax(arrayUser);
                System.out.println(minMaxPair);

            } else if (s.equals("Random")) {
                int[] arrayRandom = createArray(in);
                Random random = new Random();

                for (int i = 0; i < arrayRandom.length; i++) {
                    arrayRandom[i] = random.nextInt(100);
                }

                System.out.println("Sorted array: " + Arrays.toString(ArrayUtils.sort(arrayRandom)));

                MinMaxPair minMaxPair = ArrayUtils.getMinMax(arrayRandom);
                System.out.println(minMaxPair);

            } else if (s.equals("Out")) {
                System.exit(1);
            }

        } catch (InputMismatchException ex) {
            System.out.println("You enter wrong value! Must be integer number!");
        }
    }

    public static int[] createArray(Scanner in) {
        System.out.println("Please, enter array's length: ");

        int n = in.nextInt();
        int[] array = new int[n];

        return array;
    }
}



