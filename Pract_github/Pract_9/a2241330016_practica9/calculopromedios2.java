package a2241330016_practica9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class calculopromedios2 {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        int ciclop = 0, cicloh;
        int nalum, nparcial, cal, scal;
        double palum, sprom = 0, pgeneral;

        System.out.println("Cuantos alumnos vas a evaluar?");
        nalum = Integer.parseInt(entrada.readLine());

        System.out.println("Cuantos parciales vas a evaluar?");
        nparcial = Integer.parseInt(entrada.readLine());

        do {

            ciclop++;
            cicloh = 0;
            scal = 0;

            do {
                cicloh++;
                System.out.println("Calificacion del alumno " + ciclop +
                                   " parcial " + cicloh);
                cal = Integer.parseInt(entrada.readLine());
                scal += cal;

            } while (cicloh < nparcial);

            palum = (double) scal / nparcial;
            System.out.println("El promedio del alumno " + ciclop +
                               " fue " + palum);

            sprom += palum;

        } while (ciclop < nalum);

        pgeneral = sprom / nalum;
        System.out.println("El promedio general fue " + pgeneral);
    }
}
