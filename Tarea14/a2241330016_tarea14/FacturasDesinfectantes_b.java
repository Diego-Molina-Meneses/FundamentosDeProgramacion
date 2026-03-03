package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class FacturasDesinfectantes_b {
    public static void main(String[] args) {

        int codigo;
        int facturas_mas600 = 0;

        double litros, precio;
        double importe;
        double facturacion_total = 0;
        double litros_art1 = 0;

        int i = 1;

        while (i <= 5) {

            JOptionPane.showMessageDialog(null, "Factura " + i);

            codigo = Integer.parseInt(
                    JOptionPane.showInputDialog("Codigo de producto:")
            );

            litros = Double.parseDouble(
                    JOptionPane.showInputDialog("Cantidad (litros):")
            );

            precio = Double.parseDouble(
                    JOptionPane.showInputDialog("Precio (por litro):")
            );

            importe = litros * precio;
            facturacion_total += importe;

            if (codigo == 1) {
                litros_art1 += litros;
            }

            if (importe >= 600) {
                facturas_mas600++;
            }

            i++;
        }

        String resultado = "Resumen de ventas\n" +
                "La facturacion total es de: " + facturacion_total + "\n" +
                "Litros del articulo 1: " + litros_art1 + "\n" +
                "Facturas superiores a 600: " + facturas_mas600;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
