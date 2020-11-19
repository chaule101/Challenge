package Array;

import java.util.Arrays;

public class Reverse_Array_Challenge {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println("Non-reverse is " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse is " + Arrays.toString(array));

    }
    public static void reverse (int[]array) {
        int maxIndex = array.length-1;
        int halfIndex = array.length/2 ;
        for(int i = 0; i<halfIndex ;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }


}
