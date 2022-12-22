package Udemy_complete;

import java.util.Scanner;

public class MinimumElement {
    static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];
        for(int i =0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] values){
        int min = values[0];
        for(int i = 0; i < values.length; i++) {
            if (values[i] < min)
                min = values[i];
        }
        return min;


    }

}
