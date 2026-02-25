package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IncrementarHora {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int h, m, s;

        System.out.print("Introduzca hora: ");
        h = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca minutos: ");
        m = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca segundos: ");
        s = Integer.parseInt(entrada.readLine());

        s++;

        if (s >= 60) {
            s = 0;
            m++;

            if (m >= 60) {
                m = 0;
                h++;

                if (h >= 24)
                    h = 0;
            }
        }

        System.out.println("Hora: " + h + ":" + m + ":" + s);
    }
}
