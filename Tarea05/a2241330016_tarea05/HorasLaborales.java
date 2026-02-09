package a2241330016_tarea05;
import java.util.Scanner;
public class HorasLaborales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Segundos trabajados: ");
        int S = sc.nextInt();

        int horas = S / 3600;

        System.out.println("Horas completas: " + horas);
    }
}
