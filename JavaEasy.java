public class JavaEasy {
        public static void main(String[] args) {
                long start = System.currentTimeMillis();
                for (int i = 1; i <=100; i++) {
                        System.out.print(i+i);
                        System.out.print(i*i);
                        System.out.print(i/i);
                        System.out.print(i-i);
                        System.out.println();
                }
                System.out.println(System.currentTimeMillis() - start);
        }
}
