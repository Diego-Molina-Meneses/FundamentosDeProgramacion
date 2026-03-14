package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero, resultado = 1;

        System.out.println("Ingrese el numero del cual se desea obtener su factorial:");
        numero = Integer.parseInt(br.readLine());

        for (int contador = 1; contador <= numero; contador++) {
            resultado = resultado * contador;
        }

        System.out.println("El factorial del numero ingresado es:");
        System.out.println(resultado);
    }
}
