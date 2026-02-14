package a2241330016_tarea08;
import java.util.Scanner;
public class Puntorectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingresa y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Ingresa x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Ingresa y2: ");
        double y2 = sc.nextDouble();

        System.out.print("Ingresa px: ");
        double px = sc.nextDouble();
        System.out.print("Ingresa py: ");
        double py = sc.nextDouble();

        if (px > x1 && px < x2 && py > y1 && py < y2) {
            System.out.println("Dentro");
        } else if (px >= x1 && px <= x2 && py >= y1 && py <= y2) {
            System.out.println("Borde");
        } else {
            System.out.println("Fuera");
        }
    }
}
