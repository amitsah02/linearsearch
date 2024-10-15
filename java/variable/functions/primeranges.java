public class primeranges {
    public static boolean isprime(int n) {
        int i;
        // if (int i == 2) {
        // return true;
        // }
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
            // System.out.println();
        }

    }

    public static void main(String args[]) {
        // System.out.println(isprime(9));
        primeInRange(20);
    }
}
