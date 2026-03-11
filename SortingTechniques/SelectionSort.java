public class SelectionSort {
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int mini = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        SelectionSort s = new SelectionSort();
        s.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
// [13, 46, 24, 52, 20, 9] 