package a2241330016_practica7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio6_Buffer {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int parcial1, parcial2, parcial3, resultado;

        System.out.println("Introduce la calificacion del parcial 1:");
        parcial1 = Integer.parseInt(br.readLine());

        System.out.println("Introduce la calificacion del parcial 2:");
        parcial2 = Integer.parseInt(br.readLine());

        System.out.println("Introduce la calificacion del parcial 3:");
        parcial3 = Integer.parseInt(br.readLine());

        resultado = (parcial1 + parcial2 + parcial3) / 3;

        if (resultado >= 7) {
            System.out.println("Alumno Acreditado");
        } else {
            System.out.println("Alumno No Acreditado");
        }
    }
}
