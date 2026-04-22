public class RotateArrayByRight {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
    public static void main(String[] args) {
        RotateArrayByRight r = new RotateArrayByRight();
        int[] nums = {1, 2, 3, 4, 5};

        r.rotateArrayByOne(nums);

        // Output the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}