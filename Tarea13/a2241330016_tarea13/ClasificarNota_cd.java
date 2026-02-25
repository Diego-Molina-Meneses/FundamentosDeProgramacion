package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class ClasificarNota_cd {
     public static void main(String[] args) {

        int nota;

        nota = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca una nota:")
        );

        if (nota >= 0 && nota < 5)
            JOptionPane.showMessageDialog(null, "INSUFICIENTE");
        else if (nota == 5)
            JOptionPane.showMessageDialog(null, "SUFICIENTE");
        else if (nota == 6)
            JOptionPane.showMessageDialog(null, "BIEN");
        else if (nota >= 7 && nota <= 8)
            JOptionPane.showMessageDialog(null, "NOTABLE");
        else if (nota >= 9 && nota <= 10)
            JOptionPane.showMessageDialog(null, "SOBRESALIENTE");

        System.exit(0);
    }
}
