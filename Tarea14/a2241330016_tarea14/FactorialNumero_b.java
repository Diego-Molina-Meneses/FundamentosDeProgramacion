package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class FactorialNumero_b {
    public static void main(String[] args) {

        int num;
        long factorial = 1;
        int i;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        i = num;

        while (i > 0) {
            factorial *= i;
            i--;
        }

        JOptionPane.showMessageDialog(null,
                "El factorial de " + num + " es: " + factorial);
    }
}
