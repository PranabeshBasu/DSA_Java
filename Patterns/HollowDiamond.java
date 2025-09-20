import java.util.Scanner;
public class HollowDiamond {
    public void pattern19(int n){
        //First Half
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int k=0; k<2*i; k++){
                System.out.print(" ");
            }
            for(int l=0; l<n-i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            for(int k=1; k<=(2*n-2)-2*i; k++){
                System.out.print(" ");
            }
            for(int l=0; l<i+1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        HollowDiamond hd = new HollowDiamond();
        hd.pattern19(range);
    }
}
