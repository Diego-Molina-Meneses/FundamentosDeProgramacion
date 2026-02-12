package a2241330016_practica7;
import java.util.Scanner;
public class Ejercicio3_scanner {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero:");
        num = sc.nextInt();

        if ((num > 0) && (num % 2 == 0)) {
            System.out.println("Es positivo y par");
        }

        if ((num > 0) && (num % 2 > 0)) {
            System.out.println("Es positivo y impar");
        }

        if ((num < 0) && (num % 2 == 0)) {
            System.out.println("Es negativo y par");
        }

        if ((num < 0) && (num % 2 != 0)) {
            System.out.println("Es negativo y impar");
        }
    }
}
