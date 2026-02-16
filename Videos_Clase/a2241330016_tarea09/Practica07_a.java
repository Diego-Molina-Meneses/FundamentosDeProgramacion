package a2241330016_tarea09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Practica07_a {
    public static void main(String[] args) throws IOException {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int a , b , c; //coeficientes ax^2 + bx+c = 0
        double x1 , x2 , d; //soluciones y determinante

        System.out.println("Introduzca el primer coeficiente (a): ");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Introduzca el segundo coeficiente (b): ");
        b = Integer.parseInt(entrada.readLine());
        System.out.println("Introduzca el tercer coeficiente (c): ");
        c = Integer.parseInt(entrada.readLine());

        //calculando el determinante
        d = ((b*b) - 4 * a * c);

        if(d > 0) {
        //condicion verdadera
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Solucion: " + x1);
        System.out.println("Solucion: " + x2);
        } else {
        //condicion falsa
        System.out.println("No existen soluciones correctas ");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }
}
