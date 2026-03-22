public class QuickSort {
    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low]; //Selecting first element of the array as pivot element
        int i = low; //left pointer
        int j = high; //right pointer
        while (i < j) {
            while (nums[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (nums[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp1 = nums[j];
                nums[j] = nums[i];
                nums[i] = temp1;
            }
        }
        int temp2 = nums[j];
        nums[j] = nums[low]; // Putting the pivot element to its correct position
        nums[low] = temp2;
    return j; // Returning index of the pivot element after putting it in it's correct postion
    }
    public void quickSortHelper(int[] nums, int low, int high) {
        if (low >= high) return; // Base case (until the array has single element)
        int pindex = partition(nums, low, high);
        quickSortHelper(nums, low, pindex - 1); // Left subarray of pivot element
        quickSortHelper(nums, pindex + 1, high); // right subarray of pivot element
    }
    public int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        QuickSort qs = new QuickSort();
        qs.quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}