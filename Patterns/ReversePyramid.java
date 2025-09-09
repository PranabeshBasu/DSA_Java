import java.util.Scanner;
public class ReversePyramid {
    public void pattern8(int n){
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*n-1)-(2*i); k++){
                System.out.print("*");
            }
            for(int l=0; l<=i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ReversePyramid rp = new ReversePyramid();
        rp.pattern8(num);
    }
}
