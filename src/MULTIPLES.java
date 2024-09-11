public class Multiples {
    public static int counting_multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean divisible = i % a == 0;
            boolean divisible2 = i % b == 0;
            if (divisible) {
                count = count + 1;
            }else if (divisible2) {
                count = count + 1;
            }
        }
        return count;
    }
    public static int main(int n, int a, int b) {
        return counting_multiples(n, a, b);
    }
    public static void main(String[] args) {
        System.out.println(main(1000, 3, 5));
    }
}