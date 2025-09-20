import java.util.Scanner;
public class Butterfly {
    public void pattern20(int n){
        //First Half
        for(int i=0; i<n; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print("*");
            }
            for(int k=1; k<=(2*n-2)-2*i; k++){
                System.out.print(" ");
            }
            for(int l=1; l<=i+1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int i=1; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*i; k++){
                System.out.print(" ");
            }
            for(int l=1; l<=n-i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        Butterfly b = new Butterfly();
        b.pattern20(range);
    }
}
