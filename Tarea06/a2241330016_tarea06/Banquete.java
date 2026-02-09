package a2241330016_tarea06;
import java.util.Scanner;
public class Banquete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kilos de comida (M): ");
        int M = sc.nextInt();
        System.out.print("Platos servidos (P): ");
        int P = sc.nextInt();

        int invitados = M / 2;
        int fuera = invitados - P;

        if (fuera > 0) {
            System.out.println("Invitados fuera: " + fuera);
        } else {
            System.out.println("Nadie queda fuera.");
        }
    }
}
