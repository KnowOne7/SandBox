package Udemy_complete;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum = 0, num = 0, even = 0;


        if(number < 0)
            return -1;

        while( 0 < number){
            num = number % 10;
            if(num % 2 == 0)
                even += num;
            number = number / 10;

        }
        System.out.println(even);
        return even;
    }
}
