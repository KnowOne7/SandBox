package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int x=1;

        for(int y=x ; y < nums.length; y++)
        {
            if(nums[y] > nums[x-1])
            {
                nums[x++]=nums[y];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        RemoveDuplicates.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
        ContainsDup.containsDuplicate(new int[] {0,0,1,1,1,2,2,3,3,4});
    }

//    public static int [] removeDuplicates2(int[]nums) {
//        int [] duplicates = new  int[8];
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i : nums){
//            if(!set.add(i))
//                duplicates[i] = nums[i];
//
//        }
//        System.out.println("Answer");
//        System.out.println(Arrays.toString(duplicates));
//        return duplicates;
//    }




//        for (int i = 0; i < nums.length; i++)
//            for (int j = i + 1; j < nums.length; j++)
//                if (nums[i] == nums[j]){
//                    System.out.println("Dupllicate " + nums[i]);
//                    nums[j] = 0;
//                 }
//        for(int i = 0; i < nums.length; i++) {
//            int temp = 0;
//            if (nums[i] == 0){
//
//                nums[i] = nums[i+1];
//                nums[i+1] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        return 0;
//    }
}
