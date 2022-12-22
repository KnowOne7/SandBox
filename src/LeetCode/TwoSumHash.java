package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {
    public static int[] twoSum(int numbers[], int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++ ){
            Integer indexP1 = map.get(target-numbers[i]);
            if(indexP1 != null) {

                int[] result = {indexP1, i+1};
                System.out.println(Arrays.toString(result));

                return result;
            }
            map.put(numbers[i], i +1);

        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumHash.twoSum(new int[] {1,2,5,6,7,9}, 11);
        TwoSumHash.twoSum(new int[]{0, 5, 7, 6, 9,2}, 11);
    }
}
