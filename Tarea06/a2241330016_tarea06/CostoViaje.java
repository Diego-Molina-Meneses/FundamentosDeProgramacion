package a2241330016_tarea06;
import java.util.Scanner;
public class CostoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia K: ");
        double K = sc.nextDouble();

        double litros = K / 12;
        double costo = litros * 20;

        if (K > 500) {
            costo += 100;
        }

        System.out.println("Costo total: " + costo);
    }
}
