package Udemy_complete;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a, int b, int c){
        if((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000) )
            return false;
            a = a % 10;
            b = b % 10;
            c = c % 10;

        if(( a == b) || (b == c) || (c == a))
            return true;

        return false;
    }
    public static boolean isValid( int d){
        if( d > 9 && d < 1001  )
            return true;
        return false;
    }
}
