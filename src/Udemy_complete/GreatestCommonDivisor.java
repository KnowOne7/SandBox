package Udemy_complete;

public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10)
            return -1;

        int firstDivisor = 1, secondDivisor = 1, gcd = 1;
        for(int i = 1; i <= first; i++){
            if(first % i == 0){
                firstDivisor = i;
            }
            for(int j = 1; j <= second; j++){
                if(second % j == 0){
                    secondDivisor = j;
                }
                if(secondDivisor == firstDivisor)
                    gcd = firstDivisor;
            }
        }
        System.out.println(gcd);
        return gcd;
    }
}
