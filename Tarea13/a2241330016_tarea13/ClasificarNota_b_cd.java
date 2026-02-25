package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class ClasificarNota_b_cd {
     public static void main(String[] args) {

        int nota;

        nota = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca una nota:")
        );

        switch (nota) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "INSUFICIENTE");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "SUFICIENTE");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "BIEN");
                break;

            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "NOTABLE");
                break;

            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "SOBRESALIENTE");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Nota fuera de rango");
        }

        System.exit(0);
    }
}
