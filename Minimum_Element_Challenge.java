package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Element_Challenge {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count : ");
        int count = sc.nextInt();
        sc.nextLine();
        int[] returnedArray = readInteger(count);
        System.out.println("Array is " + Arrays.toString(returnedArray));

        int minValuesIs = findMin(returnedArray);
        System.out.println("Min is " + minValuesIs);

        int maxValues = findMax(returnedArray);
        System.out.println("Max is " + maxValues);
    }


    public static int[] readInteger(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number you want ");
            int numbers = sc.nextInt();
            sc.nextLine();
            array[i] = numbers;

        }

        return array;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < minValue) {
                minValue = value;

            }

        }
        return minValue;
    }

    public static int findMax(int[] array) {
        int maxValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) ;
            maxValue = array[i];
        }
        return maxValue;
    }


}
