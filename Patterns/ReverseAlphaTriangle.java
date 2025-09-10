import java.util.Scanner;
public class ReverseAlphaTriangle {
    public void pattern15(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=1; j<=n-i+1; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ReverseAlphaTriangle rat = new ReverseAlphaTriangle();
        rat.pattern15(num);
    }
}
