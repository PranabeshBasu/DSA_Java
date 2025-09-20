import java.util.*;
public class NumberSquareUnique {
    public void pattern22(int n){
        for(int i=0; i<=2*n-2; i++){
            for(int j=0; j<=2*n-2; j++){
                int top = i;
                int bottom = j;
                int left = (2*n-2)-i;
                int rigth = (2*n-2)-j;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,rigth))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        NumberSquareUnique s = new NumberSquareUnique();
        s.pattern22(range);
    }
}
