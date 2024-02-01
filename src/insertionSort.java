public class insertionSort {
    static void InsertionSort(int[]arr){
        int n = arr.length;                                           // time complexity --> π(n) == bast case
        for (int i = 1; i < n ; i++){
            int j = i ;

             while (j > 0 && arr[j] > arr[j-1]) {
                    //  swap value
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                    j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {3 , 2 ,7 , 1, 5};
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
