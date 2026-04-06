public class makeMiddle {
    public static void main (String[] args){
        int[] nums0= {1,2,3,4};
        int[] nums1= {7, 1, 2, 3, 4, 9};
        int[] nums2= {1, 2};

        System.out.println(makeMiddle (new int[]{1,2,3,4}));
        System.out.println(makeMiddle (new int[]{7, 1, 2, 3, 4, 9}));
        System.out.println(makeMiddle (new int[]{1,2}));
    }
    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        int mid1 =nums .length /2+1 ;
        return new int[]{nums[mid - 1], nums[mid]};

    }


}
