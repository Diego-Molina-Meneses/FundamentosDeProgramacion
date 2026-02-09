package a2241330016_tarea06;
import java.util.Scanner;
public class PrimerDigito {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int N = sc.nextInt();

        int primer = N / 100;

        if (primer >= 1 && primer <= 9) {
            System.out.println("Primer digito: " + primer);
        } else {
            System.out.println("No es valido.");
        }
    }
}
