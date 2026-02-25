public class PrintName {
    int count = 0;
    public void printname() {
        if (count == 4) 
            return;
        System.out.println("My name is Pranabesh");
        count++;
        printname(); // Tail recursion
    }
    public static void main(String[] args) {
        PrintName p = new PrintName();
        p.printname();
    }
}
