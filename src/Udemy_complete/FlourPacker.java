package Udemy_complete;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount * smallCount * goal < 0)
            return false;

        if ((bigCount * 5 + smallCount * 1) == goal) {
            System.out.println("True");
            return true;
        }

        if ((bigCount * 5 + smallCount * 1) > goal) {

            while (4 < goal && bigCount > 0) {
                goal -= 5;
                bigCount -= 1;
            }
            if (goal <= smallCount)
                return true;
        }

        return false;
    }

}
