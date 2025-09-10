import java.util.Scanner;
public class AlphaPyramid {
    public void pattern17(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            //for first spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for printing the alphabets
            for(int k=1; k<=2*i-1; k++){
                System.out.print(ch);
                if(k < i) ch++;
                else ch--;
            }
            //for second spaces
            for(int l=1; l<=n-i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        AlphaPyramid ap = new AlphaPyramid();
        ap.pattern17(num);
    }
}
