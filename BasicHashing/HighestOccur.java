public class HighestOccur {
    public int Result(int nums[]) {
        int n = nums.length;
        int max = nums[0];
        int maxcount = 0;
        int ele = -1;
        for (int i = 0; i < n; i++) { // Finding the max element present in the array
            max = Math.max(max, nums[i]);
        }
        //We will be using hashing technique to reduce the TC 
        int hash[] = new int[max+1]; /* The hashed array will be size of the max element of 
        the original array + 1 */
        for (int j = 0; j < n; j++) {
            hash[nums[j]]++; // doing the computation of counting occurences
        }
        for (int k = 0; k <= max; k++) {
            if (hash[k] > maxcount) {
                maxcount = hash[k];
                ele = k; // Index of the hashed array 
            }
        }
        return ele;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 2};
        HighestOccur hc = new HighestOccur();
        int element = hc.Result(arr);
        System.out.println("Highest occured element: "+element);
        
    }
}
