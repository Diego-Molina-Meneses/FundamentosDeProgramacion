package a2241330016_practica7;
import java.util.Scanner;
public class Ejercicio6_scanner {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int parcial1, parcial2, parcial3, resultado;

        System.out.println("Introduce la calificacion del parcial 1:");
        parcial1 = sc.nextInt();

        System.out.println("Introduce la calificacion del parcial 2:");
        parcial2 = sc.nextInt();

        System.out.println("Introduce la calificacion del parcial 3:");
        parcial3 = sc.nextInt();

        resultado = (parcial1 + parcial2 + parcial3) / 3;

        if (resultado >= 7) {
            System.out.println("Alumno Acreditado");
        } else {
            System.out.println("Alumno No Acreditado");
        }
    }
}
