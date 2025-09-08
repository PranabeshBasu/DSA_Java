import java.util.Scanner;
public class Numbertriangle {
    public void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Numbertriangle nt = new Numbertriangle();
        nt.pattern3(num);
    }
}
