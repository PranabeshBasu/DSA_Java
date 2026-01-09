public class ReverseAnarrayBrute {
    public void Reverse(int arr[], int n) {
        //This method is not optimized as TC is O(N^2)

        // int temp[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     temp[i] = arr[n-i-1];
        // }
        // for (int i = 0; i < n; i++) {
        //     arr[i] = temp[i];
        // }

        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        ReverseAnarrayBrute ra = new ReverseAnarrayBrute();
        ra.Reverse(arr, n);
        System.out.println('\n'+"Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
