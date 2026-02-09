package a2241330016_tarea05;
import java.util.Scanner;
public class Complemento_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un digito (0-9): ");
        int D = sc.nextInt();

        int complemento = 10 - D;

        System.out.println("Falta para llegar a 10: " + complemento);
    }
}
