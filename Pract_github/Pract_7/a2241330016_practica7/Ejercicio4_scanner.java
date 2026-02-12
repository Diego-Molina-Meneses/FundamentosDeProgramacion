package a2241330016_practica7;
import java.util.Scanner;
public class Ejercicio4_scanner {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero:");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("Es positivo");
        } else {
            if (num == 0) {
                System.out.println("Es negativo");
            } else {
                System.out.println("Es cero");
            }
        }
    }
}
