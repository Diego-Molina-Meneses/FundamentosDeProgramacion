package a2241330016_tarea08;
import java.util.Scanner;
public class SistemaMedallas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la calificacion 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingresa la calificacion 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Ingresa la calificacion 3: ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;

        if (promedio > 90) {

            if (n1 == 100 || n2 == 100 || n3 == 100) {
                System.out.println("Oro con Honores");
            } else {
                System.out.println("Oro");
            }

        } else if (promedio >= 80) {
            System.out.println("Plata");
        } else {
            System.out.println("Sin Medalla");
        }
    }
}
