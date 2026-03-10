import java.util.*;

public class SumOfDigitsRecursion {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = sumOfDigits(num);
        return addDigits(sum);
    }
    private int sumOfDigits(int num) {
        if (num == 0) return 0;
        return sumOfDigits(num / 10) + num % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        SumOfDigitsRecursion sod = new SumOfDigitsRecursion();
        System.out.println(sod.addDigits(num));
    }
}