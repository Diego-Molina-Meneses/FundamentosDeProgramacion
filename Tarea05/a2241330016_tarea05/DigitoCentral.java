package a2241330016_tarea05;
import java.util.Scanner;
public class DigitoCentral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero de 3 cifras: ");
        int n = sc.nextInt();

        int decenas = (n / 10) % 10;

        System.out.println("El digito de las decenas es: " + decenas);
        
    }
}
