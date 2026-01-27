public class CharPosCheck {
    public int ReturnCount(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String str = "abcdea";
        CharPosCheck c = new CharPosCheck();
        int count = c.ReturnCount(str);
        System.out.println(count);
    }
}
