package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class IncrementarFecha_cd {
    public static void main(String[] args) {

        int dia, mes, ano;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca mes:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ano:"));

        dia++;

        if (dia > 30) {
            dia = 1;
            mes++;

            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }

        if (ano == 0)
            ano = 1;

        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);

        System.exit(0);
    }
}
