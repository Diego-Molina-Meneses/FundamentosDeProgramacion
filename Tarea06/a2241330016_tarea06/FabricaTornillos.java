package a2241330016_tarea06;
import java.util.Scanner;
public class FabricaTornillos {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Tornillos totales (X): ");
        int X = sc.nextInt();

        int cajas = X / 12;
        int sueltos = X - (cajas * 12);

        System.out.println("Cajas completas: " + cajas);

        if (sueltos > 0) {
            System.out.println("Tornillos sueltos: " + sueltos);
        } else {
            System.out.println("Tornillos sueltos: 0");
        }
     }
}
