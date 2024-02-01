public class RadixSort {
    static int MaxValue(int []arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] > mx){
                mx =arr[i];
            }
        }
        return mx;
    }
    static void countSort(int[]arr, int place ){
        int n = arr.length;                     // time complexity --> O(n + max)
        int[] output = new int[n];
        int max = MaxValue(arr);
        int[] count = new int[10];
        for (int i = 0 ; i < arr.length;i++){   // for freq array
            count[(arr[i]/place)%10]++;
        }
        // make prefix sum array of count array
        for (int i = 1;i < count.length;i++){
            count[i] += count[i-1];
        }
        //find the index of each element in the original array and put int in output array
        for (int i = n-1 ; i >= 0; i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place)%10]--;
        }
        //copy all elements of output to array
        for (int i =0;i < n ; i++){
            arr[i] = output[i];
        }
    }

    static void radixSort(int[]arr){
                                                                   // time complexity --> O(n)
        int max = MaxValue(arr);// find maximum array
        //apply counting sort to sort elements based on place value
        for (int place = 1; max/place > 0; place *= 10){
            countSort(arr,place);
        }
    }

    public static void main(String[] args) {
        int []arr = {102,125,21,235,254,165,526,625};
        radixSort(arr);
        for (int val : arr){
            System.out.print(val+ " ");
        }
        System.out.println();
    }
}
