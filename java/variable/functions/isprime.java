public class isprime {
    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }
        // for (int i = 2; i <= n - 1; i++) {// this is gissa pitta code in java
        for (int i = 2; i <= Math.sqrt(n); i++) {// this is optimised code in java

            if (n % i == 0) {// completely dividing
                return false;
            }
        }
        return true;
    }
// we have to run above code for running below code for prime no. rnges
    // public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(prime());
        primesInRange(20);
    }
}
