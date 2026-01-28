import java.util.Arrays;

public class ArrayElementPos{
    public int Result(int arr[]) {
        int count = 0;
        int cpy[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cpy[i] = arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (cpy[i] != arr[i]) count++; 
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,3,4,3};
        ArrayElementPos p = new ArrayElementPos();
        int c = p.Result(arr);
        System.out.println(c);
    }
}