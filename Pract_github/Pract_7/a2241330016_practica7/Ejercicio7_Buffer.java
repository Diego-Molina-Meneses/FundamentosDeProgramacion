package a2241330016_practica7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio7_Buffer {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dia;

        System.out.println("Introduce un numero del 1 al 7:");
        dia = Integer.parseInt(br.readLine());

        if (dia == 1) {
            System.out.println("Es Lunes");
        } else {
            if (dia == 2) {
                System.out.println("Es Martes");
            } else {
                if (dia == 3) {
                    System.out.println("Es Miercoles");
                } else {
                    if (dia == 4) {
                        System.out.println("Es Jueves");
                    } else {
                        if (dia == 5) {
                            System.out.println("Es Viernes");
                        } else {
                            if (dia == 6) {
                                System.out.println("Es Sabado");
                            } else {
                                if (dia == 7) {
                                    System.out.println("Es Domingo");
                                } else {
                                    System.out.println("No Existe");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
