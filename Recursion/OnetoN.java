import java.util.Scanner;

public class OnetoN {
    public void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the highest range:");
        int n = sc.nextInt();
        OnetoN r = new OnetoN();
        r.print1toN(n);
    }
}
