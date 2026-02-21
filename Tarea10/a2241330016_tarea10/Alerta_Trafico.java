package a2241330016_tarea10;
import java.util.Scanner;
public class Alerta_Trafico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la hora (0-23): ");
        int hora = sc.nextInt();

        System.out.print("Ingrese el volumen de datos (GB): ");
        double volumen = sc.nextDouble();

        if (hora >= 2 && hora <= 5) { // Madrugada
            if (volumen > 50) {
                System.out.println("Alerta: Posible exfiltracion de datos");
            } else {
                System.out.println("Trafico nocturno normal");
            }
        } else { // Cualquier otra hora
            if (volumen > 500) {
                System.out.println("Alerta: Congestion de red");
            } else {
                System.out.println("Trafico bajo control");
            }
        }
    }
}
