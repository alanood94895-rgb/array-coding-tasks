public class make2 {
    public static void main(String[] args) {
        System.out.println(make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        System.out.println(make2(new int[]{4}, new int[]{1, 2, 3}));
        System.out.println(make2(new int[]{}, new int[]{1, 2}));
    }
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length >= 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = b[0];
            result[1] = b[1];
        }
        return result;
    }
}

