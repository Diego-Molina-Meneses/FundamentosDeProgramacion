package a2241330016_tarea10;
import java.util.Scanner;
public class IPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Intentos fallidos: ");
        int intentos = sc.nextInt();

        System.out.print("Es IP conocida? (1=Si, 0=No): ");
        int conocidaNum = sc.nextInt();
        boolean esConocida = (conocidaNum == 1);

        if (!esConocida) {
            if (intentos > 3) {
                System.out.println("Bloquear IP permanentemente");
            } else if (intentos >= 1 && intentos <= 3) {
                System.out.println("Solicitar Captcha");
            } else {
                System.out.println("Permitir reintento");
            }
        } else {
            if (intentos > 10) {
                System.out.println("Bloquear temporalmente por 15 min");
            } else if (intentos > 5) {
                System.out.println("Alertar al admin");
            } else {
                System.out.println("Permitir reintento");
            }
        }
    }
}
