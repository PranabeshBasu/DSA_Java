import java.util.*;
public class LeetCode258 {
    //We will add and return the sum until the number becomes a single digit number
    public int AddUntilSingleDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
            if (n == 0 && sum > 9) {
                n = sum;
                sum = 0;
            }
            else if (n == 0 && sum < 9) {
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        LeetCode258 l258 = new LeetCode258();
        System.out.println(l258.AddUntilSingleDigit(n));
    }
}