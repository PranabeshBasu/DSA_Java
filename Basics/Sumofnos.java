import java.util.Scanner;
public class Sumofnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers range");
        int num = sc.nextInt();
        int[] sum = new int[num];
        int sumofnos = 0;
        for(int i=0; i<=num-1; i++){
            sum[i] = sc.nextInt();
        }
        for(int i=0; i<=num-1; i++){
            sumofnos += sum[i];
        }
        System.out.println(sumofnos);

    }
}
