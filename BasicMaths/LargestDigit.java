import java.util.*;
public class LargestDigit{
    public int largedigit(int n){
        int ldigit = 0;
        while (n > 0){
            int lastdigit = n % 10;
            if (lastdigit > ldigit) ldigit = lastdigit;
            n = n / 10;
        }
        return ldigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        LargestDigit ld = new LargestDigit();
        int result = ld.largedigit(num);
        System.out.println("The largest digit of the number is : "+ result);
    }
}