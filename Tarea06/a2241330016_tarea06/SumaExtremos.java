package a2241330016_tarea06;
import java.util.Scanner;
public class SumaExtremos {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int N = sc.nextInt();

        if (N > 0) {
            int centenas = N / 100;
            int unidades = N % 10;
            int suma = centenas + unidades;
            System.out.println("Suma de extremos: " + suma);
        } else {
            System.out.println("El numero no es positivo.");
        }
    }
}
