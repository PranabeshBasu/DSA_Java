public class LargestElement {
    public int largestElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 7, 5};

       //Creating the instance of the Solution class
        LargestElement sol=new LargestElement();

        int n = nums.length;

        /* Call the method to find
        the second largest element*/
        int sL = sol.largestElement(nums);

        System.out.println("The largest is " + sL);
    }
}