import java.util.*;
public class IsSortedRecursion {
    public boolean checkSorted(ArrayList<Integer> list) {
        return checkMethod(list, 0);
    }
    private boolean checkMethod(ArrayList<Integer> list, int i) {
        if (i >= list.size() - 1) return true;
        if (list.get(i) > list.get(i + 1)) return false;
        return checkMethod(list, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        IsSortedRecursion result = new IsSortedRecursion();
        System.out.println(result.checkSorted(list));
    }
}