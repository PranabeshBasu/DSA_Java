import java.util.*;
public class Factorial {
    public int ReturnFactorial(int n){
        if (n == 0) return 1; //As 0! = 1
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial f = new Factorial();
        int result = f.ReturnFactorial(num);
        System.out.println("The factorial of the given no is :"+result);
    }
}
