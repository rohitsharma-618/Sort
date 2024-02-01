public class move_0_InLast {
    static void move (int[] arr){

        int n = arr.length;                        //time complexity --> O(n^2)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] == 0 && arr[j + 1] != 0) {
                    //  swap value
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 0, 3, 42,0};
       move(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
