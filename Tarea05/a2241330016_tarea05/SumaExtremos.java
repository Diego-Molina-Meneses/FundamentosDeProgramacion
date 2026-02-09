package a2241330016_tarea05;
import java.util.Scanner;
public class SumaExtremos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero de 3 cifras: ");
        int n = sc.nextInt();

        int centenas = n / 100;
        int unidades = n % 10;
        int suma = centenas + unidades;

        System.out.println("La suma de extremos es: " + suma);
        
    }
}
