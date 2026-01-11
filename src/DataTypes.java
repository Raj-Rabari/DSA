import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {
        int a;
        Test obj = new Test();
        long l = 123;
        System.out.println(obj.a);

        int[] arr ; // declaration of array
        arr = new int[10]; // memory allocation

        int[] arr2 = {1,2,3,4}; // all in one

        Arrays.stream(arr2).map(num -> num * 2).forEach(System.out::print);
    }
}

class Test {
    int a;
}