public class QuickSort {
    static void displayArr(int []arr){
        for (int val : arr){
            System.out.print(val+  " ");
        }
    }

    static void swap(int []arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int []arr,int s , int e){
        int pivot = arr[s];
        int count = 0;

        for (int i = s +1 ;i <= e;i++){
            if (arr[i] <= pivot) count++;
        }
        int pivotIndex = s + count;
        swap(arr, s,pivotIndex);

        int i = s ;int j = e;
        // element lesser or equal left of pivotIndex  , greater --> right side of pivotIndex
        while(i < pivotIndex && j > pivotIndex){
            while(arr[i] <= pivot) i++;
            while(arr[j] >= pivot) j--;

            if (i < pivotIndex && j > pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quicksort(int[] arr, int s , int e){
        if (s>= e) return;
        int pi = partition(arr,s,e);
        quicksort(arr,s,pi-1);
        quicksort(arr,pi+1,e);

    }

    public static void main(String[] args) {
        int [] arr = {6,3,5,7,2,8,9};
        System.out.println("before sorting algorithm :-");
        displayArr(arr);
        System.out.println();

        quicksort(arr,0,arr.length - 1);

        System.out.println("after Quick sort algorithm :- ");
        displayArr(arr);
    }
}
