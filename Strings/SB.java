public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb);
        //Reverse string
        System.out.println(sb.charAt(5));
        sb.deleteCharAt(0);
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
