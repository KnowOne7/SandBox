package Udemy_complete;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 | year > 9999) {
            return false;
        }

        // If year // 4 step 2
        if (year % 4 == 0) {  // 1
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
            } else
                return true;
        } else
            return false;

        return false;
    }

}