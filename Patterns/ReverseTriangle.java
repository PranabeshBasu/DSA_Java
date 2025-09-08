import java.util.Scanner;

public class ReverseTriangle {
    public void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int num = sc.nextInt();
        ReverseTriangle rt = new ReverseTriangle();
        rt.pattern5(num);
    }
}
