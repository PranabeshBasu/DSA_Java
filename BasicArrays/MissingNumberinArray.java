import java.util.*;

public class MissingNumberinArray {
    public int missingno(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < nums.length; i++) {
            xor1 ^= i + 1;
            xor2 ^= nums[i];
        }
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4};
        
        MissingNumberinArray solution = new MissingNumberinArray();
        
        
        int ans = solution.missingno(nums);
        
        System.out.println("The missing number is: " + ans);
    }
}