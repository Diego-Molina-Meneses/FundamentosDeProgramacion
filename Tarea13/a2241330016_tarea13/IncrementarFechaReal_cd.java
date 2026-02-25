package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class IncrementarFechaReal_cd {
    public static void main(String[] args) {

        int dia, mes, ano;
        int dias_del_mes = 0;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca mes:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ano:"));

        if (mes == 2)
            dias_del_mes = 28;
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            dias_del_mes = 30;
        else
            dias_del_mes = 31;

        dia++;

        if (dia > dias_del_mes) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            ano++;
        }

        if (ano == 0)
            ano = 1;

        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);

        System.exit(0);
    }
}
