package a2241330016_tarea08;
import java.util.Scanner;
public class Categoriaboxeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el peso en kg: ");
        double peso = sc.nextDouble();

        if (peso < 52) {
            System.out.println("Mosca");
        } else if (peso <= 63) {
            System.out.println("Ligero");
        } else if (peso <= 75) {
            System.out.println("Mediano");
        } else if (peso <= 91) {
            System.out.println("Pesado");
        } else {
            System.out.println("Super Pesado");
        }
    }
}
