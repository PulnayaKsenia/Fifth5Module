package ua.goit.fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

            System.out.println("HELLO! This program searches minimum and maximum values in an array of integers!\n" +
                    "If you need to create an array, please, choose type of create:\n " +
                    "User or Random or enter Out for exit: ");

        try {
            String s = READER.readLine();
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter array's length: ");
            int n = in.nextInt();
            int[] array = new int[n];

            if (s.equals("User")) {

                System.out.println("Enter array's elements: ");
                for (int i = 0; i < array.length; i++) {
                    array[i] = in.nextInt();
                }
            } else if (s.equals("Random")) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = ((int) (Math.random() * n));
                    System.out.println("Your array's element: " + array[i]);
                }
            } else if (s.equals("Out")) {
                System.exit(1);
            }
        } catch (InputMismatchException ex) {
            System.out.println("You enter wrong value! Must be integer number!");
        }

        MinMaxPair minMax = ArrayUtils.getMinMax();
        System.out.println(minMax);
    }
}


