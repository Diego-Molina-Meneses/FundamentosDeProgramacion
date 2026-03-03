package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EdadesAlturas5Alumnos_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int edad;
        double altura;

        int suma_edad = 0;
        double suma_alt = 0;

        int cont_mayor18 = 0;
        int cont_mayor175 = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Alumno " + i);

            System.out.print("Introduce edad: ");
            edad = Integer.parseInt(entrada.readLine());

            System.out.print("Introduce altura: ");
            altura = Double.parseDouble(entrada.readLine());

            if (edad > 18) {
                cont_mayor18++;
            }

            if (altura > 1.75) {
                cont_mayor175++;
            }

            suma_edad += edad;
            suma_alt += altura;
        }

        double media_edad = (double) suma_edad / 5;
        double media_alt = suma_alt / 5;

        System.out.println("La edad media es: " + media_edad);
        System.out.println("La altura media es: " + media_alt);
        System.out.println("Mayores de 18: " + cont_mayor18);
        System.out.println("Mayores de 1.75: " + cont_mayor175);
    }
}
