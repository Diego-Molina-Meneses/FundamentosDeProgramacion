package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio_8_1_mc_cuadrodialogo {
     public static void main(String[] args) {

        double tarifa, iva, subtotal, descuento = 0, total;
        int tipo;

        tarifa = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese tarifa base:")
        );

        tipo = Integer.parseInt(
                JOptionPane.showInputDialog("1=Profesor 2=Alumno 3=General")
        );

        iva = tarifa * 0.16;
        subtotal = tarifa + iva;

        if(tipo == 1)
            descuento = subtotal * 0.20;
        else if(tipo == 2)
            descuento = subtotal * 0.10;

        total = subtotal - descuento;

        JOptionPane.showMessageDialog(null,
                "IVA: " + iva +
                "\nDescuento: " + descuento +
                "\nTotal a pagar: " + total);
    }
}
