public class SumofArrayElements {
    public int ArraySum(int[] nums) {
        return result(nums, 0);
    }
    public int result(int[] nums, int left) {
        if (left == nums.length) return 0;
        return nums[left] + result(nums, left + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        SumofArrayElements sum = new SumofArrayElements();
        System.out.println("The sum of all the array elements is: "+sum.ArraySum(arr));
    }
}
