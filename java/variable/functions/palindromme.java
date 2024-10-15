import java.util.*;

public class palindromme {
    public static void ispalinmdrome(int n) {
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            // System.out.print(lastdigit);
            rev = rev * lastdigit + lastdigit;
            n = n / 10;
        }
        // System.out.println(rev); we cannot print here this statement becoz it provides rev value
        if (rev == n) {
            System.out.println("palindrome no.");
        } else {
            System.out.println("not palindrome ");
        }
    }

    public static void main(String ags[]) {

        ispalinmdrome(121);
    }
}
