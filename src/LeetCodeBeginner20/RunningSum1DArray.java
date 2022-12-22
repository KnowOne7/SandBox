package LeetCodeBeginner20;

import java.util.Arrays;

public class RunningSum1DArray {

    public static void main(String[] args) {
        int[] array= new int[] {1,2,3,4};
        runningSum(array);
        array= new int[] {1,1,1,1,1};
        runningSum(array);
        array= new int[] {3,1,2,10,1};
        runningSum(array);

    }
    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++ ) {
            count += nums[i];
            sum[i] = count;
        }

        System.out.println(Arrays.toString(sum));
        return sum;
    }
}
