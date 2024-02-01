public class Main {
    public static void main(String[] args) {
        System.out.println("It's a Sorting Lecture!");
    }
}
/*
 Bubble sort --> i) we do a certain no. (n -1 --> iterations) of passes & in every pass , we compare adjecent
                elements & swap them if they are not in correct order.

                ii) in every iteration , the largest num in the part of array to be processed
                    gets its correct position.

                iii) time complexity is == O(n^2).
                iv) maximum no of swaps in worst case in bubble sort --> n(n-1)/2 ----> no. are in decreasing order.
                 v) best case --> π(n)
                    worst case --> O(n^2)
                    average case --> θ(n^2)
                    In-place --> yes
                    stable --> yes
                    space complexity --> O(1)

       example :->    {3 , 2 ,7 , 1, 5} --> {1, 2, 3, 5, 7} (INCREASING ORDER)
                       // N-1 certain passes == (5-1 = 4)
 */  //bubble sort

/*
stable sort --> if num are same so the order will sored array is also same.
  ex.:-> {5 ,4 ,3 ,2 ,3*} ---> {2 , 3 , 3* ,4 , 5}
  unstable sort --> order may not be same.
  ex:-> {5 ,4 ,3 ,2 ,3*} ---> {2 , 3 , 3* ,4 , 5}
                       OR  {2 , 3* , 3 ,4 , 5}
 */ //stable and unstable sort

/*
selection sort --> i) select an element and put it at its correct position.
                  ii) best case --> π(n^2)
                    worst case --> O(n^2)
                    average case --> θ(n^2)
                    In-place --> Yes
                    stable --> No
                    space complexity --> O(1)

 */ // selection sort

/*
Insertion sort --> i) principle == take one element from the sorted part, iterate through the shorted part and find the
                                    correct position of this element.
                   ii)  best case --> π(n)
                    worst case --> O(n^2)
                    average case --> θ(n^2)
                    In-place --> yes
                    stable --> No
                    space complexity --> O(1)

 */  // Insertion sort

/*
Merge sort --> i) divide the array in 2 equal halves.
               ii)sort the two sub-arrays separately using recursion -- sub problem.
               iii)merge the 2 sorted sub-array to create an overall  sorted array -- self work.
               iv) best case --> π(n log (n) )
                    worst case --> O(n log(n) )
                    average case --> θ(n log (n) )
                    In-place --> No
                    stable --> Yes
                    space complexity --> O( n )
 */  // merge sort

/*
Quick sort -->i)QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element
                as a pivot and partitions the given array around the picked pivot by placing the pivot in its
                correct position in the sorted array.
              ii) best case --> π(n log (n) )
                  worst case --> O(n^2 ) --> can mostly be avoided by randomised quick sort.
                    average case --> θ(n log (n) )
                    In-place --> Yes
                    stable --> No
                    space complexity --> θ,π(log n ) --> best or average case
                         worst case --> O(n)
                  iii)Partition algorithm :--> (A) chose pivot and put it at its right position.
                      (B) we rearrange elements before and after pivot index such that.
                           *** pivot > pivot index < pivot ***
 */    // Quick sort

/*
Count sort :--> i) non Comparison based algorithm
                ii) range of number defined.
                iii) not an In-place.
                iv) worst case = O(n + max)
                    average case = θ(n+ max)
                    best case = π(n)

 */    // count sort

/*
Radix sort --> i)digit by digit sorting, in place value/ position of digit in a number.
               ii) time complexity --> O(n)
 */    // Radix Sort

/*
Bucket Sort --> i) put all elements in B no. of buckets.
                ii) sort such bucket individually.( any other sorting algorithm)
                iii) take out all elements & join them.
                iv) time complexity --> O(n)

 */     // Bucket Sort