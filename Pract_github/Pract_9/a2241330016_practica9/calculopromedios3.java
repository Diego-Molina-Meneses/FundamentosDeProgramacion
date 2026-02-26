package a2241330016_practica9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class calculopromedios3 {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        int nalum, nparcial, cal;
        double palum, sprom = 0, pgeneral;

        System.out.println("Cuantos alumnos vas a evaluar?");
        nalum = Integer.parseInt(entrada.readLine());

        System.out.println("Cuantos parciales vas a evaluar?");
        nparcial = Integer.parseInt(entrada.readLine());

        for (int i = 1; i <= nalum; i++) {

            int j = 1;
            int scal = 0;

            while (j <= nparcial) {

                System.out.println("Calificacion del alumno " + i +
                                   " parcial " + j);
                cal = Integer.parseInt(entrada.readLine());
                scal += cal;
                j++;
            }

            palum = (double) scal / nparcial;
            System.out.println("El promedio del alumno " + i +
                               " fue " + palum);

            sprom += palum;
        }

        pgeneral = sprom / nalum;
        System.out.println("El promedio general fue " + pgeneral);
    }
}
