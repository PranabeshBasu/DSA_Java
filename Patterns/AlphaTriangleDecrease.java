import java.util.Scanner;
public class AlphaTriangleDecrease {
    public void pattern18(int n){
        for (int i = 0; i < n; i++) {
            for(char ch = (char)(('A'+ n-1)-i); ch <= ('A'+ n-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        AlphaTriangleDecrease atd = new AlphaTriangleDecrease();
        atd.pattern18(num);
    }
}
