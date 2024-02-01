public class ArrangeArray {
    static void Arrange(int []arr) {
        int n = arr.length;
        int l = 0, r = n - 1;

        while (l < r) {
            while (arr[l] < 0) l++;
            while (arr[r] >= 0) r--;
            if (l < r) {
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {4,5,-1,-8,-9,6,7,-7,10};
        Arrange(arr);
        for (int val : arr){
            System.out.print(val+ " ");
        }
    }
}
