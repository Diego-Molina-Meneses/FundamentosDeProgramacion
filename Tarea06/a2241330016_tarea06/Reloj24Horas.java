package a2241330016_tarea06;
import java.util.Scanner;
public class Reloj24Horas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Total de minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;

        if (horas >= 24) {
            horas = horas % 24;
        }

        System.out.println("Hora resultante: " + horas);
    }
}
