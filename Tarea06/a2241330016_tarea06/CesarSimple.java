package a2241330016_tarea06;
import java.util.Scanner;
public class CesarSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Secreto (0-9): ");
        int secreto = sc.nextInt();
        System.out.print("Llave (0-9): ");
        int llave = sc.nextInt();

        int cifra = secreto + llave;

        if (cifra >= 10) {
            cifra = cifra - 10;
        }

        System.out.println("Cifrado: " + cifra);
    }
}
