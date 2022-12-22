package FAANG;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(numbers));
//        bubblesort(numbers);
        System.out.println(Arrays.toString(numbers));
//        selectSort(numbers);
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] bubblesort(int[] numbers) {
        int len = numbers.length, temp;
        for(int i = 0; i < len; i++){
            for(int j = 1; j < len; j++){
                if( numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static int[] selectSort(int[] numbers){
        int len = numbers.length, min, temp;
        for(int i = 0; i < len; i++) {
            min = i;
            for (int j = i+1; j < len; j++) {
                // lowest number become numbers [i]
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
    return numbers;
    }

    public static int[] insertionSort( int [] numbers){
        int size = numbers.length;

        for (int step = 1; step < size; step++) {
            int key = numbers[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            numbers[j + 1] = key;
        }
        return numbers;
    }



}
