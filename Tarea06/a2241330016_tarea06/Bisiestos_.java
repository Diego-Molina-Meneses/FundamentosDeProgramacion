package a2241330016_tarea06;
import java.util.Scanner;
public class Bisiestos_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anio final: ");
        int Y = sc.nextInt();

        int bisiestos = Y / 4;

        if (Y == 0) {
            bisiestos = 0;
        }

        System.out.println("Anios bisiestos: " + bisiestos);
    }
}
