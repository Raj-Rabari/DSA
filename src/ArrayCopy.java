import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[2] = 56;

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        int[] src = {9,8,7};
        int[] dest = new int[src.length];

        System.arraycopy(src,0, dest, 0, src.length);

        dest[2] = 99;

        System.out.println("src: " + Arrays.toString(src));
        System.out.println("dest: " + Arrays.toString(dest));
    }
}
