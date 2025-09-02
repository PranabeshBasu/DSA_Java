import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        String fname = sc.nextLine();
        String lname = sc.nextLine();
        System.out.println(fname+" "+lname);
        
    }
}
