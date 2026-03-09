import java.util.*;
public class ReverseArrayRecursion {
    public int[] Result(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;
        reverseArray(arr, p1, p2);
        return arr;
    }
    private void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ReverseArrayRecursion ans = new ReverseArrayRecursion();
        int[] reversed = ans.Result(arr);
        for (int i : reversed) {
            System.out.print(i+" ");
        }
    }
}
