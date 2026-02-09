package a2241330016_tarea06;
import java.util.Scanner;
public class SaltoCaracol {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Altura (H): ");
        int H = sc.nextInt();
        System.out.print("Sube por dia (S): ");
        int S = sc.nextInt();
        System.out.print("Resbala por noche (R): ");
        int R = sc.nextInt();

        int dias;
        if (S >= H) {
            dias = 1;
        } else {
            dias = (H - R - 1) / (S - R) + 1;
        }

        System.out.println("Dias: " + dias);
    }
}
