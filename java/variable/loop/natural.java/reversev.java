public class reversev {
    public static void main(String args[]) {

        int n = 23456;
        while (n > 0) {
            int lastdligit = n % 10;
            System.out.print(lastdligit + " ");
            n = n / 10;

        }
        // System.out.println();
    }

}
