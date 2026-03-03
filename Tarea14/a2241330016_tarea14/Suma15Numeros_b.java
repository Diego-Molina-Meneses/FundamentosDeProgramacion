package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class Suma15Numeros_b {
    public static void main(String[] args) {

        int num;
        int suma = 0;
        int i = 1;

        while (i <= 15) {

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce numero:")
            );

            suma += num;
            i++;
        }

        JOptionPane.showMessageDialog(null,
                "La suma total es: " + suma);
    }
}
