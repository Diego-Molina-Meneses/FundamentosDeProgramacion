package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_1_3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int c;
        double f;
        
        System.out.print("Introduce los grados celsius: ");
        c = Integer.parseInt(br.readLine());
        
        f = ((9.0/5) * c) + 32;
        
        System.out.println("Los grados celsius " + c +
                           " grados fahrenheit son " + f);
    }
}
