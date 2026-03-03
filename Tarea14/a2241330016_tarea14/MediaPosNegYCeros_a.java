package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MediaPosNegYCeros_a {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int cont_pos = 0, cont_neg = 0, cont_ceros = 0;
        int suma_pos = 0, suma_neg = 0;
        float media_pos, media_neg;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Introduce numero: ");
            num = Integer.parseInt(entrada.readLine());

            if (num == 0) {
                cont_ceros++;
            } else if (num > 0) {
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }
        }

        System.out.println("Cantidad de ceros: " + cont_ceros);

        if (cont_pos == 0) {
            System.out.println("No se puede calcular la media de los positivos");
        } else {
            media_pos = (float) suma_pos / cont_pos;
            System.out.println("Media de los positivos: " + media_pos);
        }

        if (cont_neg == 0) {
            System.out.println("No se puede calcular la media de los negativos");
        } else {
            media_neg = (float) suma_neg / cont_neg;
            System.out.println("Media de los negativos: " + media_neg);
        }
    }
}
