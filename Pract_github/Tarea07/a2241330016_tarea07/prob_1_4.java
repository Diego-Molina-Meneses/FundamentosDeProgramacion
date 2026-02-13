package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_1_4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double vdolar, pconvertir, ndolares;
        
        System.out.print("Introduce el valor del dolar: ");
        vdolar = Double.parseDouble(br.readLine());
        
        System.out.print("Cuantos pesos vas a convertir: ");
        pconvertir = Double.parseDouble(br.readLine());
        
        ndolares = pconvertir / vdolar;
        
        System.out.println(pconvertir + 
                           " pesos son " + 
                           ndolares + 
                           " dolares");
    }
}
