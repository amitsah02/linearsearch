public class summation {
    public static void sum(int n) {
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            // System.out.print(r); // here we don't need to print because it repeates every
            // iterations
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        sum(346);
    }
}
