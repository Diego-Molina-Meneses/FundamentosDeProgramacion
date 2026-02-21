package a2241330016_tarea10;
import java.util.Scanner;
public class ClasificadorIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer octeto (0 a 255): ");
        int octeto1 = sc.nextInt();

        if (octeto1 >= 1 && octeto1 <= 126) {
            System.out.println("Clase A");
        } else if (octeto1 >= 128 && octeto1 <= 191) {
            System.out.println("Clase B");
        } else if (octeto1 >= 192 && octeto1 <= 223) {
            System.out.println("Clase C");
        } else if (octeto1 == 127) {
            System.out.println("Direccion de Loopback");
        } else {
            System.out.println("Clase especial o reservada");
        }
    }
}
