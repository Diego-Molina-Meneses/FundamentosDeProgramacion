package a2241330016_tarea05;
import java.util.Scanner;
public class SaltoGrillo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Salto por impulso (K cm): ");
        int K = sc.nextInt();
        System.out.print("Distancia total (D cm): ");
        int D = sc.nextInt();

        int saltos = D / K;

        System.out.println("Cantidad de saltos: " + saltos);
    }
}
