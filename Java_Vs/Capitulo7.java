import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Capitulo7 {

    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
    static String[][] productos;
    static String[][] ventas;
    static int tamventas = 100;

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        boolean valido = true;
        if (dato == null || dato.trim().isEmpty()) {
            return false;
        }
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                valido = false;
            }
        }
        return valido;
    }

    public static boolean EsNumeroDouble(String dato) {
        boolean punto = false;
        boolean digito = false;
        if (dato == null || dato.trim().isEmpty()) {
            return false;
        }
        for (char c : dato.toCharArray()) {
            if (Character.isDigit(c)) {
                digito = true;
            } else if (c == '.' && !punto) {
                punto = true;
            } else {
                return false;
            }
        }
        return digito;
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
        case 1:
            valido = EsNumeroEntero(dato);
            break;
        case 2:
            valido = EsNumeroDouble(dato);
            break;
        default:
            valido = true;
            break;
        }
        return valido;
    }

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        return lectura.readLine();
    }

    /*
     * Actividad 1.
     * La funcion Leer ahora recibe el texto de dialogo y el tipo de dato.
     * tipo 0 = texto, tipo 1 = entero, tipo 2 = double.
     * Si el dato no es valido, se vuelve a solicitar hasta que sea correcto.
     */
    public static String Leer(String texto, int tipo) throws IOException {
        String cadena = "";
        boolean correcto = false;

        do {
            cadena = Dialogo(texto);

            if (cadena != null) {
                cadena = cadena.trim();
                if (cadena.isEmpty()) {
                    cadena = null;
                }
            }

            if (cadena == null) {
                System.out.println("Error: el dato no puede estar vacio.");
            } else if (tipo == 0) {
                correcto = true;
            } else if (EvaluarNumerico(cadena, tipo)) {
                correcto = true;
            } else {
                System.out.println("Error: el dato no corresponde al tipo solicitado. Intentalo nuevamente.");
            }
        } while (!correcto);

        return cadena;
    }

    public static String Leer(String texto) throws IOException {
        return Leer(texto, 0);
    }

    public static String DesplegarMenu(String titulo, String[] menu) throws IOException {
        String cadena;
        cadena = titulo + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\nQue opcion deseas";
        return Leer(cadena, 1);
    }

    public static String RellenarEspacios(String dato, int tamano) {
        if (dato == null) {
            dato = "";
        }
        return String.format("%1$-" + tamano + "s", dato);
    }

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static String IdTicketSiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            idticketnext = "00" + String.valueOf(num).trim();
        } else if ((num > 9) && (num < 100)) {
            idticketnext = "0" + String.valueOf(num).trim();
        } else {
            idticketnext = String.valueOf(num).trim();
        }
        return idticketnext;
    }

    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    /*
     * Actividad 2.
     * La matriz productos ahora tiene 20 filas y 5 columnas:
     * codigo, nombre, precio, stock y porcentaje de IVA.
     */
    public static String[][] CargarProductos() {
        String[][] producto = {
            { "001", "Cafe americano", "35", "20", "16" },
            { "002", "Cafe latte", "48", "20", "16" },
            { "003", "Capuchino", "50", "20", "16" },
            { "004", "Moka", "55", "20", "16" },
            { "005", "Chocolate caliente", "45", "20", "16" },
            { "006", "Te chai", "42", "20", "16" },
            { "007", "Frappe de cafe", "65", "20", "16" },
            { "008", "Frappe de chocolate", "68", "20", "16" },
            { "009", "Panini de jamon", "75", "15", "16" },
            { "010", "Croissant", "38", "15", "0" },
            { "011", "Muffin de vainilla", "32", "15", "0" },
            { "012", "Brownie", "40", "15", "0" },
            { "013", "Pay de queso", "58", "12", "0" },
            { "014", "Galleta chispas", "25", "20", "0" },
            { "015", "Agua natural", "20", "24", "0" },
            { "016", "Te helado", "35", "18", "16" },
            { "017", "Sandwich de pollo", "70", "15", "16" },
            { "018", "Ensalada de fruta", "55", "12", "0" },
            { "019", "Bagel con queso", "60", "12", "16" },
            { "020", "Jugo de naranja", "38", "18", "0" }
        };
        return producto;
    }

    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 6);
        String producto = RellenarEspacios(vproducto[1], 28);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        String iva = RellenarEspacios(vproducto[4], 8);
        String cadena = codigo.concat(producto + precio + cantidad + iva);
        return cadena;
    }

    public static String MostrarLista(String[][] vproductos) {
        String salida = "COD   PRODUCTO                    PRECIO    STOCK     IVA %\n";
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            String[] vproducto = { vproductos[ciclo][0], vproductos[ciclo][1], vproductos[ciclo][2],
                    vproductos[ciclo][3], vproductos[ciclo][4] };
            String cadena = MostrarProducto(vproducto);
            salida = salida.concat(cadena + "\n");
        }
        return salida;
    }

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc = -1;
        int pos = 0;
        int tam = vproductos.length;
        for (int ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0] != null && vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = pos;
            }
            pos++;
        }
        return enc;
    }

    public static double ObtenerIvaProducto(String codigo, String[][] mproductos) {
        double iva = 0;
        int pos = ExisteProducto(codigo, mproductos);
        if (pos > -1) {
            iva = Double.parseDouble(mproductos[pos][4]);
        }
        return iva;
    }

    public static void ModificarProducto(String[][] vproductos) throws IOException {
        String codigo, precio;
        int posicion;
        String info = MostrarLista(vproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto a modificar", 1);
        posicion = ExisteProducto(codigo, vproductos);
        if (posicion > -1) {
            String[] vproducto = { vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][2],
                    vproductos[posicion][3], vproductos[posicion][4] };
            precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproducto), 2);
            vproductos[posicion][2] = precio;
        } else {
            System.out.println("No existe el codigo");
        }
    }

    public static void MenuProductos(String[][] vproductos) throws IOException {
        String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            switch (opcion) {
            case "1":
                ModificarProducto(vproductos);
                break;
            case "2":
                System.out.println(MostrarLista(vproductos));
                break;
            case "3":
                System.out.println("Salida del Sistema");
                break;
            default:
                System.out.println("No existe esta opcion");
                break;
            }
        } while (opcion.compareTo("3") != 0);
    }

    public static String[][] CrearVenta() {
        return new String[tamventas][6];
    }

    public static String[][] CrearTicket() {
        return new String[50][5];
    }

    public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
        int enc = -1;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            if (mticket[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = ciclo;
                return enc;
            }
        }
        return enc;
    }

    public static boolean InsertarProductoTicket(String[][] mticket, String[] datos, int tamticket) {
        boolean sucedio = true;
        int posticket = ObtenerUltimaPosicion(mticket);
        int enc = ExisteTicketCodigo(mticket, datos[0]);

        if (posticket < tamticket - 1) {
            if (enc > -1) {
                int cantidadactual = Integer.parseInt(mticket[enc][3]);
                mticket[enc][3] = String.valueOf(cantidadactual + Integer.parseInt(datos[3]));
            } else {
                posticket++;
                mticket[posticket][0] = datos[0];
                mticket[posticket][1] = datos[1];
                mticket[posticket][2] = datos[2];
                mticket[posticket][3] = datos[3];
                mticket[posticket][4] = datos[4];
            }
        } else {
            sucedio = false;
        }
        return sucedio;
    }

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format("%.2f", total);
    }

    public static double IvaProducto(String precio, String cantidad, String porcentajeIva) {
        double subtotal = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        double porcentaje = Double.parseDouble(porcentajeIva);
        return subtotal * (porcentaje / 100);
    }

    public static String MostrarProductoTicket(String[][] mticket, int pos) {
        String codigo = RellenarEspacios(mticket[pos][0], 6);
        String producto = RellenarEspacios(mticket[pos][1], 28);
        String precio = RellenarEspacios(mticket[pos][2], 10);
        String cantidad = RellenarEspacios(mticket[pos][3], 6);
        String iva = RellenarEspacios(String.format("%.2f", IvaProducto(mticket[pos][2], mticket[pos][3], mticket[pos][4])), 10);
        String totalproducto = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10);
        String cadena = codigo.concat(producto + precio + cantidad + iva + totalproducto);
        return cadena;
    }

    public static String MostrarTicket(String[][] mticket) {
        String salida = "COD   PRODUCTO                    PRECIO    CANT  IVA       SUBTOTAL\n";
        int pos = ObtenerUltimaPosicion(mticket);
        if (pos == -1) {
            return "";
        }
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            salida = salida.concat(MostrarProductoTicket(mticket, ciclo) + "\n");
        }
        return salida;
    }

    public static double SubTotalTicket(String[][] mticket) {
        double subtotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            subtotal = subtotal + Double.parseDouble(TotalProducto(mticket[ciclo][2], mticket[ciclo][3]));
        }
        return subtotal;
    }

    public static double IvaTicket(String[][] mticket) {
        double ivatotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            ivatotal = ivatotal + IvaProducto(mticket[ciclo][2], mticket[ciclo][3], mticket[ciclo][4]);
        }
        return ivatotal;
    }

    public static double TotalTicket(String[][] mticket) {
        double total = SubTotalTicket(mticket) + IvaTicket(mticket);
        return total;
    }

    public static String MostrarTicketVenta(String[][] mticket, String idticket, String fecha) {
        String salida = "";
        String subtotal = String.format("%.2f", SubTotalTicket(mticket));
        String iva = String.format("%.2f", IvaTicket(mticket));
        String total = String.format("%.2f", TotalTicket(mticket));
        salida = "Fecha: " + fecha + "  Ticket No. " + idticket;
        salida = salida + "\n" + MostrarTicket(mticket);
        salida = salida + "\nEl total sin IVA es: " + subtotal;
        salida = salida + "\nEl IVA total es: " + iva;
        salida = salida + "\nEl total de la venta fue: " + total;
        return salida;
    }

    public static String MostrarListaProductosVenta(String[][] vproductos) {
        String salida = "COD   PRODUCTO                    PRECIO    STOCK     IVA %\n";
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            int existencia = Integer.parseInt(vproductos[ciclo][3]);
            if (existencia > 0) {
                String[] vproducto = vproductos[ciclo].clone();
                String cadena = MostrarProducto(vproducto);
                salida = salida.concat(cadena + "\n");
            }
        }
        return salida;
    }

    /*
     * Actividad 3.
     * Funcion para descontar stock.
     * Regresa -2 si no existe el producto.
     * Regresa -1 si la cantidad es mayor al stock.
     * Regresa 0 si el producto tiene 0 en stock.
     * Regresa 1 si se logro actualizar.
     */
    public static int DescontarStock(String[][] mproductos, String codigo, int cantidad) {
        int posicion = ExisteProducto(codigo, mproductos);
        if (posicion == -1) {
            return -2;
        }

        int stock = Integer.parseInt(mproductos[posicion][3]);
        if (stock == 0) {
            return 0;
        }

        if (cantidad > stock) {
            return -1;
        }

        stock = stock - cantidad;
        mproductos[posicion][3] = String.valueOf(stock);
        return 1;
    }

    public static void CapturaVentaProducto(String[][] mticket, String[][] mproductos, String idticket, int tamticket)
            throws IOException {
        String codigo, info, cantidad;
        info = MostrarListaProductosVenta(mproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto", 1);
        int posp = ExisteProducto(codigo.trim(), mproductos);
        if (posp > -1) {
            cantidad = Leer("Introduce la cantidad a vender", 1);
            int cantidadVenta = Integer.parseInt(cantidad);
            int resultado = DescontarStock(mproductos, codigo.trim(), cantidadVenta);

            if (resultado == 1) {
                String[] venta = new String[5];
                venta[0] = mproductos[posp][0];
                venta[1] = mproductos[posp][1];
                venta[2] = mproductos[posp][2];
                venta[3] = String.valueOf(cantidadVenta);
                venta[4] = mproductos[posp][4];
                if (!InsertarProductoTicket(mticket, venta, tamticket)) {
                    System.out.println("El arreglo del ticket esta lleno");
                }
            } else if (resultado == -1) {
                System.out.println("La cantidad solicitada es mayor al stock disponible");
            } else if (resultado == 0) {
                System.out.println("El producto tiene 0 en stock");
            } else {
                System.out.println("El codigo no existe, no se puede agregar");
            }
        } else {
            System.out.println("El codigo no existe, no se puede agregar");
        }
    }

    public static void RemoverProductoTicket(String[][] mticket, int pos) {
        int tam = ObtenerUltimaPosicion(mticket);
        if (tam > pos) {
            for (int i = pos; i < tam; i++) {
                mticket[i] = mticket[i + 1];
            }
            mticket[tam] = new String[5];
        } else {
            mticket[pos] = new String[5];
        }
    }

    public static void EliminarProductoTicket(String[][] mticket, int pos, int cantidadEliminar) {
        int cantidad = Integer.parseInt(mticket[pos][3]);
        if (cantidad > cantidadEliminar) {
            mticket[pos][3] = String.valueOf(cantidad - cantidadEliminar);
        } else {
            RemoverProductoTicket(mticket, pos);
        }
    }

    public static void Eliminar(String[][] mticket, String[][] mproductos) throws IOException {
        String codigo, info, cantidad;
        info = MostrarTicket(mticket);
        if (info.trim().isEmpty()) {
            System.out.println("No hay productos en el ticket");
            return;
        }

        codigo = Leer(info + "\nIntroduce el codigo del producto", 1);
        int pos = ExisteTicketCodigo(mticket, codigo);
        if (pos > -1) {
            cantidad = Leer("Introduce la cantidad a eliminar", 1);
            int cantidadEliminar = Integer.parseInt(cantidad);
            int cantidadTicket = Integer.parseInt(mticket[pos][3]);
            if (cantidadEliminar > cantidadTicket) {
                cantidadEliminar = cantidadTicket;
            }

            int posproducto = ExisteProducto(codigo, mproductos);
            if (posproducto > -1) {
                int nuevacantidad = Integer.parseInt(mproductos[posproducto][3]) + cantidadEliminar;
                mproductos[posproducto][3] = String.valueOf(nuevacantidad);
                EliminarProductoTicket(mticket, pos, cantidadEliminar);
            }
        } else {
            System.out.println("El producto no existe en el ticket");
        }
    }

    public static void AgregarProductoAVenta(String[][] mticket, String[][] mventa, String idticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= posticket; i++) {
            if (mticket[i][0] != null) {
                posventas++;
                mventa[posventas][0] = idticket;
                mventa[posventas][1] = mticket[i][0];
                mventa[posventas][2] = mticket[i][1];
                mventa[posventas][3] = mticket[i][2];
                mventa[posventas][4] = mticket[i][3];
                mventa[posventas][5] = mticket[i][4];
            }
        }
    }

    public static void Pagar(String idticket, String[][] mventa, String[][] mticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int post = ObtenerUltimaPosicion(mticket);
        if (post == -1) {
            System.out.println("No hay productos para pagar");
        } else if ((posventas + post) < tamventas) {
            AgregarProductoAVenta(mticket, mventa, idticket);
        } else {
            System.out.println("Desbordamiento de memoria de ventas");
        }
    }

    public static void DevolucionTicket(String[][] mticket, String[][] mproductos) {
        int posmticket = ObtenerUltimaPosicion(mticket);
        for (int pos = 0; pos <= posmticket; pos++) {
            String codigo = mticket[pos][0];
            int posp = ExisteProducto(codigo.trim(), mproductos);
            if (posp > -1) {
                int cant = Integer.parseInt(mticket[pos][3]) + Integer.parseInt(mproductos[posp][3]);
                mproductos[posp][3] = String.valueOf(cant);
            }
        }
    }

    public static void LimpiarTicket(String[][] mticket) {
        for (int fila = 0; fila < mticket.length; fila++) {
            for (int columna = 0; columna < mticket[fila].length; columna++) {
                mticket[fila][columna] = null;
            }
        }
    }

    /*
     * Actividad 4.
     * Procedimiento para cancelar venta.
     * Devuelve los productos del ticket al inventario y limpia el ticket.
     */
    public static void CancelarVenta(String[][] mticket, String[][] mproductos) {
        DevolucionTicket(mticket, mproductos);
        LimpiarTicket(mticket);
        System.out.println("Venta cancelada. Los productos regresaron al inventario y el ticket fue limpiado.");
    }

    public static void MenuPuntoVenta(String[][] ventas, String idticket, String[][] productos) throws IOException {
        String opcion, membrete;
        boolean pago = false;
        int tamticket = 50;
        String[][] Vticket = CrearTicket();

        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();
        opcion = "";

        do {
            membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
            membrete = membrete + "\n-----------------------------------------------------\n";

            String Tickettexto = MostrarTicket(Vticket).trim();
            if (!Tickettexto.trim().isEmpty()) {
                membrete = membrete + "\n" + Tickettexto + "\n";
            }

            String[] datosmenu = { "1.-Agregar", "2.-Eliminar", "3.-Listado", "4.-Pagar", "5.-Salida" };
            opcion = DesplegarMenu(membrete + "\nMenu de Punto de Venta", datosmenu);

            switch (opcion) {
            case "1":
                CapturaVentaProducto(Vticket, productos, idticket, tamticket);
                break;
            case "2":
                Eliminar(Vticket, productos);
                break;
            case "3":
                if (ObtenerUltimaPosicion(Vticket) > -1) {
                    System.out.println(MostrarTicket(Vticket));
                } else {
                    System.out.println("No hay productos en el ticket");
                }
                break;
            case "4":
                if (ObtenerUltimaPosicion(Vticket) > -1) {
                    System.out.println(MostrarTicketVenta(Vticket, idticket, fechadia).trim());
                    Pagar(idticket, ventas, Vticket);
                    pago = true;
                    opcion = "5";
                } else {
                    System.out.println("No hay productos para pagar");
                }
                break;
            case "5":
                System.out.println("Salida de ventas");
                if (!pago && ObtenerUltimaPosicion(Vticket) > -1) {
                    CancelarVenta(Vticket, productos);
                }
                break;
            default:
                System.out.println("No existe esta opcion");
                break;
            }
        } while (opcion.compareTo("5") != 0);
    }

    public static String MostrarVenta(String[] venta) {
        String idticket = RellenarEspacios(venta[0], 8);
        String codigo = RellenarEspacios(venta[1], 6);
        String producto = RellenarEspacios(venta[2], 28);
        String precio = RellenarEspacios(venta[3], 10);
        String cantidad = RellenarEspacios(venta[4], 10);
        String iva = RellenarEspacios(venta[5], 8);
        String cadena = idticket.concat(codigo + producto + precio + cantidad + iva);
        return cadena;
    }

    public static String MostrarListaVentas(String[][] ventas) {
        int posventas = ObtenerUltimaPosicion(ventas);
        String salida = "TICKET  COD   PRODUCTO                    PRECIO    CANTIDAD  IVA %\n";
        if (posventas == -1) {
            return "No hay ventas registradas";
        }
        for (int ciclo = 0; ciclo <= posventas; ciclo++) {
            String[] venta = { ventas[ciclo][0], ventas[ciclo][1], ventas[ciclo][2], ventas[ciclo][3],
                    ventas[ciclo][4], ventas[ciclo][5] };
            String cadena = MostrarVenta(venta);
            salida = salida.concat(cadena + "\n");
        }
        return salida;
    }

    public static void AgregarStock(String[][] vproductos) throws IOException {
        String codigo, cantidad;
        int posicion;
        String info = MostrarLista(vproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto a modificar", 1);
        posicion = ExisteProducto(codigo, vproductos);
        if (posicion > -1) {
            String[] vproducto = { vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][2],
                    vproductos[posicion][3], vproductos[posicion][4] };
            cantidad = Leer("\nIntroduce la cantidad de stock a agregar a " + MostrarProducto(vproducto), 1);
            int nuevacantidad = Integer.parseInt(cantidad) + Integer.parseInt(vproductos[posicion][3]);
            vproductos[posicion][3] = String.valueOf(nuevacantidad);
        } else {
            System.out.println("No existe el codigo");
        }
    }

    public static void MenuInventario(String[][] vproductos) throws IOException {
        String[] datosmenuinventario = { "1.-Listado", "2.-Agregar", "3.-Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            switch (opcion) {
            case "1":
                System.out.println(MostrarLista(vproductos));
                break;
            case "2":
                AgregarStock(vproductos);
                break;
            case "3":
                System.out.println("Salida del Sistema");
                break;
            default:
                System.out.println("No existe esta opcion");
                break;
            }
        } while (opcion.compareTo("3") != 0);
    }

    public static void MenuPrincipal(String[][] vproductos, String[][] vventas) throws IOException {
        String[] datosmenuprincipal = { "1.-Productos", "2.-Punto de Venta", "3.-Inventario", "4.-Ventas", "5.-Salida" };
        String opcion = "0";
        String idticket;
        do {
            idticket = ObtenerUltimoValorVentas(vventas);
            opcion = DesplegarMenu("Menu de Punto de Venta Cafeteria ", datosmenuprincipal);
            switch (opcion) {
            case "1":
                MenuProductos(vproductos);
                break;
            case "2":
                MenuPuntoVenta(vventas, idticket, vproductos);
                break;
            case "3":
                MenuInventario(vproductos);
                break;
            case "4":
                System.out.println(MostrarListaVentas(vventas));
                break;
            case "5":
                System.out.println("Salida del Sistema");
                break;
            default:
                System.out.println("No existe esta opcion");
                break;
            }
        } while (opcion.compareTo("5") != 0);
    }

    public static String ObtenerUltimoValorVentas(String[][] ventas) {
        int ultimaposicion = ObtenerUltimaPosicion(ventas);
        String ultimoValor = "000";
        if (ultimaposicion >= 0) {
            ultimoValor = ventas[ultimaposicion][0];
        }
        return ultimoValor;
    }

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        ventas = CrearVenta();
        MenuPrincipal(productos, ventas);
    }
} 

