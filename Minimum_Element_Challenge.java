package Array;

import java.util.Arrays;
import java.util.Scanner;
// - Write a method called readInteger() with a parameter called 'count' that represents how many integers the user needs to enter.
// - The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered
// - Write the method findMin() and findMax() with the array as a parameter. The method needs to return the minimum, maximum value in the array
// - In the main() method read the count from the console and call the method readInteger() with the count parameter
// - Then call the findMin() findMax() method passing the array returned from the call to the readInteger() method.
// - Finally, print the minimum and maximum element in the array.
// TIP : 
// create a Scanner as a static field to help with data input

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
