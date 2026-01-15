public class TotalFreqHashing {
    public int freqCount(int nums[],int l) {
        int hfreq = 0;
        int lfreq = l;
        int max = -1;
        for (int i = 0; i < l; i++) {
            max = Math.max(max,nums[i]);
        }
        int hashed[] = new int[max+1];
        for (int j = 0; j < l; j++) {
            hashed[nums[j]]++;
        }
        for (int k = 0; k < max; k++) {
            if (hashed[k] > 0) {
                if (hashed[k] > hfreq) {
                    hfreq = hashed[k];
                }
                if (hashed[k] < lfreq) {
                    lfreq = hashed[k];
                }
            }
        }
        return lfreq + hfreq;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3};
        int len = arr.length;
        HighplusLowFreq f = new HighplusLowFreq();
        int count = f.freqCount(arr, len);
        System.out.println("The sum of highest and lowest frequencies is : "+count);
    }
}
