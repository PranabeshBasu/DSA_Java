import java.util.Scanner;
public class ReverseOfNumber {
    public int reverseNum(int n){
        int revNo = 0;
        while(n > 0){
            int lastdigit = n % 10;
            revNo = (revNo * 10)+lastdigit;
            n = n/10;
        }
        return revNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ReverseOfNumber no = new ReverseOfNumber();
        int rno = no.reverseNum(num);
        System.out.println(rno);
    }
}
