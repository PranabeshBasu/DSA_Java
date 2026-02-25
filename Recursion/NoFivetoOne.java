import java.util.*;
public class NoFivetoOne {
    public void printnos(int n) {
        if (n == 0) return;
        System.out.println(n + " ");
        printnos(n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the highest range:");
        int n = sc.nextInt();
        NoFivetoOne p = new NoFivetoOne();
        p.printnos(n);
    }
}
