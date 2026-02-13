package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_2_4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int parcial1, parcial2, parcial3;
        double resultado;
        
        System.out.print("Introduce la calificacion del Parcial 1: ");
        parcial1 = Integer.parseInt(br.readLine());
        
        System.out.print("Introduce la calificacion del Parcial 2: ");
        parcial2 = Integer.parseInt(br.readLine());
        
        System.out.print("Introduce la calificacion del Parcial 3: ");
        parcial3 = Integer.parseInt(br.readLine());
        
        resultado = (parcial1 + parcial2 + parcial3) / 3.0;
        
        if (resultado >= 7) {
            System.out.println("ALUMNO ACREDITADO");
        } else {
            System.out.println("ALUMNO NO ACREDITADO");
        }

    }
}
