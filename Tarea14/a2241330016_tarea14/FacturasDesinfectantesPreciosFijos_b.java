package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class FacturasDesinfectantesPreciosFijos_b {
    public static void main(String[] args) {

        int codigo;
        int litros;
        int facturas_mas600 = 0;

        double precio = 0;
        double importe;
        double facturacion_total = 0;
        double litros_art1 = 0;

        int i = 1;

        while (i <= 5) {

            JOptionPane.showMessageDialog(null, "Factura " + i);

            codigo = Integer.parseInt(
                    JOptionPane.showInputDialog("Codigo de producto (1,2,3):")
            );

            litros = Integer.parseInt(
                    JOptionPane.showInputDialog("Cantidad (litros):")
            );

            switch (codigo) {
                case 1:
                    precio = 0.6;
                    break;
                case 2:
                    precio = 3;
                    break;
                case 3:
                    precio = 1.25;
                    break;
                default:
                    precio = 0;
            }

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
