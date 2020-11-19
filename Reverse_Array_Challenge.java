package Array;

import java.util.Arrays;
// - Write a method called REVERSE() with and INT ARRAY as a parameter
// - The method should not return any value. In other words, the method is allowed to modify the ARRAY parameter
// - In MAIN() test the REVERSE() method and print the array both reverse and non-reverse
// - To reverse the array, you have to swap the elements, so that the frist element is swapped with the last element and so on
//    For Example : if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.

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
        //just Debug and see what happend
        for(int i = 0; i<halfIndex ;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }


}
