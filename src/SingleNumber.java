import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
    static int result = -1;
    public static int singleNum(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){

            if(!set.add(i)) {
                System.out.println("skip");
                result = nums[i];
            }

            result = nums[i];
        }

//        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        SingleNumber.singleNum(nums);
    }
}
