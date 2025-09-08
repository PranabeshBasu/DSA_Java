import java.util.Scanner;
public class ReverseNumberTriangle {
    public void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ReverseNumberTriangle rnt = new ReverseNumberTriangle();
        rnt.pattern6(num);
    }
}
