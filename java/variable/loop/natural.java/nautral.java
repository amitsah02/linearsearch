import java.util.*;

public class nautral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int s = 0;
        int n = sc.nextInt();
        while (i <= n) {
            // System.out.println(i + " ");
            s = s + i;
            i++;
            System.out.println(s + " ");

        }
        System.out.println(s + " ");
    }
}
