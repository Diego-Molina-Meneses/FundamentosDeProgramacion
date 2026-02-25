package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class ValidarFechaReal_b_cd {
     public static void main(String[] args) {

        int dia, mes, ano;
        int dias_del_mes;
        boolean fecha_correcta = true;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca mes:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ano:"));

        dias_del_mes = 0;

        if (ano == 0)
            fecha_correcta = false;

        if (dia < 1 || dia > 31)
            fecha_correcta = false;

        if (mes < 1 || mes > 12)
            fecha_correcta = false;

        if (mes == 2)
            dias_del_mes = 28;
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            dias_del_mes = 30;
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            dias_del_mes = 31;

        if (dia > dias_del_mes)
            fecha_correcta = false;

        if (fecha_correcta)
            JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano + ": Fecha correcta");
        else
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");

        System.exit(0);
    }
}
