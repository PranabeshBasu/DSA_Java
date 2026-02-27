import java.util.*;
public class Factorial {
    public long factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        Factorial f = new Factorial();
        System.out.println("Factorial is: "+f.factorial(n));
    }
}