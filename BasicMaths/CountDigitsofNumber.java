import java.util.Scanner;

public class CountDigitsofNumber {
    public int returnCount(int n){
        String str = String.valueOf(n);
        int count = str.length();
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CountDigitsofNumber cdn = new CountDigitsofNumber();
        int c = cdn.returnCount(num);
        System.out.println(c);
    }

}
