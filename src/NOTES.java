import java.util.HashSet;

/*

    public static String output( String[] input ) {
        String concat = "";
        String[] split;

        for (int i = 0; i < input.length; i++) {
            String text = input[i].replaceAll("[0-9]", "").replaceAll(";", "zyx ");
            input[i] = text;
            split = input[i].trim().split("[\\s+]");

            if(split[0].length() > 0)
                for(int j = 0; j < split.length; j++) {
                    String capWord = split[j].substring(0, 1).toUpperCase() + split[j].substring(1) + " ";
                    capWord = capWord.replaceAll("zyx ", ";");
                    concat += capWord;
            }
        }
        System.out.println(concat.trim());
        return concat;
    }

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
}





























































 */