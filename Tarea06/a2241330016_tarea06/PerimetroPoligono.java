package a2241330016_tarea06;
import java.util.Scanner;
public class PerimetroPoligono {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado L: ");
        double L = sc.nextDouble();

        if (L > 0) {
            double perimetro = L + L + L + L + L + L;
            System.out.println("Perimetro: " + perimetro);
        } else {
            System.out.println("El lado debe ser mayor que cero.");
        }

    }
}
