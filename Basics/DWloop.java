import java.util.Scanner;
public class DWloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
            if(num == 10){
                break;
            }
            System.out.println(num);
        }while(true);
    }
}
