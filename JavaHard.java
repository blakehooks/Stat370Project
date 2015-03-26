public class JavaHard {
        public static void main(String[] args) {
                long start = System.currentTimeMillis();
                for (int i = 1; i <= 100; i++) {
                        quadratic(1,1,-i);
                }
                System.out.println(System.currentTimeMillis() - start);
        }

        public static void quadratic(int a, int b, int c) {
                System.out.print( (-1.0*b+Math.sqrt( Math.pow(b*1.0,2.0)-4.0*a*c ) ) /(2.0*a));
                System.out.println();
        }
}
