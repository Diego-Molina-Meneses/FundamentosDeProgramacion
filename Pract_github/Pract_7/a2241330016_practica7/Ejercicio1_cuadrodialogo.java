package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio1_cuadrodialogo {
     public static void main(String[] args) {
        
        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        if (num > 0) {
            JOptionPane.showMessageDialog(null, "Es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "Es negativo");
        }
    }
}
