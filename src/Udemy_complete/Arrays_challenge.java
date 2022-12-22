package Udemy_complete;

import java.util.Scanner;

public class Arrays_challenge {
//     Scanner scanner = new Scanner(System.in);


    public static int[] getIntegers(int number){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + "integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
    public static int[] sortIntegers(int[] array){
        int temp1 = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] < array[j]){
                    temp1 = array[i];
                    array[i] = array[j];
                    array[j] = temp1 ;
                }
            }
        }

        return array;
    }
}
