public class FirstMissingPositive {
    public static void main(String[] args){
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive((arr)));
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position (Cyclic Sort)
        // Ideally, value 'x' should be at index 'x - 1' (e.g., 1 at index 0)
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Step 2: Scan to find the first index that doesn't match
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // The missing number
            }
        }

        // Step 3: If all positions match, the missing number is n + 1
        return n + 1;
    }

    // Helper method to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
