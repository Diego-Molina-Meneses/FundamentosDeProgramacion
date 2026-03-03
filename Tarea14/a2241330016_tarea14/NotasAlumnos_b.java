package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class NotasAlumnos_b {
    public static void main(String[] args) {

        int nota;
        int aprobados = 0, suspensos = 0, condicionados = 0;
        int i = 1;

        while (i <= 6) {

            nota = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce nota entre 0 y 10:")
            );

            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            i++;
        }

        String resultado = "Aprobados: " + aprobados +
                           "\nSuspensos: " + suspensos +
                           "\nCondicionados: " + condicionados;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
