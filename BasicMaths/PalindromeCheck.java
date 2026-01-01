import java.util.*;
public class PalindromeCheck {
 public boolean DecisionFunc(int n){
    int cpy = n;
    int rev = 0;
    while(n>0){
        int lastdigit = n%10;
        rev = (rev*10)+lastdigit;
        n = n/10;
    }
    if(cpy == rev) return true;
    else return false;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    PalindromeCheck pc = new PalindromeCheck();
    boolean result = pc.DecisionFunc(num);
    System.out.println(result);
 }
}

    
