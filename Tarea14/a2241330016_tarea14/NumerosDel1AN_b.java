package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class NumerosDel1AN_b {
     public static void main(String[] args) {

        int n, i = 1;

        n = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (i <= n) {
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
    }
}
