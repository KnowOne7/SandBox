package Udemy_complete;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double i, double j) {
//        System.out.println((i * 1000));
//        System.out.printf("%.3f%n", j);
//        i = Double.parseDouble(((String.format("%.3f", i))));
//        j = Double.parseDouble((String.format("%.3f", j)));
//        System.out.println(i + j);
        System.out.println(((String.format("%.3f", i))));
        System.out.println(((String.format("%.3f", j))));

        int myI = (int)(i * 1000);
        int myJ = (int)(j*1000);
        System.out.println(myI);
        System.out.println(myJ);
        if (myI == myJ) {

                System.out.println("True");
                return true;
            } else
                System.out.println("False inline");
                return false;
        }


}



