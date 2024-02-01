public class SelectionSort {

    static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++ ){
            int Min_index = i ;
            for (int j = i+1 ; j < n ; j++){

                if (arr[j] < arr[Min_index]){
                    Min_index = j;
                }
            }
            //swap values
            int temp = arr[i];
            arr[i] = arr[Min_index];
            arr[Min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {3 , 2 ,7 , 1, 5};
        selectionSort(arr);
        for (int i =0;i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
