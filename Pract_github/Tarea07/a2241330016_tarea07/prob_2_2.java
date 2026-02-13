package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_2_2 {
    public static void main(String[] args) throws IOException {
        
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num;
        
        System.out.print("Introduce el numero a evaluar: ");
        num = Integer.parseInt(br.readLine());
        
        if (num > 0) {
            System.out.println("El " + num + " es positivo");
        } else if (num < 0) {
            System.out.println("El " + num + " es negativo");
        } else {
            System.out.println("El numero es cero");
        }

    }
}
