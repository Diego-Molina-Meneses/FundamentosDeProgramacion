package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class ParImpar_b {
    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (num != 0) {

            if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Par");
            } else {
                JOptionPane.showMessageDialog(null, "Impar");
            }

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro numero:")
            );
        }

        JOptionPane.showMessageDialog(null, "Programa terminado.");
    }
}
