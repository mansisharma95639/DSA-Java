public class HollowRectangle {
        public static void hollowRectangle(int x)
        {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (i == 0 || j == 0 || i == x - 1
                        || j == x - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String args[])
        {
            int x = 4;
            hollowRectangle(x);
        }
}

// OUTPUT
// ****
// *  *
// *  *
// ****
