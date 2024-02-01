public class sortArray {
    static void sort(int[] arr){
        int n = arr.length;                         //  time complexity --> O(n)
        int x = -1;
        int y = -1;

        if (n <= 1){
            return;  // corner case , edge case
        }
        // process all adj elements
        for (int i = 1;i < n ;i++){
            if (arr[i-1] > arr[i] ){
                if (x == -1){ // first conflict
                    x = i-1;
                    y = i;
                }else {// 2nd conflict
                    y =i;
                }
            }
        }
        //swap x and y
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] =t;
    }
    public static void main(String[] args) {
        int [] arr = {9};
        sort(arr);
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
