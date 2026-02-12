package a2241330016_practica7;
import java.util.Scanner;
public class Ejercicio_8_1_mc_scanner {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tarifa, iva, subtotal, descuento = 0, total;
        int tipo;

        System.out.println("Ingrese la tarifa base:");
        tarifa = sc.nextDouble();

        System.out.println("Tipo de cliente: 1=Profesor 2=Alumno 3=General");
        tipo = sc.nextInt();

        iva = tarifa * 0.16;
        subtotal = tarifa + iva;

        if(tipo == 1)
            descuento = subtotal * 0.20;
        else if(tipo == 2)
            descuento = subtotal * 0.10;

        total = subtotal - descuento;

        System.out.println("IVA: " + iva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}
