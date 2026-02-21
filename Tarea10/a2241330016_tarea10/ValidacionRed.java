package a2241330016_tarea10;
import java.util.Scanner;
public class ValidacionRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Segundo octeto: ");
        int octeto2 = sc.nextInt();

        System.out.print("Tercer octeto: ");
        int octeto3 = sc.nextInt();

        if (octeto2 == 0) {
            if (octeto3 == 5) {
                System.out.println("Acceso concedido a Contabilidad");
            } else {
                System.out.println("Acceso denegado: Subred incorrecta");
            }
        } else {
            System.out.println("Acceso denegado: Red externa");
        }
    }
}
