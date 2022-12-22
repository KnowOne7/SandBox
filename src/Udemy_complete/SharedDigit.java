package Udemy_complete;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        if(( a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }
        int aDig = 0, bDig = 0;

        while( a > 0) {
            aDig = a % 10;
            a = a / 10;
            int bTemp = b;
            while (bTemp > 0) {
                bDig = bTemp % 10;
                bTemp = bTemp / 10;

            if (aDig == bDig)
                return true;
            }
        }
        return false;
    }

}
