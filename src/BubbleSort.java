import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * In bubble sort we perform comparisons and swaps the larger elements so at the end of one iteration the largest element will be at the last index of the array,
     * in second iteration the second last element will be at the second last index of the array, and so on do this for n-1 times to sort the array
     * @param arr
     */
    static void bubbleSort(int[] arr) {
        for (int i = 0;i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0;j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            if (!swap) break;
        }
    }
}
