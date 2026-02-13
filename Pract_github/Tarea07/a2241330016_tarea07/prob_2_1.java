package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_2_1 {
    public static void main(String[] args) throws IOException {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num, resultado;
        
        System.out.print("Introduce el numero a evaluar: ");
        num = Integer.parseInt(br.readLine());
        
        resultado = num % 2;
        
        if (resultado == 0) {
            System.out.println("El " + num + " es par");
        } else {
            System.out.println("El " + num + " es impar");
        }

    }
}
