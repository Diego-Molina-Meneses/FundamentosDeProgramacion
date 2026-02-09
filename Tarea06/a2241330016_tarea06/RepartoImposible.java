package a2241330016_tarea06;
import java.util.Scanner;
public class RepartoImposible {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Total (N): ");
        int N = sc.nextInt();
        System.out.print("Por grupo (K): ");
        int K = sc.nextInt();

        int Q = N / K;
        int sobrante = N - (Q * K);

        System.out.println("Cociente entero Q: " + Q);

        if (sobrante > 0) {
            System.out.println("El capitan se lleva: " + sobrante);
        } else {
            System.out.println("El capitan se lleva: 0");
        }
    }
}
