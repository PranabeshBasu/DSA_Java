public class HeadRecursion {
    int count = 0;
    public void printName() {
        if (count == 5) return;
        count++;
        printName();
        System.out.println("My name is Pranabesh");
    }
    public static void main(String[] args) {
        HeadRecursion h = new HeadRecursion();
        h.printName();
    }
}
