package a2241330016_tarea06;
import java.util.Scanner;
public class SaltoGrillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia D: ");
        int D = sc.nextInt();
        System.out.print("Salto K: ");
        int K = sc.nextInt();

        if (D % K == 0) {
            int saltos = D / K;
            System.out.println("Saltos: " + saltos);
        } else {
            System.out.println("D no es multiplo de K.");
        }
    }
}
