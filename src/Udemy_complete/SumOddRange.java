package Udemy_complete;

public class SumOddRange {
    public static boolean isOdd(int number){
        if(number <= 0 )
            return false;
        if(number % 2 != 0)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end) {
        if(end < start){
            return -1;

        }
        else if (start <= 0)
            return -1;
        else{
            int i;
            int num = 0;
            for (i = start; i <= end; i++)
                if(isOdd(i))
                    num +=i;
            // System.out.println(num);
            return num;
        }

    }
}
