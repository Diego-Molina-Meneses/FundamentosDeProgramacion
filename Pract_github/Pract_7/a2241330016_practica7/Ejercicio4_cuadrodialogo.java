package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio4_cuadrodialogo {
     public static void main(String[] args) {
        
        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        if (num > 0) {
            JOptionPane.showMessageDialog(null, "Es positivo");
        } else {
            if (num == 0) {
                JOptionPane.showMessageDialog(null, "Es negativo");
            } else {
                JOptionPane.showMessageDialog(null, "Es cero");
            }
        }
    }
}
