public class ReverseAnarrayBrute {
    public void Reverse(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n-i-1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
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
