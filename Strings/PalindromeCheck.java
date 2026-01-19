public class PalindromeCheck {
    public boolean isPalindrome(String s){
        //code here
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "HAAAAH";
        PalindromeCheck p = new PalindromeCheck();
        System.out.println(p.isPalindrome(s));
    }
}
