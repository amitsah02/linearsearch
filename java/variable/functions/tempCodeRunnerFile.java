public class palindrome {
    public static void ispalinmdrome(int n) {
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.println(lastdigit);
            n = n / 10;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println(ispalinmdrome(121));
    }
}
