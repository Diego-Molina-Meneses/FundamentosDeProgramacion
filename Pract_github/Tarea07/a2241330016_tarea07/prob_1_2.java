package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_1_2 {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int c1, c2, c3;
        double promedio;
        
        System.out.print("Introduce la calificacion 1: ");
        c1 = Integer.parseInt(br.readLine());
        
        System.out.print("Introduce la calificacion 2: ");
        c2 = Integer.parseInt(br.readLine());
        
        System.out.print("Introduce la calificacion 3: ");
        c3 = Integer.parseInt(br.readLine());
        
        promedio = (c1 + c2 + c3) / 3.0;
        
        System.out.println("El promedio es = " + promedio);
    }
}
