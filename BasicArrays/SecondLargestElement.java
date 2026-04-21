public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1; //Single Element present
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > sLargest && nums[i] != largest) {
                sLargest = nums[i];
            }
        }
        return sLargest == Integer.MIN_VALUE ? -1 : sLargest;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 7, 5};

       //Creating the instance of the Solution class
        SecondLargestElement sol=new SecondLargestElement();

        int n = nums.length;

        int sL = sol.secondLargestElement(nums);

        System.out.println("Second largest is " + sL);
    }
}
