package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDup{

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;
    }


}
