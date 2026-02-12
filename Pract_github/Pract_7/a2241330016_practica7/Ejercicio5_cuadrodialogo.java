package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio5_cuadrodialogo {
     public static void main(String[] args) {
        
        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        if ((num > 0) && (num % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "Es positivo y par");
        } else {
            if ((num > 0) && (num % 2 > 0)) {
                JOptionPane.showMessageDialog(null, "Es positivo y impar");
            } else {
                if ((num < 0) && (num % 2 == 0)) {
                    JOptionPane.showMessageDialog(null, "Es negativo y par");
                } else {
                    JOptionPane.showMessageDialog(null, "Es negativo y impar");
                }
            }
        }
    }
}
