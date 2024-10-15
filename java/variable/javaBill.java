import java.util.*;

public class javaBill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of pen,pencil and Eraser ");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float Eraser = sc.nextFloat();
        double Total_cost = (pen + pencil + Eraser);
        double GST = (18 * Total_cost) / 100;
        System.out.println(GST);
        double payable = Total_cost + GST;
        System.out.println("Total bill = " + payable);
    }
}