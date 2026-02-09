package a2241330016_tarea05;
import java.util.Scanner;
public class RepartoCartas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Numero de jugadores (J): ");
        int J = sc.nextInt();

        int cartas = 52 / J;

        System.out.println("Cartas para cada jugador: " + cartas);
    }
}
