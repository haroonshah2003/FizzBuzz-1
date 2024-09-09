public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        while (n != 0){
            boolean even = n % 2 == 0;
            boolean odd = n % 2 == 1;
            if (even) {
                n = n / 2;
                System.out.println(n);
            } else if(odd) {
                n = n - 1;
                System.out.println(n);
            }
        }
    }
}
