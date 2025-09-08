import java.util.Scanner;
public class SecondNumberTriangle {
    public void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        SecondNumberTriangle snt = new SecondNumberTriangle();
        snt.pattern4(num);
    }
}
