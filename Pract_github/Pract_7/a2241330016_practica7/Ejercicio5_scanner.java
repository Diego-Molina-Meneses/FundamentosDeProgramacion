package a2241330016_practica7;
import java.util.Scanner;
public class Ejercicio5_scanner {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero:");
        num = sc.nextInt();

        if ((num > 0) && (num % 2 == 0)) {
            System.out.println("Es positivo y par");
        } else {
            if ((num > 0) && (num % 2 > 0)) {
                System.out.println("Es positivo y impar");
            } else {
                if ((num < 0) && (num % 2 == 0)) {
                    System.out.println("Es negativo y par");
                } else {
                    System.out.println("Es negativo y impar");
                }
            }
        }
    }
}
