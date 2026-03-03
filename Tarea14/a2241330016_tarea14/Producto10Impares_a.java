package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Producto10Impares_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        long producto = 1;

        for (int i = 1; i < 20; i += 2) {
            producto *= i;
        }

        System.out.println("El producto de los 10 primeros impares es: " + producto);
    }
}
