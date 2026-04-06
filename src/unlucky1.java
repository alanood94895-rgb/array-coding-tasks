public class unlucky1 {
    public static void main(String[] args) {
        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{1, 1, 1}));

    }

    public static boolean unlucky1(int[] nums) {
        int n = nums.length;


        if (n >= 2 && nums[0] == 1 && nums[1] == 3) return true;
        if (n >= 3 && nums[1] == 1 && nums[2] == 3) return true;
        if (n >= 2 && nums[n - 2] == 1 && nums[n - 1] == 3) return true;

        return false;
    }
}
