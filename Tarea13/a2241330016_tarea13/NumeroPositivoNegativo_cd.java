package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class NumeroPositivoNegativo_cd {
    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        if (num < 0)
            JOptionPane.showMessageDialog(null, "Negativo");
        else
            JOptionPane.showMessageDialog(null, "Positivo");

        System.exit(0);
    }
}
