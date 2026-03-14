package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero, contador, resultado;

        System.out.println("Ingrese la tabla de multiplicar a mostrar:");
        numero = Integer.parseInt(br.readLine());

        for (contador = 1; contador <= 10; contador++) {

            resultado = contador * numero;

            System.out.println(numero + " x " + contador + " = " + resultado);
        }
    }
}
