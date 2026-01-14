import java.util.*;
public class SecondHighestOccur{
    public int Element(int arr[],int n) {
        int ele1 = -1;
        int h_freq = 0;
        int ele2 = -1;
        int sh_freq = 0;
        int size = 0;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(visited[i]) continue;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]){
                    count++;
                    visited[j] = true;
                }
            }
            if (count > h_freq) {
                sh_freq = h_freq;
                ele2 = ele1;
                ele1 = arr[i];
                h_freq = count;
            }
            else if (count == h_freq) {
                ele1 = Math.min(ele1, arr[i]);
            }
            else if(count > sh_freq) {
                ele2 = arr[i];
                sh_freq = count;
            }
            else if (count == sh_freq) {
                ele2 = Math.min(ele2, arr[i]);
            }
        }
        return ele2;
    }
    public static void main(String[] args) {
        int arr[] = {4, 4, 5, 5, 6, 7};
        int n = arr.length;
        SecondHighestOccur sh = new SecondHighestOccur();
        int el = sh.Element(arr,n);
        System.out.println(el);
    }
}