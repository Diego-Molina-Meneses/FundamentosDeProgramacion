package a2241330016_tarea08;
import java.util.Scanner;
public class saltocaballo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa x1: ");
        int x1 = sc.nextInt();
        System.out.print("Ingresa y1: ");
        int y1 = sc.nextInt();

        System.out.print("Ingresa x2: ");
        int x2 = sc.nextInt();
        System.out.print("Ingresa y2: ");
        int y2 = sc.nextInt();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            System.out.println("Movimiento Valido");
        } else {
            System.out.println("Invalido");
        }
    }
}
