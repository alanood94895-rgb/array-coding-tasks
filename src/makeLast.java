public class makeLast {
    public static void main(String[] args) {
        System.out.println(makeLast(new int[]{4, 5, 6}));
        System.out.println(makeLast(new int[]{1, 2}));
        System.out.println(makeLast(new int[]{3}));
    }

    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }


}
