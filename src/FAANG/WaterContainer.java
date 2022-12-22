package FAANG;

import static java.lang.Math.min;

public class WaterContainer {
    public static int area(int[] nums){

        int area, GArea = 0;
        for(int i= 0; i < nums.length; i ++){
            for( int j = i + 1; j < nums.length; j ++){
                area = min(nums[i], nums[j]) * (j-i);
            if(area > GArea)
                GArea = area;
            }
        }
        System.out.println(GArea);
        return GArea;
    }

    public static int areaShift(int[] nums){
        int area, GArea = 0;
        int i = 0;
        int j = nums.length-1;

        while(j -  i > 0 ){
            area = min(nums[i], nums[j]) * (j-i);
            if(area > GArea)
                GArea = area;
            if(nums[i] < nums[j])
                i++;
            else
                j--;

            }
        System.out.println(GArea);
        return GArea;

    }

    public static void main(String[] args) {
        WaterContainer.area(new int[] {7,1,2,3,9});
        WaterContainer.area(new int[] {6,9,3,4,5,8});
        WaterContainer.areaShift(new int[] {7,1,2,3,9});
        WaterContainer.areaShift(new int[] {6,9,3,4,5,8});
    }
}


