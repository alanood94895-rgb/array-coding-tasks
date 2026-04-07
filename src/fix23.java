public class fix23 {
    public static void main(String[] args) {
        int[] nums0 = {1, 2, 3};
        int[] nums1 = {2, 3, 5};
        int[] nums2 = {1, 2, 1};

        System.out.println(fix23(new int[]{1, 2, 3}));
        System.out.println(fix23(new int[]{2, 3, 5}));
        System.out.println(fix23(new int[]{1, 2, 1}));
    }
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
            return nums;

// a
    }
}
