import java.util.Scanner;
public class Wloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i<=50){
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }
    }
}
