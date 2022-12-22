package Udemy_complete;

public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year){
        if(year <= 0 || year > 9999){
            return false;
        }
        if( year % 4 == 0 && year % 100 != 0){
            return true;
        }
        if(year % 400 == 0){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999)
            return -1;

        switch(month){
            case 1:
//                System.out.println("31");
                return 31;
            case 2:
                if (isLeapYear(year)){
//                    System.out.println("29");
                    return 29;
                }
                else
//                    System.out.println("28");
                    return 28;
            case 3:
//                System.out.println("31");
                return 31;
            case 4:
//                System.out.println("30");
                return 30;
            case 5:
//                System.out.println("31");
                return 31;
            case 6:
//                System.out.println("30");
                return 30;
            case 7:
//                System.out.println("30");
                return 31;
            case 8:
//                System.out.println("31");
                return 31;
            case 9:
//                System.out.println("30");
                return 30;
            case 10:
//                System.out.println("31");
                return 31;
            case 11:
//                System.out.println("30");
                return 30;
            case 12:
//                System.out.println("31");
                return 31;
        }


        return -1;
    }
}
