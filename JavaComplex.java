public class JavaComplex {
        public static void main(String[] args) {
                long start = System.currentTimeMillis();
                for (int i = 1; i <= 100; i++) {
                        integral(4,3,i,i+1);
                }
                System.out.println(System.currentTimeMillis() - start);
        }

        public static void integral(double coeff,double power,double min,double max) {
                System.out.print( (coeff/(power+1))*Math.pow(max,power+1) - (coeff/(power+1))*Math.pow(min,power+1) );
                System.out.println();
        }
}
