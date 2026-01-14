import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,32,2,3,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int nextItem = arr[i];
            int nextIndex = i;
            boolean flag = true;
            while(flag) {
                int rank = findRank(arr,nextItem,nextIndex);
                int temp = arr[rank];
                arr[rank] = nextItem;
                nextIndex = rank;
                nextItem = temp;
                flag = rank != i;
            }
        }
    }

    static int findRank(int[] arr,int ele,int index) {
        int rank = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ele && index != i)
                rank++;
        }
        return rank;
    }
}
