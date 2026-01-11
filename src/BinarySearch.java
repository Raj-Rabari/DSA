import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr2 = {1,2,3};
        System.out.println(arr2.length);
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(2);
        arr.add(8);
        arr.add(9);
        arr.add(22);
        arr.add(7);

        Collections.sort(arr);
        System.out.println(binarySearch(arr,8));
    }

    public static int binarySearch(ArrayList<Integer> arr,int num) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midItem = arr.get(mid);

            if (num > midItem) {
                start = mid + 1;
            } else if (num < midItem) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
