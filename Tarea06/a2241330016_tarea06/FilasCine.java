package a2241330016_tarea06;
import java.util.Scanner;
public class FilasCine {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ticket: ");
        int N = sc.nextInt();

        if (N > 0) {
            int fila = (N - 1) / 8 + 1;
            System.out.println("Fila: " + fila);
        } else {
            System.out.println("Ticket invalido.");
        }
    }
}
