package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class MediaNumeros_b {
     public static void main(String[] args) {

        int num;
        int suma = 0;
        int elementos = 0;
        float media;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (num >= 0) {

            suma += num;
            elementos++;

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro numero:")
            );
        }

        if (elementos == 0) {
            JOptionPane.showMessageDialog(null,
                    "No es posible calcular la media.");
        } else {
            media = (float) suma / elementos;
            JOptionPane.showMessageDialog(null,
                    "La media es: " + media);
        }
    }
}
