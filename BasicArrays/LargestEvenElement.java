public class LargestEvenElement {
    public int Element (int[] arr) {
        int lEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > lEven) {
                lEven = arr[i];
            }
        }
        return lEven;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 20, 8};
        LargestEvenElement ele = new LargestEvenElement();
        int e = ele.Element(arr);
        System.out.println("The largest even element is: "+e);
    }
}
