package a2241330016_tarea05;
import java.util.Scanner;
public class Banquete {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Kilos de comida (M): ");
        int M = sc.nextInt();
        System.out.print("Platos servidos (P): ");
        int P = sc.nextInt();

        int invitadosPotenciales = M / 2;
        int fuera = invitadosPotenciales - P;

        System.out.println("Invitados que quedan fuera: " + fuera);
    }
}
