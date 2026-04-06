public class sum2 {
    public static void main(String[] args) {
        System.out.println(sum2(new int[]{1, 2, 3}));
        System.out.println(sum2(new int[]{1, 1}));
        System.out.println(sum2(new int[]{1, 1, 1, 1}));

    }

    public static int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }
}
