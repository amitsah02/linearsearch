import java.util.*;

public class callvalue {
    public static void swap(int a, int b) {
        a = 30;
        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        int a = 50;
        int b = 40;
        // swapping
        int temp = a;
        a = b;
        b = temp;
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        swap(a, b);

    }

}

public static int  multiply(int a, int b) {
    int product = a * b;
    return product;
}

public static void main(String args[]) {
    int a = 6;
    int b = 5;
    int prod = multiply(a, b);
    System.out.println("a*b = " + prod);

}
