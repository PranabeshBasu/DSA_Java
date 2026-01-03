import java.util.*;
public class Armstrong{
    public boolean Result(int n){
        int copy = n;
        int temp = n;
        int digitCount = 0;
        int lastDigit;
        double sum = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        while (n > 0) {
            lastDigit = n % 10;
            sum += Math.pow(lastDigit,digitCount);
            n /= 10;
        }
        return sum == copy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Armstrong a = new Armstrong();
        boolean isArmstrong = a.Result(num);
        System.out.println(isArmstrong);
    }
}