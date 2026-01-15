public class HighplusLowFreq {
    public int freqCount(int arr[], int l) {
        int hfreq = 0;
        int lfreq = l;
        boolean visited[] = new boolean[l];
        for (int i = 0; i < l; i++) {
            if(visited[i]) continue;
            int freq = 0;
            for (int j = 0; j < l; j++) {
                if(arr[j] == arr[i]){
                    visited[arr[j]] = true;
                    freq++;
                }
            }
            if (freq > hfreq) {
                hfreq = freq;
            }
            if (freq < lfreq) {
                lfreq = freq;
            }
        }
        return lfreq+hfreq;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3};
        int len = arr.length;
        HighplusLowFreq f = new HighplusLowFreq();
        int count = f.freqCount(arr, len);
        System.out.println("The sum of highest and lowest frequencies is : "+count);
    }
    
}