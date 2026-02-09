package a2241330016_tarea05;
import java.util.Scanner;
public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        double X = sc.nextDouble();

        double valor = Math.sqrt(X * X);

        System.out.println("Valor absoluto: " + valor);
    }
}
