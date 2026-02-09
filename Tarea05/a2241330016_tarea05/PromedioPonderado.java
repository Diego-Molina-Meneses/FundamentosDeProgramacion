package a2241330016_tarea05;
import java.util.Scanner;
public class PromedioPonderado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double N1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double N2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double N3 = sc.nextDouble();

        double finalNota = N1*0.20 + N2*0.30 + N3*0.50;

        System.out.println("Nota final: " + finalNota);
    }
}
