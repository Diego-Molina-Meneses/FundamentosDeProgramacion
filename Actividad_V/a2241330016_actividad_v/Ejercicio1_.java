package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio1_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero, sumaPar = 0, sumaImpar = 0;

        for (int contador = 1; contador <= 10; contador++) {

            System.out.println("Ingrese un numero:");
            numero = Integer.parseInt(br.readLine());

            if (numero % 2 == 0) {
                sumaPar = sumaPar + numero;
            } else {
                sumaImpar = sumaImpar + numero;
            }
        }

        sumaPar = sumaPar / 10;
        sumaImpar = sumaImpar / 10;

        System.out.println("La media de los numeros pares ingresados es:");
        System.out.println(sumaPar);

        System.out.println("La media de los numeros impares ingresados es:");
        System.out.println(sumaImpar);
    }
}
