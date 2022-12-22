package Udemy_complete;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int count = array.length -1;
        int temp = 0;
        for(int i = 0; i < array.length/ 2; i++){
            temp = array[i];
            array[i] = array[count];
            array[count] = temp;
            count -=1;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
