import java.util.Scanner;
public class Diamond {
    public void pattern9(int n){
        //first outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            for(int l=1; l<=n-i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //second outer loop
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*n-1)-(2*i); k++){
                System.out.print("*");
            }
            for(int l=0; l<i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Diamond d = new Diamond();
        d.pattern9(num);
    }
}
