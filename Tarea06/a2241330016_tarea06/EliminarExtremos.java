package a2241330016_tarea06;
import java.util.Scanner;
public class EliminarExtremos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int N = sc.nextInt();

        if (N >= 1000 && N <= 9999) {
            int centrales = (N / 10) % 100;
            System.out.println("Cifras centrales: " + centrales);
        } else {
            System.out.println("No es de 4 cifras.");
        }
    }
}
