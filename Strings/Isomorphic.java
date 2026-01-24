public class Isomorphic{
    boolean isIsomorphic(String s, String t) {
        int sMap[] = new int[256];
        int tMap[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (sMap[s.charAt(i)] != tMap[t.charAt(i)]) {
                return false;
            }
            sMap[s.charAt(i)] = i + 1;
            tMap[t.charAt(i)] = i + 1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "title";
        Isomorphic i = new Isomorphic();
        boolean result = i.isIsomorphic(s1, s2);
        System.out.println(result);
    }
}