public class BruteRotateString {
    public boolean checkRotation(String given, String goal) {
        if (given.length() != goal.length()) return false;
        int l = given.length();
        for (int i = 0; i < l; i++) {
            String rotated = given.substring(i) + given.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";
        BruteRotateString r = new BruteRotateString();
        System.out.println(r.checkRotation(s1, s2));
    }
}