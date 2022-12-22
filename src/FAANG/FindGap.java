package FAANG;

import java.util.Arrays;

public class FindGap {

/* Create the function find_gap that takes three positive integers as arguments(the gap, a, and b) and returns the
first pair of two prime numbers spaced with the prime gap of length gap between a and b (both inclusive) as an array.

find_gap(2,3,50) returns [3,5]
find_gap(2,5,7) returns [5,7]
find_gap(4,130,200) returns [163,167]
 */

    public static void main(String[] args) {

        FindGap.isNumberPrime(5);
        FindGap.listNum(50);
        FindGap.findGap(2, 10, 50);
        FindGap.findGap(4, 130, 200);
        FindGap.findGap(2 , 5, 7);
        FindGap.findGap(4 , 5, 7);
    }



















    public static int[] findGap(int gap, int a, int b) {
        int num1 = 2;
        int num2 = 0;
        int[] result;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                num2 = i;
                if (num2 == (gap + num1)) {
                    result = new int[]{num1, num2};
                    System.out.println(Arrays.toString(result));
                    return result;
                } else {
                    num1 = num2;
                }
            }

        }
        System.out.println("No Pair Exists");
        return null;
    }

    public static boolean isPrime(int num){
        if(num < 0)
            return false;
        for(int i = 2; i < num; i ++){
            if(num % i == 0)
                return false;
        }
        return true;

    }


//        isNumberPrime(a);
//        isGap2(a, b);
//        returnFirstGap2(gap);
//        System.out.println(new int[]{ num1, num2});
//        return new int[0];
//    }

    public static void listNum(int num){
        for(int i = 3; i < num; i ++){
            isNumberPrime(i);
        }
    }


    public static int isNumberPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0) {
               return -1;
            }
        }
        System.out.println(num + " IS Prime");
        return num;
    }

    private static void isGap2(int num1, int num2){
        System.out.println("Call is Gap2");

    }

    private static void returnFirstGap2( int gap){
        System.out.println("Call return");
    }

//    public static void main(String[] args) {
//
//        FindGap.isNumberPrime(5);
//        FindGap.listNum(50);
//
//        FindGap.findGap(2, 10, 50);
//        FindGap.findGap(4, 130, 200);
//        FindGap.findGap(2 , 5, 7);
//        FindGap.findGap(4 , 5, 7);
//    }


}
