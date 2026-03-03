package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class EdadesAlturas5Alumnos_b {
    public static void main(String[] args) {

        int edad;
        double altura;

        int suma_edad = 0;
        double suma_alt = 0;

        int cont_mayor18 = 0;
        int cont_mayor175 = 0;

        int i = 1;

        while (i <= 5) {

            JOptionPane.showMessageDialog(null, "Alumno " + i);

            edad = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce edad:")
            );

            altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce altura (ej. 1.75):")
            );

            if (edad > 18) {
                cont_mayor18++;
            }

            if (altura > 1.75) {
                cont_mayor175++;
            }

            suma_edad += edad;
            suma_alt += altura;

            i++;
        }

        double media_edad = (double) suma_edad / 5;
        double media_alt = suma_alt / 5;

        String resultado = "La edad media es: " + media_edad +
                           "\nLa altura media es: " + media_alt +
                           "\nMayores de 18: " + cont_mayor18 +
                           "\nMayores de 1.75: " + cont_mayor175;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
