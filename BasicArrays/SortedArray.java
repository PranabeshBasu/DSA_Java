public class SortedArray{
    public boolean Result(int arr[], int n) {
        for (int i = 1; i < n-1; i++) {
            if (arr[i] <= arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        SortedArray s = new SortedArray();
        boolean result = s.Result(arr, n);
        System.out.println(result);
    }
}