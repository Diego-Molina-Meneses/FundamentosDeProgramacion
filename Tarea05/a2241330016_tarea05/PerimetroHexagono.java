package a2241330016_tarea05;
import java.util.Scanner;
public class PerimetroHexagono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor del lado: ");
        double L = sc.nextDouble();

        double perimetro = L + L + L + L + L + L;

        System.out.println("Perimetro: " + perimetro);

    }
}
