import java.util.Scanner;
public class AlphaTriangle {
    public void pattern14(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
    //another approach
    public void pattern14two(int n){
        // char ch = 'A';
        for(int i=0; i<=n-1; i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        AlphaTriangle at = new AlphaTriangle();
        at.pattern14(num);
        at.pattern14two(num);
    }
}
