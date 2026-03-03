package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class ExisteMultiploDe3_b {
    public static void main(String[] args) {

        int num;
        boolean multiplo3 = false;
        int i = 1;

        while (i <= 5) {

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce numero:")
            );

            if (num % 3 == 0) {
                multiplo3 = true;
            }

            i++;
        }

        if (multiplo3) {
            JOptionPane.showMessageDialog(null, "Hay multiplos de 3");
        } else {
            JOptionPane.showMessageDialog(null, "No existen multiplos de 3");
        }
    }
}
