package a2241330016_tarea05;
import java.util.Scanner;
public class FilasCine {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Numero de ticket (N): ");
        int N = sc.nextInt();

        int fila = ((N - 1) / 8) + 1;

        System.out.println("Te toca la fila: " + fila);
    }
}
