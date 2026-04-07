public class biggerTwo {

        public static void main(String[] args) {
            System.out.println(biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
            System.out.println(biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
            System.out.println(biggerTwo(new int[]{1, 1}, new int[]{1, 2}));
        }

        public static int[] biggerTwo(int[] a, int[] b) {
            int sumA = a[0] + a[1];
            int sumB = b[0] + b[1];

            if (sumA >= sumB) {
                return a;
            } else {
                return b;
            }
        }
}
