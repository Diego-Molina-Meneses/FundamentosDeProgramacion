package a2241330016_tarea06;
import java.util.Scanner;
public class AreaCirculoEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radio: ");
        int r = sc.nextInt();

        int area = 3 * r * r;

        if (area > 78) {
            area = 78;
        }

        System.out.println("Area aproximada: " + area);
    }
}
