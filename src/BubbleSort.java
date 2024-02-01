public class BubbleSort {

    static void bubbleSort(int[] arr){
        int n = arr.length;                        //time complexity --> O(n^2)
        for (int i = 0; i < n-1; i++){
            boolean flag = false; //has swap happened
                                                        /* because of "flag" time complexity of this code is
                                                             also O(n^2) in worst case but in best case π(n)
                                                         */
            for (int j = 0; j < n-i-1; j++ ){

                if (arr[j] > arr[j+1]){
                    //  swap value
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    flag = true; //some swap has happened
                }
            }
            if (!flag){  // has any swap happened?
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {3 , 2 ,7 , 1, 5};
        bubbleSort(arr);
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }
}
