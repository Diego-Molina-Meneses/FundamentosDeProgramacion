package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class SumaNumeros_b {
    public static void main(String[] args) {

        int num;
        int suma = 0;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (num != 0) {

            suma += num;

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro numero:")
            );
        }

        JOptionPane.showMessageDialog(null,
                "La suma de todos los numeros es: " + suma);
    }
}
