package a2241330016_practica7;
import java.util.Scanner;
public class Ejercicio_8_2_mc_scanner {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Ingrese lado 1:");
        a = sc.nextDouble();

        System.out.println("Ingrese lado 2:");
        b = sc.nextDouble();

        System.out.println("Ingrese lado 3:");
        c = sc.nextDouble();

        if(a == b && b == c)
            System.out.println("Es equilátero");
        else if(a == b || a == c || b == c)
            System.out.println("Es isósceles");
        else
            System.out.println("Es escaleno");
    }
}
