import java.util.Scanner;
public class Ten {
    public void pattern10(int n){
        //first outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second outer loop
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Ten t = new Ten();
        t.pattern10(num);
    }
}
