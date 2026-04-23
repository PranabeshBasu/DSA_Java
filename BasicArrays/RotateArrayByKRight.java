import java.util.*;

public class RotateArrayByKRight {
    public void rotateArrayByK(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i- (n - k)] = nums[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RotateArrayByKRight r = new RotateArrayByKRight();
        int[] nums = {1, 2, 3, 4, 5};
        
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        r.rotateArrayByK(nums,k);

        // Output the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}