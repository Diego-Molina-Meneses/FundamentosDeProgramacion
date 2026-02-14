package a2241330016_tarea08;
import java.util.Scanner;
public class TriangulosPorAngulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa A: ");
        int A = sc.nextInt();
        System.out.print("Ingresa B: ");
        int B = sc.nextInt();
        System.out.print("Ingresa C: ");
        int C = sc.nextInt();

        if (A > 0 && B > 0 && C > 0 && (A + B + C == 180)) {
            if (A == 90 || B == 90 || C == 90) {
                System.out.println("Rectangulo");
            } else if (A > 90 || B > 90 || C > 90) {
                System.out.println("Obtusangulo");
            } else {
                System.out.println("Acutangulo");
            }
        } else {
            System.out.println("Angulos Invalidos");
        }
    }
}
