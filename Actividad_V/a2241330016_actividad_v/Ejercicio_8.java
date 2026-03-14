package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_8 {
    public static void main(String[] args) throws IOException {

        int serie = 0;
        int contador = 0;

        System.out.println("A continuacion, se imprime una serie de numeros.");

        while (serie < 1800) {

            serie = serie + 2;
            contador = contador + serie;
            System.out.println(serie);

            serie = serie + 3;
            contador = contador + serie;
            System.out.println(serie);
        }

        System.out.println("La suma de la serie es:");
        System.out.println(contador);
    }
}
