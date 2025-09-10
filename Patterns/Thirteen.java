import java.util.Scanner;
public class Thirteen {
    public void pattern13(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num += 1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Thirteen pt13 = new Thirteen();
        pt13.pattern13(num);
    }
}
