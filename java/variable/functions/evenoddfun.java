public class evenoddfun {
    public static boolean evenno(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(evenno(999));
    }
}
