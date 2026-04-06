public class makeEnds {
    public static void main(String[] args) {
        printArray(makeEnds(new int[]{1, 2, 3}));
        printArray(makeEnds(new int[]{1, 2, 3, 4}));
        printArray(makeEnds(new int[]{7, 4, 6, 2}));
    }

    public static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static void printArray(int[] arr) {
        System.out.println(java.util.Arrays.toString(arr));
    }
}

