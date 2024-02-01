public class Sort012_countSort {
    static void sort_012(int []arr){
        int n = arr.length;
        int count0 = 0, count1 = 0 , count2 =0;

        for (int j :arr){
            if (j == 0){
                count0++;
            }
            else if (j== 1) {
                count1++;
            }
            else {
                count2++;
            }
        }
        int k = 0 ;
        while(count0 > 0){
            arr[k++] =0;
            count0--;
        }
        while (count1 > 0){
            arr[k++] = 1;
            count1--;
        }
        while(count2 > 0){
            arr[k++] = 2;
            count2--;
        }
    }    // it is solved by the count sort --->  2 pass
    static void display(int []arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int[] arr){
        int n = arr.length;
        int lo = 0, mid =0 , hi = n-1;

        // explore the unknown region
        while(mid <= hi){
            if (arr[mid] == 0){
                swap(arr, mid ,lo);
                mid++;
                lo++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }                                             // 1 pass

    public static void main(String[] args) {
        int [] arr = {0,1,1,0,2,1,2,2,0,1,0,2,1,2,0};
//        sort_012(arr);
//        for (int i : arr){
//            System.out.print(i+ " ");
//    }

        sort012(arr);
        display(arr);
    }
}
