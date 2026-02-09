package a2241330016_tarea05;
import java.util.Scanner;
public class Refrescos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de refrescos (R): ");
        int R = sc.nextInt();

        int packs = R / 6;
        int sobran = R - (packs * 6);

        System.out.println("Refrescos que sobran: " + sobran);
    }
}
