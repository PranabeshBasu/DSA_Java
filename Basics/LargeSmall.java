import java.util.Scanner;

public class LargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b < a && c < a) {
            System.out.println(a + " is the largest");
        } else if (a < b && c < b) {
            System.out.println(b + " is the largest");
        } else if (a < c && b < c) {
            System.out.println(c + " is the largest");
        } else {
            System.out.println("Invaild value input");
        }
        // if(a>b){
        // if(a>c){
        // System.out.println(a+" is the largest number");
        // }
        // else if(c>a){
        // System.out.println(c+" is the largest number");
        // }
        // }
    }
}
