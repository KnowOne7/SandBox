package Udemy_complete;

public class IntEqualityPrinter {
    // write your code here
    public static void printEqual(int i, int j, int k){
        if((i < 0) || (j < 0) || (k < 0)){
            System.out.println("Invalid Value");
        }
        else if(( i == j) && (j == k)){
            System.out.println("All numbers are equal");
        }
        else if(( i != j) && (j != k) && (k != i)){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}
