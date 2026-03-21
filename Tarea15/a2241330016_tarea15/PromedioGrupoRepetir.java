package a2241330016_tarea15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PromedioGrupoRepetir {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sumaPromedio = 0, suma, resultado, promedio, calif;
        int ciclo, num = 0;
        char opc = 's';
        
        do {
            
            num++;
            suma = 0;
            ciclo = 0;
            
            do {
                ciclo++;
                System.out.print("Ingresa la calificacion " + ciclo + ": ");
                calif = Double.parseDouble(br.readLine());
                suma += calif;
            } while (ciclo < 3);
            
            resultado = suma / 3;
            
            if (resultado >= 7) {
                System.out.println("ALUMNO ACREDITADO");
            } else {
                System.out.println("ALUMNO NO ACREDITADO");
            }
            
            sumaPromedio += resultado;
            
            System.out.print("Desea seguir? (s/n): ");
            opc = br.readLine().charAt(0);
            
        } while (opc != 'n' && opc != 'N');
        
        if (num > 0) {
            promedio = sumaPromedio / num;
            System.out.println("El promedio del grupo de " + num + 
                               " alumnos es: " + promedio);
        }
    }
}
