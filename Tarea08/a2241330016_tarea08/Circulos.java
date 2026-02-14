package a2241330016_tarea08;
import java.util.Scanner;
public class Circulos {
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

        System.out.print("Ingresa r1: ");
        double r1 = sc.nextDouble();
        System.out.print("Ingresa r2: ");
        double r2 = sc.nextDouble();

        double dist2 = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double sumaR2 = Math.pow(r1 + r2, 2);

        if (dist2 == sumaR2) {
            System.out.println("Tangentes");
        } else if (dist2 < sumaR2) {
            System.out.println("Traslapan");
        } else {
            System.out.println("No se tocan");
        }
    }
}
