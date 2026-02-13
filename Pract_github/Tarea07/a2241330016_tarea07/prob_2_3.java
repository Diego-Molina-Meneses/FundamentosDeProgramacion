package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_2_3 {
    public static void main(String[] args) throws IOException {
        
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a;
        
        System.out.print("Introduce un numero: ");
        a = Integer.parseInt(br.readLine());
        
        if (a > 0 && a <= 9) {
            System.out.println("El numero " + a +
                               " es de un digito y positivo");
        } else {
            System.out.println("El numero " + a +
                               " es mayor de un digito");
        }

    }
}
