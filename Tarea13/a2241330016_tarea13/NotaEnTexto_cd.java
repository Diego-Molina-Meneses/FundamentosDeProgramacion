package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class NotaEnTexto_cd {
    public static void main(String[] args) {

        int nota;

        nota = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca una nota entre 0 y 10:")
        );

        switch (nota) {

            case 0: JOptionPane.showMessageDialog(null, "cero"); break;
            case 1: JOptionPane.showMessageDialog(null, "uno"); break;
            case 2: JOptionPane.showMessageDialog(null, "dos"); break;
            case 3: JOptionPane.showMessageDialog(null, "tres"); break;
            case 4: JOptionPane.showMessageDialog(null, "cuatro"); break;
            case 5: JOptionPane.showMessageDialog(null, "cinco"); break;
            case 6: JOptionPane.showMessageDialog(null, "seis"); break;
            case 7: JOptionPane.showMessageDialog(null, "siete"); break;
            case 8: JOptionPane.showMessageDialog(null, "ocho"); break;
            case 9: JOptionPane.showMessageDialog(null, "nueve"); break;
            case 10: JOptionPane.showMessageDialog(null, "diez"); break;

            default:
                JOptionPane.showMessageDialog(null, "Nota fuera de rango");
        }

        System.exit(0);
    }
}
