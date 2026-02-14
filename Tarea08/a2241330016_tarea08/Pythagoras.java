package a2241330016_tarea08;
import java.util.Scanner;
public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa A: ");
        double A = sc.nextDouble();
        System.out.print("Ingresa B: ");
        double B = sc.nextDouble();
        System.out.print("Ingresa C (el mayor): ");
        double C = sc.nextDouble();

        double suma = A * A + B * B;
        double c2 = C * C;

        if (suma == c2) {
            System.out.println("Rectangulo");
        } else if (suma > c2) {
            System.out.println("Acutangulo");
        } else {
            System.out.println("Obtusangulo");
        }
    }
}
