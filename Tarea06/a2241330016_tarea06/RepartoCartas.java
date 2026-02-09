package a2241330016_tarea06;
import java.util.Scanner;
public class RepartoCartas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Jugadores: ");
        int J = sc.nextInt();

        if (J > 0) {
            int cartas = 52 / J;
            System.out.println("Cartas por jugador: " + cartas);
        } else {
            System.out.println("Numero invalido de jugadores.");
        }
    }
}
