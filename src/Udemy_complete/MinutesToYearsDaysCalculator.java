package Udemy_complete;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long YY = minutes / 525600;
            long ZZ = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + YY + " y and " + ZZ + " d");
        }
    }
}
