package a2241330016_practica8;
import javax.swing.JOptionPane;
public class ejercicio05_cd {
    public static void main(String[] args) {

        String producto1 = " coca cola light lata 400 mil";
        String producto2 = " coca cola lata 400 mil";

        double precio1 = 16;
        double precio2 = 15;

        int opc = Integer.parseInt(
                JOptionPane.showInputDialog(
                        " Menu de Opciones\n "
                        + " 1.- Productos\n "
                        + " 2.- Punto de venta\n "
                        + " Que opcion deseas: "
                )
        );

        switch (opc) {

            case 1:
                JOptionPane.showMessageDialog(null,
                        "El " + producto1 + " cuesta $" + precio1 +
                        "\nEl " + producto2 + " cuesta $" + precio2);
                break;

            case 2:

                int cant1 = Integer.parseInt(
                        JOptionPane.showInputDialog("Cantidad de " + producto1 + ":")
                );

                int cant2 = Integer.parseInt(
                        JOptionPane.showInputDialog("Cantidad de " + producto2 + ":")
                );

                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = subtotal1 + iva1;

                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = subtotal2 + iva2;

                JOptionPane.showMessageDialog(null,
                        "--- Ticket ---\n\n"
                        + producto1 + " x" + cant1 +
                        "\nSubtotal: " + subtotal1 +
                        "\nIVA: " + iva1 +
                        "\nTotal: " + total1 +

                        "\n\n" + producto2 + " x" + cant2 +
                        "\nSubtotal: " + subtotal2 +
                        "\nIVA: " + iva2 +
                        "\nTotal: " + total2 +

                        "\n\nTOTAL GENERAL:" +
                        "\nSubtotal: " + (subtotal1 + subtotal2) +
                        "\nIVA: " + (iva1 + iva2) +
                        "\nTotal: " + (total1 + total2)
                );
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        }
    }
}

