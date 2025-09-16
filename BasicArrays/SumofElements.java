import java.util.Scanner;

public class SumofElements {
    public int SumofArrayelements(int arr[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        SumofElements s = new SumofElements();
        System.out.println(s.SumofArrayelements(arr, num));

    }
}
