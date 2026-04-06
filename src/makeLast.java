public class makeLast {
    public static void main(String[] args) {
        printArray(makeLast(new int[]{4, 5, 6}));
        printArray(makeLast(new int[]{1, 2}));
        printArray(makeLast(new int[]{3}));
    }

    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.println(java.util.Arrays.toString(arr));
    }

}
