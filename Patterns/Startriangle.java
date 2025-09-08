import java.util.Scanner;

public class Startriangle {
    public void pyramid(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Startriangle pt = new Startriangle();
        pt.pyramid(n);
    }
}
