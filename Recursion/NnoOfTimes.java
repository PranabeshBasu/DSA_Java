import java.util.*;
public class NnoOfTimes {
    public void result (int n, int x) {
        if (x == 0) return;
        System.out.println(n);
        result(n,x - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no first: ");
        int num = sc.nextInt();
        System.out.println("Enter the no of times it should be printed: ");
        int times = sc.nextInt();
        NnoOfTimes func = new NnoOfTimes();
        func.result(num, times);
    }
}