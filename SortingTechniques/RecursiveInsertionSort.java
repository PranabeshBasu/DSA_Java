public class RecursiveInsertionSort {
    private void insertionSortHelper(int[] nums, int len) {
        //Base Case
        if (len >= nums.length) return; // Whole array traversed
        int j = len; //assigning length for comparison for the subarrays
        while (j > 0 && nums[j - 1] > nums[j]) {
            int temp = nums[j - 1];
            nums[j - 1] = nums[j];
            nums[j] = temp;
            j--;
        }
        insertionSortHelper(nums, len + 1); // Updating the array length
    }
    public int[] insertionSort(int[] nums) {
        insertionSortHelper(nums, 0);
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        RecursiveInsertionSort ris = new RecursiveInsertionSort();
        ris.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
