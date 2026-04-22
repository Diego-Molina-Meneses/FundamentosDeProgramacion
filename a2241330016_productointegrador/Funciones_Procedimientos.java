package a2241330016_productointegrador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Funciones_Procedimientos {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String MostrarMenu(String[] opciones){
        String menu="";
        int i=0;
        while(i < opciones.length){
            menu = menu + (i + 1) + ".- " + opciones [i] + "\n";
            i++;
        }
        return menu;
    }
    
    public static String Dialogo(String texto) throws IOException{
   
        System.out.println(texto + ": ");
        return br .readLine();
        
    }
    
    public static String DesplegarMenu(String titulo,String[] menu)throws IOException{
        String cadena;
        cadena= titulo + "\n\n";
        cadena= cadena + MostrarMenu(menu);
        cadena= cadena + "\nQue opcion deseas";
        return Dialogo(cadena);
    }
    
   public static void main(String[] args) throws IOException {
   
       String[] opciones = {
        "Productos",
	" Punto de venta ",
	" Inventario",
	" Listado de Ventas",
        " Salida"
       };
       String menu = MostrarMenu(opciones);
	String opcion;
        opcion = DesplegarMenu("Menu de punto de Venta", opciones);
        System.out.println("Elegiste: " + opcion);
   }
}

