package a2241330016_practica7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio_8_1_mc_buffer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double tarifa, iva, subtotal, descuento = 0, total;
        int tipo;

        System.out.println("Ingrese la tarifa base:");
        tarifa = Double.parseDouble(br.readLine());

        System.out.println("Tipo de cliente: 1=Profesor 2=Alumno 3=General");
        tipo = Integer.parseInt(br.readLine());

        iva = tarifa * 0.16;
        subtotal = tarifa + iva;

        if(tipo == 1)
            descuento = subtotal * 0.20;
        else if(tipo == 2)
            descuento = subtotal * 0.10;
        else
            descuento = 0;

        total = subtotal - descuento;

        System.out.println("IVA: " + iva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}
