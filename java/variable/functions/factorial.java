import java.util.*;

public class factorial {
    public static void fact(int n, int f) {
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        // int n = 5;
        fact(n, 1);
    }

}
