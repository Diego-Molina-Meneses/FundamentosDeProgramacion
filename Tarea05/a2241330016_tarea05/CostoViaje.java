package a2241330016_tarea05;
import java.util.Scanner;
public class CostoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia en km: ");
        double K = sc.nextDouble();

        double litros = K / 12;
        double costo = litros * 20;

        System.out.println("Costo total: " + costo);
    }
}
