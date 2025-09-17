import java.util.Scanner;
public class CountOddElements{
    public int count(int arr[], int n){
        int count =  0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        CountOddElements oddels = new CountOddElements();
        System.out.println(oddels.count(arr, num));
    }
}