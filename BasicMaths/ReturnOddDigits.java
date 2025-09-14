import java.util.Scanner;
public class ReturnOddDigits {
    public int ReturnOddCount(int n){
        String str = String.valueOf(n);
        int oddcount = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)%2 != 0) oddcount++;
        }
        return oddcount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ReturnOddDigits o = new ReturnOddDigits();
        int count = o.ReturnOddCount(num);
        System.out.println(count);
    }
}
