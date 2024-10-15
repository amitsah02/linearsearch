public class overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }
    public static float sum(float a, float b) {
        return a + b;

    }

    public static void main(String args[]) {
        System.out.println(sum(5, 8));
        System.out.println(sum(5.5f, 8.5f));
    }
}