package a2241330016_tarea08;
import java.util.Scanner;
public class TieBreakTenis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Puntos Jugador A: ");
        int A = sc.nextInt();
        System.out.print("Puntos Jugador B: ");
        int B = sc.nextInt();

        if (A >= 6 || B >= 6) {

            if (A == 6 && B <= 4) {
                System.out.println("Gana A");
            } else if (B == 6 && A <= 4) {
                System.out.println("Gana B");
            } else if (A == 7 && (B == 5 || B == 6)) {
                System.out.println("Gana A");
            } else if (B == 7 && (A == 5 || A == 6)) {
                System.out.println("Gana B");
            } else {
                System.out.println("En juego");
            }

        } else {
            System.out.println("En juego");
        }
    }
}
