package Udemy_complete;

public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;

        int f = 0, l = 0, temp, sum = 0;
        temp = number;

        l = temp % 10;

        while(temp > 0){
            f = temp % 10;
            temp = temp / 10;
        }

        sum = l + f;

        return sum;
    }
}
