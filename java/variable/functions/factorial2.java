public class factorial2 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        // here we have not to declare n inn this way

        System.out.println(factorial(0));
    }
}