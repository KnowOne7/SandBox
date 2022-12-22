package FAANG;

public class BinarySearch {

    public static void main(String[] args) {
        search(new int[] {-1,0,3,5,9,12}, 9);

        search(new int[] {2,5}, 5);

        search(new int[] {-1,0,5}, -1);


    }

        public static int search(int[] nums, int target) {
            int min = 0, max = nums.length-1, pointer;

//            pointer = max/2;
            while(min < max){

                pointer = min + (max - min ) /2;

                System.out.println(nums[pointer]);
                if(nums[pointer] == target)
                    return pointer;

                else if (nums[pointer]> target){
                    max = pointer -1;
//                    pointer = ((pointer - min) / 2 );
                }
                else if (nums[pointer] < target){
                    min = pointer+1;
//                    pointer = ((max - pointer)/2 );
                }

            }

            return -1;

        }
}


