package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class ValidarFechaReal_cd {
    public static void main(String[] args) {

        int dia, mes, ano;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca mes:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ano:"));

        if (ano == 0) {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        } else {

            if (mes == 2 && (dia >= 1 && dia <= 28)) {
                JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano + ": Fecha correcta");
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    && (dia >= 1 && dia <= 30)) {
                JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano + ": Fecha correcta");
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)
                    && (dia >= 1 && dia <= 31)) {
                JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano + ": Fecha correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta");
            }
        }

        System.exit(0);
    }
}
