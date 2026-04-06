public class maxTriple {
    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3})); // 3
        System.out.println(maxTriple(new int[]{1, 5, 3})); // 5
        System.out.println(maxTriple(new int[]{5, 2, 3})); // 5
    }

    public static int maxTriple(int[] nums) {
        int mid = nums.length / 2;
        int first = nums[0];
        int middle = nums[mid];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(middle, last));
    }

}
