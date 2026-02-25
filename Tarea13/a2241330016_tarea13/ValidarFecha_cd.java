package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class ValidarFecha_cd {
    public static void main(String[] args) {

        int dia, mes, ano;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca mes:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ano:"));

        if (dia >= 1 && dia <= 30) {

            if (mes >= 1 && mes <= 12) {

                if (ano >= 0)
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                else
                    JOptionPane.showMessageDialog(null, "Ano incorrecto");

            } else
                JOptionPane.showMessageDialog(null, "Mes incorrecto");

        } else
            JOptionPane.showMessageDialog(null, "Dia incorrecto");

        System.exit(0);
    }
}
