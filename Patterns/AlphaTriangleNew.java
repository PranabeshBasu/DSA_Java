import java.util.Scanner;
public class AlphaTriangleNew {
    public void pattern16(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        AlphaTriangleNew at = new AlphaTriangleNew();
        at.pattern16(num);
    }
}
