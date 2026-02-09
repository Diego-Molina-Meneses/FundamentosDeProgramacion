package a2241330016_tarea06;
import java.util.Scanner;
public class Intercambio {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        int A = sc.nextInt();
        System.out.print("Valor B: ");
        int B = sc.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("Nuevo A: " + A);
        System.out.println("Nuevo B: " + B);
    }
}
