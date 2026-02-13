package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_1_5 {
    public static void main(String[] args) throws IOException {
        
          
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double velocidad, tiempo, distancia;
        
        System.out.print("Introduce el tiempo del recorrido en horas: ");
        tiempo = Double.parseDouble(br.readLine());
        
        System.out.print("Introduce la velocidad promedio km/h: ");
        velocidad = Double.parseDouble(br.readLine());
        
        distancia = velocidad * tiempo;
        
        System.out.println("La distancia recorrida fue " + 
                           distancia + " km");
    }
}
