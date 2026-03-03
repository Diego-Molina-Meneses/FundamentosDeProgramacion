package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class ContadorNumeros_b {
    public static void main(String[] args) {

        int num;
        int contador = 0;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        while (num >= 0) {

            contador++;

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro numero:")
            );
        }

        JOptionPane.showMessageDialog(null,
                "Se han introducido " + contador + " numeros.");
    }
}
