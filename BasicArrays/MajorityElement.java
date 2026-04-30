import java.util.*;

public class MajorityElement {
    public int majorEl(int[] nums) {
        int count = 0;
        int el = 0;
        //Moore's Algorithm
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                el = nums[i];
            }
            else if (el == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        int finalcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (el == nums[i]) finalcount++;
        }
        return (finalcount > nums.length / 2) ? el : -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        MajorityElement mel = new MajorityElement();
        System.out.println("The majority element in the array is: "+mel.majorEl(arr));
    }
}