package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NotasAlumnos_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int nota;
        int aprobados = 0, suspensos = 0, condicionados = 0;

        for (int i = 1; i <= 6; i++) {

            System.out.print("Introduce nota entre 0 y 10: ");
            nota = Integer.parseInt(entrada.readLine());

            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Condicionados: " + condicionados);
    }
}
