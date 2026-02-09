package a2241330016_tarea05;
import java.util.Scanner;
public class FormadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa A (0-9): ");
        int A = sc.nextInt();
        System.out.print("Ingresa B (0-9): ");
        int B = sc.nextInt();
        System.out.print("Ingresa C (0-9): ");
        int C = sc.nextInt();

        int numero = A * 100 + B * 10 + C;

        System.out.println("El numero formado es: " + numero);

    }
}
