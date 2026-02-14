package a2241330016_tarea08;
import java.util.Scanner;
public class sandias {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el peso W: ");
        int w = sc.nextInt();

        if (w % 2 == 0 && w > 2) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
