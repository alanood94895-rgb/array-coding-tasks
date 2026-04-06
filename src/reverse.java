public class reverse {
    public static void main(String[] args) {
        int[] result1 = reverse (new int[]{1, 2, 3});
        int[] result2 = reverse (new int[]{5, 11, 9});
        int[] result3 = reverse (new int[]{7, 0, 0});

        System.out.println(reverse (new int[]{1, 2, 3}));
        System.out.println(reverse (new int[]{5, 11, 9}));
        System.out.println(reverse (new int[]{7, 0, 0}));


        }
    public static int[] reverse(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }
}
