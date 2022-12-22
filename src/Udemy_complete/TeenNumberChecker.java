package Udemy_complete;

public class TeenNumberChecker {
    public static boolean hasTeen(int i, int j, int k){
        if(( i > 12 && i < 20) || ( j > 12 && j < 20) || ( k > 12 && k < 20)){
        System.out.println("True");
        return true;
        }
        return false;
    }

    public static boolean isTeen(int a){
        if( a > 12 && a < 20){
            System.out.println("Is of age " + a);
            return true;
        }
        return false;
    }

}
