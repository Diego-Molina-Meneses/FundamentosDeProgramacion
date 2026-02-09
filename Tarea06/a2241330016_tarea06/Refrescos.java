package a2241330016_tarea06;
import java.util.Scanner;
public class Refrescos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad R: ");
        int R = sc.nextInt();

        int packs = R / 6;
        int sobrante = R - (packs * 6);

        if (sobrante > 0) {
            System.out.println("Sobran: " + sobrante);
        } else {
            System.out.println("No sobran refrescos.");
        }
    }
}
