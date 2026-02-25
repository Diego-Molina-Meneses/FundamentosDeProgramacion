package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class IncrementarHora_cd {
    public static void main(String[] args) {

        int h, m, s;

        h = Integer.parseInt(JOptionPane.showInputDialog("Introduzca hora:"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Introduzca minutos:"));
        s = Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundos:"));

        s++;

        if (s >= 60) {
            s = 0;
            m++;

            if (m >= 60) {
                m = 0;
                h++;

                if (h >= 24)
                    h = 0;
            }
        }

        JOptionPane.showMessageDialog(null, "Hora: " + h + ":" + m + ":" + s);

        System.exit(0);
    }
}
