public class OptimalRotateString {
    public boolean result(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String str = s + s;
        if (str.contains(goal)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";
        OptimalRotateString o = new OptimalRotateString();
        System.out.println(o.result(str1, str2));
    }
}
