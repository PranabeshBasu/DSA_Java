import java.util.*;
public class LargestOdd{
    public String returnOddNum(String s) {
        int idx = -1;
        int i;
        for (i = s.length()-1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return "";
        i = 0;
        while (i <= idx && s.charAt(i) == '0') i++;
    return s.substring(i, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        LargestOdd lo = new LargestOdd();
        String r = lo.returnOddNum(s);
        System.out.println("Largest odd integer in the given string is " + r);
    }
}