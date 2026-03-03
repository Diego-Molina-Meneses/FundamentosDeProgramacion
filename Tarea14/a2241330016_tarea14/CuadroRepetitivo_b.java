package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class CuadroRepetitivo_b {
     public static void main(String[] args) {

        int num;
        int cuadrado;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (num >= 0) {

            cuadrado = num * num;

            JOptionPane.showMessageDialog(null,
                    "El cuadrado es: " + cuadrado);

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro numero:")
            );
        }

        JOptionPane.showMessageDialog(null, "Programa terminado.");
    }
}
