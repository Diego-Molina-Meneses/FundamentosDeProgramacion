package a2241330016_tarea07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob_2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double operando1, operando2, resultado = 0;
        int opcion;
        
        System.out.print("Introduce el valor del operando 1: ");
        operando1 = Double.parseDouble(br.readLine());
        
        System.out.print("Introduce el valor del operando 2: ");
        operando2 = Double.parseDouble(br.readLine());
        
        System.out.println("Menu de opciones:");
        System.out.println("1.- Suma");
        System.out.println("2.- Multiplicacion");
        System.out.println("3.- Division");
        System.out.print("Elige una opcion [1..3]: ");
        opcion = Integer.parseInt(br.readLine());
        
        if (opcion == 1) {
            resultado = operando1 + operando2;
            System.out.println("El resultado de la suma es " + resultado);
        } else if (opcion == 2) {
            resultado = operando1 * operando2;
            System.out.println("El resultado de la multiplicacion es " + resultado);
        } else if (opcion == 3) {
            if (operando2 != 0) {
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es " + resultado);
            } else {
                System.out.println("No se puede dividir entre cero");
            }
        } else {
            System.out.println("Opcion no valida");
        }

    }
}
