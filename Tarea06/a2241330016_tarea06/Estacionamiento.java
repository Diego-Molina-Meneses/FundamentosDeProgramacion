package a2241330016_tarea06;
import java.util.Scanner;
public class Estacionamiento {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Tiempo en minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int residuo = minutos - horas * 60;

        if (residuo > 0) {
            horas++;
        }

        System.out.println("Horas a cobrar: " + horas);
    }
}
