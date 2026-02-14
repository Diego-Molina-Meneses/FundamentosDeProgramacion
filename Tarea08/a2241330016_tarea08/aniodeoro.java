package a2241330016_tarea08;
import java.util.Scanner;
public class aniodeoro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el ano: ");
        int anio = sc.nextInt();

        if (anio >= 2000 && anio <= 3000) {

            if (anio % 10 == 1) {

                if (anio % 4 == 2) {

                    // No bisiesto
                    if (!(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {

                        // Primo 
                        if (anio > 1 &&
                            anio % 2 != 0 &&
                            anio % 3 != 0 &&
                            anio % 5 != 0 &&
                            anio % 7 != 0) {

                            System.out.println("Ano de Oro");

                        } else {
                            System.out.println("Ano Ordinario");
                        }

                    } else {
                        System.out.println("Ano Ordinario");
                    }

                } else {
                    System.out.println("Ano Ordinario");
                }

            } else {
                System.out.println("Ano Ordinario");
            }

        } else {
            System.out.println("Ano Ordinario");
        }
    }
}
