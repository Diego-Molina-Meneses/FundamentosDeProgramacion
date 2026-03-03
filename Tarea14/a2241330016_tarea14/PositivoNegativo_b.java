package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class PositivoNegativo_b {
     public static void main(String[] args) {

        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (num != 0) {

            if (num > 0) {
                JOptionPane.showMessageDialog(null, "Positivo");
            } else {
                JOptionPane.showMessageDialog(null, "Negativo");
            }

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro numero:")
            );
        }

        JOptionPane.showMessageDialog(null, "Programa terminado.");
    }
}
