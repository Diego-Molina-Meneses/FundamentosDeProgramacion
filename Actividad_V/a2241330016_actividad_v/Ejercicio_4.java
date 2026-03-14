package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_4 {
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int trabajadores;
        double sueldo, sueldoNuevo, nomina;

        System.out.println("Cuantos trabajadores tiene el grupo?");
        trabajadores = Integer.parseInt(br.readLine());

        while (trabajadores > 0) {

            System.out.println("Cual es el sueldo actual?");
            sueldo = Double.parseDouble(br.readLine());

            if (sueldo < 1000) {
                sueldoNuevo = sueldo * 1.15;
            } else {
                sueldoNuevo = sueldo * 1.12;
            }

            System.out.println("El nuevo sueldo del grupo de trabajadores es:");
            System.out.println(sueldoNuevo);

            nomina = sueldoNuevo * trabajadores;

            System.out.println("El total de nomina es:");
            System.out.println(nomina);

            System.out.println("Cuantos trabajadores tiene el nuevo grupo?");
            trabajadores = Integer.parseInt(br.readLine());
        }
    }
}
