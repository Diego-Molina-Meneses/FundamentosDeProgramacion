package a2241330016_tarea06;
import java.util.Scanner;
public class PropagacionPaquetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia (D): ");
        int D = sc.nextInt();
        System.out.print("Velocidad (V): ");
        int V = sc.nextInt();

        int tiempo = D / V;

        if (D % V > 0) {
            tiempo = tiempo + 1;
        }

        System.out.println("Tiempo total: " + tiempo);
    }
}
