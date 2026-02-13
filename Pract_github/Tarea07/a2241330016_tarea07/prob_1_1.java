package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_1_1 {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double base, altura, area;
        
        System.out.print("Introduce la base: ");
        base = Double.parseDouble(br.readLine());
        
        System.out.print("Introduce la altura: ");
        altura = Double.parseDouble(br.readLine());
        
        area = base * altura;
        
        System.out.println("El area es = " + area);
    }
}
