package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class AdivinarNumero_b {
    public static void main(String[] args) {

        int n, num;

        n = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el numero secreto:")
        );

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (num != n) {

            if (num < n) {
                JOptionPane.showMessageDialog(null, "Mayor");
            } else {
                JOptionPane.showMessageDialog(null, "Menor");
            }

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro numero:")
            );
        }

        JOptionPane.showMessageDialog(null, "Acertaste!");
    }
}
