package LeetCode;

public class Median_Two_Sorted_Arreas {

    public static void main(String[] args) {
        int [] nums1 = new int [] {1};
        int [] nums2 = new int [] {3,4};

        findMedianSortedArrays(nums1, nums2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = 0, b = 0, last1 = 0, last2=0;
        double medianA = 0, medianB = 0;
        if(nums1.length  > 0) {
            a = nums1[0];
            last1 = nums1.length - 1;
            medianA = (double) (a + nums1[last1])/ 2;
        }
        if(nums2.length > 0){
            b = nums2[0];
            last2 = nums2.length - 1;
            medianB = (double)(b + nums2[last2])/2;
        }
        double median_2 = (medianA + medianB) / 2;

        System.out.println(median_2);
    return median_2;
    }
}
