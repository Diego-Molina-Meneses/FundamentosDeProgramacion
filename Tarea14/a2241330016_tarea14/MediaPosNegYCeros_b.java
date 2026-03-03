package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class MediaPosNegYCeros_b {
    public static void main(String[] args) {

        int num;
        int cont_pos = 0, cont_neg = 0, cont_ceros = 0;
        int suma_pos = 0, suma_neg = 0;
        float media_pos, media_neg;
        int i = 1;

        while (i <= 10) {

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce numero:")
            );

            if (num == 0) {
                cont_ceros++;
            } else if (num > 0) {
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }

            i++;
        }

        String resultado = "Cantidad de ceros: " + cont_ceros + "\n";

        if (cont_pos == 0) {
            resultado += "No se puede calcular la media de los positivos\n";
        } else {
            media_pos = (float) suma_pos / cont_pos;
            resultado += "Media de los positivos: " + media_pos + "\n";
        }

        if (cont_neg == 0) {
            resultado += "No se puede calcular la media de los negativos";
        } else {
            media_neg = (float) suma_neg / cont_neg;
            resultado += "Media de los negativos: " + media_neg;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
