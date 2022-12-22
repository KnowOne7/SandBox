package LeetCodeBeginner20;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] array = new int[]{1, 7, 3, 6, 5, 6};
        pivotIndex(array);
        array = new int[]{1, 2, 3};
        pivotIndex(array);
        array = new int[]{2, 1, -1};
        pivotIndex(array);
        array = new int[]{1, 7, 3, 6, 5, 6};
        pivotIndex(array);
        int[] array2 = new int[]{-1, -1, -1, -1, -1, 0};
        pivotIndex(array2);
        int[] array3 = new int[]{5};
        pivotIndex(array3);


    }

    public static int pivotIndex(int[] nums) {
        int sumX = 0;

        for (int x = 0; x < nums.length; x++) {
            sumX += nums[x];
            int sumY = 0;
            for( int y = nums.length-1; y > x; y --) {
                sumY += nums[y];
            }
            if ((sumX - nums[x]) == sumY) {
                return x;
            }
        }
        return -1;
    }
}


//class Solution {
//    public int pivotIndex(int[] nums) {
//        int sum = 0, leftsum = 0;
//        for (int x: nums) sum += x;
//            for (int i = 0; i < nums.length; ++i) {
//                if (leftsum == sum - leftsum - nums[i])
//                    return i;
//                leftsum += nums[i];
//        }
//        return -1;
//    }
//}