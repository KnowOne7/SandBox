package FAANG;

/*
1. Identify the pointer with the lesser value
2. Is this pointer value greater than or equal to max on that side
  yes -> update max on that side
  no -> get water for pointer, add to total
3. move pointer inwards
4. repeat for other pointer
 */


public class TrappingRainWater {



    public static int volumeShift(int [] height) {
        int totalVolume = 0;
        int p1 = 0, p2 = height.length - 1;
        int maxLeft = 0, maxRight = 0;


        while(p1 < p2){
            if(height[p1] <= height[p2]){
                if(height[p1] >= maxLeft){
                    maxLeft = height[p1];
                }
                else
                    totalVolume += maxLeft - height[p1];
                p1++;
            }
            else{
                if(height[p2] <= height[p2]){
                    if (height[p2] >= maxRight){
                        maxRight = height[p2];
                    }
                    else
                        totalVolume += maxRight - height[p2];
                    p2--;

                    }
                }
            }

        System.out.println("Total Volume with Shift = " + totalVolume);
        return totalVolume;
    }
    public static int volume( int[] height){
        int currentVolume = 0;
        int totalVolume = 0;

            for(int p = 0; p < height.length; p++) {
                int leftP = p, rightP = p, maxLeft = 0, maxRight = 0;

                while (leftP >= 0) {
                    maxLeft = Math.max(height[leftP], maxLeft);
                    leftP--;
                }
                while (rightP < height.length) {
                    maxRight = Math.max(height[rightP], maxRight);
                    rightP++;
                }
                currentVolume = Math.min(maxLeft, maxRight) - height[p];
                if (currentVolume >= 0)
                    totalVolume += currentVolume;
            }

            System.out.println(totalVolume + " total Volume");
            return totalVolume;
    }



    public static void main(String[] args) {
        TrappingRainWater.volume(new int [] {0,1,0,5,1,0,3,1,0,1,2});
        volumeShift(new int [] {0,1,0,5,1,0,3,1,0,1,2});

    }
}
