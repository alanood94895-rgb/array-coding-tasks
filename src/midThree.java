public class midThree {
    public static void main (String[] args){
        int []nums= {1, 2, 3, 4, 5};
        int []nums1= {8, 6, 7, 5, 3, 0, 9};
        int []nums2= {1, 2, 3};

        int[] result =midThree(nums);
        for(Integer n:result){
            System.out.println(n);
        }

    }
    public static int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

}
