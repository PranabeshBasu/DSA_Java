import java.util.Arrays;
public class LargestCommonPrefix {

    public String returnLcp(String str[]) {
        StringBuilder s = new StringBuilder();
        Arrays.sort(str);
        String f = str[0];
        String l = str[str.length - 1];

        for (int i = 0; i < Math.min(f.length(), l.length()); i++) {
            if (f.charAt(i) != l.charAt(i)) break;
            s.append(f.charAt(i));
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String s[] = {"fly", "flower", "flight", "flowers"};
        LargestCommonPrefix lcp = new LargestCommonPrefix();
        String r = lcp.returnLcp(s);
        System.out.println(r);
    }
}
