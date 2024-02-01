import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/* Sort an array having numbers in range [0.0 to 1.0] with uniform distance.
     Efficient way to sort.

     let [] arr =  {0.4f,0.1f,0.2f,0.5f,0.3f,0.7f};
*/
public class BucketSort {
    static void bucketSort(float [] arr){
        int n = arr.length;
        //buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        //create empty buckets
        for (int i = 0;i < n ; i++){
            buckets[i] = new ArrayList<Float>();
        }
        //add elements into our buckets
        for (int i =0; i < n ;i++){
            int bucketIndex = (int ) arr[i] * n ;
            buckets[bucketIndex].add(arr[i]);
        }
        // sort each bucket individually
        for (int i = 0;i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        //merge all buckets to get final sorted array
        int index = 0;
        for(int i = 0;i < buckets.length;i++){
            ArrayList<Float> currentBucket = buckets[i];
            for (int j = 0; j < currentBucket.size();j++){
                arr[index++] = currentBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr =  {0.4f,0.1f,0.2f,0.5f,0.3f,0.7f};
        bucketSort(arr);
        for(float val : arr){
            System.out.print(val + " ");
        }
    }
}
