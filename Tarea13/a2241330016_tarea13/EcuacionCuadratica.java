package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EcuacionCuadratica {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c;   // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante

        System.out.print("Introduzca primer coeficiente (a): ");
        a = Double.parseDouble(entrada.readLine());

        System.out.print("Introduzca segundo coeficiente (b): ");
        b = Double.parseDouble(entrada.readLine());

        System.out.print("Introduzca tercer coeficiente (c): ");
        c = Double.parseDouble(entrada.readLine());

        // calculamos el determinante
        d = (b * b) - (4 * a * c);

        if (d < 0) {
            System.out.println("No existen soluciones reales");
        } else {
            if (a == 0) {
                System.out.println("No se puede dividir entre cero");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Solucion: " + x1);
                System.out.println("Solucion: " + x2);
            }
        }
    }
}
