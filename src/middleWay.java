public class middleWay {
    public static void main (String[] args){
        int [] nums0= middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        int[] nums1 = middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0});
        int[] nums2 = middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});

        System.out.println(middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        System.out.println(middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
        System.out.println(middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
    }
    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}
