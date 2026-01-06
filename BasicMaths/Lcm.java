import java.util.Scanner;
public class Lcm {
    public int FindLcm(int n1, int n2){
        int i = 1;
        int multiple = Math.max(n1,n2);
        do {
            int lcm = i * multiple;
            if (lcm % n1 == 0 && lcm % n2 == 0) return lcm;
            i++;
        }while(true);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Lcm lcm = new Lcm();
        int result = lcm.FindLcm(num1, num2);
        System.out.println(result);
    }
}
