package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class Numero0a99EnTexto_cd {
      public static void main(String[] args) {

        int num;
        String resultado = "";

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca un numero (0 a 99):")
        );

        if (num < 0 || num > 99) {
            JOptionPane.showMessageDialog(null, "Numero fuera de rango");
            System.exit(0);
        }

        switch (num) {
            case 0: resultado = "cero"; break;
            case 1: resultado = "uno"; break;
            case 2: resultado = "dos"; break;
            case 3: resultado = "tres"; break;
            case 4: resultado = "cuatro"; break;
            case 5: resultado = "cinco"; break;
            case 6: resultado = "seis"; break;
            case 7: resultado = "siete"; break;
            case 8: resultado = "ocho"; break;
            case 9: resultado = "nueve"; break;
            case 10: resultado = "diez"; break;
            case 11: resultado = "once"; break;
            case 12: resultado = "doce"; break;
            case 13: resultado = "trece"; break;
            case 14: resultado = "catorce"; break;
            case 15: resultado = "quince"; break;
            case 20: resultado = "veinte"; break;
        }

        if (num >= 16 && num <= 19)
            resultado = "dieci" + convertirUnidad(num - 10);

        else if (num >= 21 && num <= 29)
            resultado = "veinti" + convertirUnidad(num - 20);

        else if (num >= 30) {
            int decenas = num / 10;
            int unidades = num % 10;

            switch (decenas) {
                case 3: resultado = "treinta"; break;
                case 4: resultado = "cuarenta"; break;
                case 5: resultado = "cincuenta"; break;
                case 6: resultado = "sesenta"; break;
                case 7: resultado = "setenta"; break;
                case 8: resultado = "ochenta"; break;
                case 9: resultado = "noventa"; break;
            }

            if (unidades != 0)
                resultado += " y " + convertirUnidad(unidades);
        }

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }

    public static String convertirUnidad(int n) {
        switch (n) {
            case 1: return "uno";
            case 2: return "dos";
            case 3: return "tres";
            case 4: return "cuatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "siete";
            case 8: return "ocho";
            case 9: return "nueve";
        }
        return "";
    }
}
