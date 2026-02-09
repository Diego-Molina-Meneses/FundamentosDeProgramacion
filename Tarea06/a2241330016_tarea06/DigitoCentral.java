package a2241330016_tarea06;
import java.util.Scanner;
public class DigitoCentral {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int N = sc.nextInt();

        if (N >= 100 && N <= 999) {
            int decenas = (N / 10) % 10;
            System.out.println("Digito central: " + decenas);
        } else {
            System.out.println("No es un numero de 3 cifras.");
        }
    }
}
