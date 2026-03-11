public class BubbleSort {
    public int[] bubbleSorting(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) break;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        BubbleSort b =  new BubbleSort();
        b.bubbleSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
