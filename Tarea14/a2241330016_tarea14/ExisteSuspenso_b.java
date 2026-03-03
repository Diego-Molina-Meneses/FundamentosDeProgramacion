package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class ExisteSuspenso_b {
     public static void main(String[] args) {

        int nota;
        boolean suspenso = false;
        int i = 1;

        while (i <= 5) {

            nota = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce nota (0 a 10):")
            );

            if (nota < 5) {
                suspenso = true;
            }

            i++;
        }

        if (suspenso) {
            JOptionPane.showMessageDialog(null, "Hay alumnos suspensos");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suspensos");
        }
    }
}
