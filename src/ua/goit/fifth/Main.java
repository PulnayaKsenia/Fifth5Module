package ua.goit.fifth;

import java.io.IOException;
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
                int[] userArray = lengthArray(in);
                System.out.println("Enter array's elements: ");
                for (int i = 0; i < userArray.length; i++) {
                    userArray[i] = in.nextInt();
                }
                MinMaxPair minMaxUser = ArrayUtils.getMinMax(userArray);
                System.out.println(minMaxUser);
            } else if (s.equals("Random")) {
                int[] randomArray = lengthArray(in);
                Random random = new Random();
                for (int i = 0; i < randomArray.length; i++) {
                    randomArray[i] = random.nextInt(100);
                    System.out.println("Your array's element: " + randomArray[i]);
                }
                MinMaxPair minMaxRandom = ArrayUtils.getMinMax(randomArray);
                System.out.println(minMaxRandom);
            } else if (s.equals("Out")) {
                System.exit(1);
            }
        } catch (InputMismatchException ex) {
            System.out.println("You enter wrong value! Must be integer number!");
        }
    }
    public static int[] lengthArray(Scanner in) {
        System.out.println("Please, enter array's length: ");
        int n = in.nextInt();
        int[] array = new int[n];
        return array;
    }
}



