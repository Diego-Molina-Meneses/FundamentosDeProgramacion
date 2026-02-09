package a2241330016_tarea06;
import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad a retirar: ");
        int cantidad = sc.nextInt();

        int entrega = (cantidad / 100) * 100;
        int perdida = cantidad - entrega;

        System.out.println("Entrega del cajero: " + entrega);

        if (perdida > 0) {
            System.out.println("Perdida del usuario: " + perdida);
        } else {
            System.out.println("Perdida del usuario: 0");
        }
    }
}
