package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class ExisteNumeroNegativo_b {
     public static void main(String[] args) {

        int num;
        boolean hay_negativo = false;
        int i = 1;

        while (i <= 10) {

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce numero:")
            );

            if (num < 0) {
                hay_negativo = true;
            }

            i++;
        }

        if (hay_negativo) {
            JOptionPane.showMessageDialog(null,
                    "Se ha introducido algun numero negativo");
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay ningun numero negativo");
        }
    }
}
