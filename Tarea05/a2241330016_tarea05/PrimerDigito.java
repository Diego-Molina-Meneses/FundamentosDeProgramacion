package a2241330016_tarea05;
import java.util.Scanner;
public class PrimerDigito {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero de 3 cifras: ");
        int n = sc.nextInt();

        int primer = n / 100;

        System.out.println("El primer digito (centenas) es: " + primer);
    } 
}
