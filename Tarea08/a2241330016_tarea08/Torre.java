package a2241330016_tarea08;
import java.util.Scanner;
public class Torre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa fila inicial (f1): ");
        int f1 = sc.nextInt();
        System.out.print("Ingresa columna inicial (c1): ");
        int c1 = sc.nextInt();

        System.out.print("Ingresa fila final (f2): ");
        int f2 = sc.nextInt();
        System.out.print("Ingresa columna final (c2): ");
        int c2 = sc.nextInt();

        if ((f1 == f2 || c1 == c2) && !(f1 == f2 && c1 == c2)) {
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }
    }
}
