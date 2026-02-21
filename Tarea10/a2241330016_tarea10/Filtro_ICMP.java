package a2241330016_tarea10;
import java.util.Scanner;
public class Filtro_ICMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamano del paquete (bytes): ");
        int tam = sc.nextInt();

        System.out.print("Protocolo (1=ICMP, 2=TCP): ");
        int protocolo = sc.nextInt();

        if (protocolo == 1) { // ICMP
            if (tam > 65535) {
                System.out.println("Ataque Ping de la Muerte detectado");
            } else {
                System.out.println("Paquete ICMP normal");
            }
        } else if (protocolo == 2) { // TCP
            System.out.println("Ignorar, no es ICMP");
        } else {
            System.out.println("Protocolo no valido");
        }
    }
}
