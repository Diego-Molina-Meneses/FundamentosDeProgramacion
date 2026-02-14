package a2241330016_tarea08;
import java.util.Scanner;
public class Divisionreclutas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa fuerza (0-100): ");
        double fuerza = sc.nextDouble();

        System.out.print("Ingresa vision (0.0-1.0): ");
        double vision = sc.nextDouble();

        if (edad >= 18 && edad <= 25) {
            if (fuerza > 80 && vision >= 0.8) {
                System.out.println("Fuerzas Especiales");
            } else if (fuerza > 50) {
                System.out.println("Estratega");
            } else {
                System.out.println("Infanteria");
            }
        } else {
            System.out.println("No apto");
        }
    }
}
