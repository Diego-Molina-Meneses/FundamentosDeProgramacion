package a2241330016_tarea09;
import java.util.Scanner;
public class Ejercicio4_Facturas {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, codigo, facturasMas600;
        double litros, precio, importe, facturacionTotal, litrosArticulo1;

        facturacionTotal = 0;
        litrosArticulo1 = 0;
        facturasMas600 = 0;

        for (i = 1; i <= 5; i++) {

            System.out.println("FACTURA " + i);

            System.out.print("Codigo del articulo: ");
            codigo = sc.nextInt();

            System.out.print("Cantidad vendida en litros: ");
            litros = sc.nextDouble();

            System.out.print("Precio por litro: ");
            precio = sc.nextDouble();

            importe = litros * precio;
            facturacionTotal = facturacionTotal + importe;

            if (codigo == 1) {
                litrosArticulo1 = litrosArticulo1 + litros;
            } else {
                if (importe >= 600) {
                    facturasMas600 = facturasMas600 + 1;
                }
            }
        }

        System.out.println("Facturacion total: $" + facturacionTotal);
        System.out.println("Litros vendidos del articulo 1: " + litrosArticulo1);
        System.out.println("Facturas de mas de $600: " + facturasMas600);
     }
}
