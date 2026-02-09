package a2241330016_tarea06;
import java.util.Scanner;
public class Formador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        System.out.print("C: ");
        int C = sc.nextInt();

        if (A >= 0 && A <= 9)
            if (B >= 0 && B <= 9)
                if (C >= 0 && C <= 9) {
                    int numero = A * 100 + B * 10 + C;
                    System.out.println("Numero formado: " + numero);
                }
    }
}
