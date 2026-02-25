package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class NumerosMultiplos_cd {
    public static void main(String[] args) {

        int n1, n2;

        n1 = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        n2 = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce otro numero:")
        );

        if (n2 != 0) {
            if (n1 % n2 == 0)
                JOptionPane.showMessageDialog(null, "Son multiplos");
            else
                JOptionPane.showMessageDialog(null, "No son multiplos");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
        }

        System.exit(0);
    }
}
