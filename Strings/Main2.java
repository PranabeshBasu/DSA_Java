public class Main2 {
    public static void main(String[] args) {
        String a = "Pranabesh";
        String b = "Pranabesh";
        System.out.println(a == b); //both the reference variables are pointing to the same object

        //Creating different objects
        String s1 = new String("Pranabesh");
        String s2 = new String("Pranabesh");
        System.out.println(s1 == s2); // == checks both value and reference

        //to check only value
        System.out.println(s1.equals(s2));
    }
}
