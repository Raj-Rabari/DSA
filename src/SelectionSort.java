import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * In selection sort we search for an smallest element and swaps it with the starting index..
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            if(minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex]= arr[i];
                arr[i] = temp;
            }
        }
    }
}
