package FAANG;

public class QuickSelectKthNumber {
    public static void main(String[] args) {
        int [] nums = {1,6,2,3,4,7,9,8,5};
        quickSelect(nums, 0, nums.length, 5);
        System.out.println(quickSelect(nums, 0, nums.length -1, 2));
    }

    public static int quickSelect(int[] array, int left, int right, int k) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            if (pivotIndex == k) {
                return array[pivotIndex];
            } else if (k < pivotIndex)
                quickSelect(array, left, pivotIndex - 1, k);
            else
                quickSelect(array, pivotIndex + 1, right, k);
        }
        return -1;
    }

    public static int partition(int[] array, int left, int right) {
        int pivotElement = array[right];
        int partitionIndex = left;
        for (int j = left; j < right; j++)
            if (array[j] < pivotElement) {
//                swap();
                int temp = partitionIndex;
                partitionIndex = array[j];
                array[j] = temp;
            }
        return partitionIndex;
    }
}
