package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FacturasDesinfectantes_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int codigo;
        int facturas_mas600 = 0;

        double litros, precio;
        double importe;
        double facturacion_total = 0;
        double litros_art1 = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Factura " + i);

            System.out.print("Codigo de producto: ");
            codigo = Integer.parseInt(entrada.readLine());

            System.out.print("Cantidad (litros): ");
            litros = Double.parseDouble(entrada.readLine());

            System.out.print("Precio (por litro): ");
            precio = Double.parseDouble(entrada.readLine());

            importe = litros * precio;
            facturacion_total += importe;

            if (codigo == 1) {
                litros_art1 += litros;
            }

            if (importe >= 600) {
                facturas_mas600++;
            }

            System.out.println();
        }

        System.out.println("Resumen de ventas");
        System.out.println("La facturacion total es de: " + facturacion_total);
        System.out.println("Litros del articulo 1: " + litros_art1);
        System.out.println("Facturas superiores a 600: " + facturas_mas600);
    }
}
