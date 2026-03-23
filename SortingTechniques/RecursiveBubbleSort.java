public class RecursiveBubbleSort {
    public int[] bubbleSort(int[] nums) {
        bubbleSortHelper(nums, nums.length);
        return nums;
    }
    private void bubbleSortHelper(int[] nums, int n) {
        // Base case
        if (n <= 1) {
            return; //Single element present in the array
        }
        for (int j = 0; j < n - 1; j++) {
            //Swapping and pushing the bubble/largest element at the last 
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
        bubbleSortHelper(nums, n - 1); //Shortening up the array and again do traversal and swapping
    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        RecursiveBubbleSort rbs = new RecursiveBubbleSort();
        rbs.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}