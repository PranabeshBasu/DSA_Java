public class SecondHighestOccurHashing {
    public int Hashed(int arr[], int n) {
        int h_el = -1;
        int h_f = 0;
        int sh_el = -1;
        int sh_f = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,arr[i]);
        }
        int hash[] = new int[max+1];
        for (int j = 0; j < n; j++) {
            hash[arr[j]]++;
        }
        for(int k = 0; k <= max; k++) {
            if (hash[k] > h_f) {
                sh_f = h_f;
                sh_el = h_el;
                h_f = hash[k];
                h_el = k;
            }
            else if (h_f == hash[k]) {
                h_el = Math.min(h_el,k);
            }
            else if (hash[k] > sh_f) {
                sh_el = k;
                sh_f = hash[k];
            }
            else if(sh_f == hash[k]) {
                sh_el = Math.min(sh_el,k);
            }
        }
        return sh_el;
    }
    public static void main(String[] args) {
        int arr[] = {4, 4, 5, 5, 6, 7};
        int n = arr.length;
        SecondHighestOccurHashing sh = new SecondHighestOccurHashing();
        int el = sh.Hashed(arr,n);
        System.out.println(el);
    }
}
