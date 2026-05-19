using System;

public class Capitulo7_Cafeteria
{
    static string[][] productos;
    static string[][] ventas;
    static int tamventas = 100;

    public static string MostrarMenu(string[] opciones)
    {
        string cadena = "";
        foreach (string info in opciones)
        {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    public static bool EsNumeroEntero(string dato)
    {
        bool valido = true;
        if (dato == null || dato.Trim().Equals(""))
        {
            return false;
        }
        foreach (char c in dato)
        {
            if (!char.IsDigit(c))
            {
                valido = false;
            }
        }
        return valido;
    }

    public static bool EsNumeroDouble(string dato)
    {
        bool punto = false;
        bool digito = false;
        if (dato == null || dato.Trim().Equals(""))
        {
            return false;
        }
        foreach (char c in dato)
        {
            if (char.IsDigit(c))
            {
                digito = true;
            }
            else if (c == '.' && !punto)
            {
                punto = true;
            }
            else
            {
                return false;
            }
        }
        return digito;
    }

    public static bool EvaluarNumerico(string dato, int tipo)
    {
        bool valido = false;
        switch (tipo)
        {
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

    public static string Dialogo(string texto)
    {
        Console.WriteLine(texto + " : ");
        return Console.ReadLine();
    }

    // Actividad 1.
    // Leer ahora recibe el texto y el tipo de dato.
    // tipo 0 = texto, tipo 1 = entero, tipo 2 = double.
    public static string Leer(string texto, int tipo)
    {
        string cadena = "";
        bool correcto = false;

        do
        {
            cadena = Dialogo(texto);

            if (cadena != null)
            {
                cadena = cadena.Trim();
                if (cadena.Equals(""))
                {
                    cadena = null;
                }
            }

            if (cadena == null)
            {
                Console.WriteLine("Error: el dato no puede estar vacio.");
            }
            else if (tipo == 0)
            {
                correcto = true;
            }
            else if (EvaluarNumerico(cadena, tipo))
            {
                correcto = true;
            }
            else
            {
                Console.WriteLine("Error: el dato no corresponde al tipo solicitado. Intentalo nuevamente.");
            }
        } while (!correcto);

        return cadena;
    }

    public static string Leer(string texto)
    {
        return Leer(texto, 0);
    }

    public static string DesplegarMenu(string titulo, string[] menu)
    {
        string cadena = titulo + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\nQue opcion deseas";
        return Leer(cadena, 1);
    }

    public static string RellenarEspacios(string dato, int tamano)
    {
        if (dato == null)
        {
            dato = "";
        }
        return dato.PadRight(tamano);
    }

    public static string Fecha()
    {
        return DateTime.Now.ToString("dd-MM-yyyy");
    }

    public static string IdTicketSiguiente(string idticket)
    {
        string idticketnext = "";
        int num = int.Parse(idticket) + 1;
        if (num < 10)
        {
            idticketnext = "00" + num.ToString().Trim();
        }
        else if ((num > 9) && (num < 100))
        {
            idticketnext = "0" + num.ToString().Trim();
        }
        else
        {
            idticketnext = num.ToString().Trim();
        }
        return idticketnext;
    }

    public static int ObtenerUltimaPosicion(string[][] matriz)
    {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.Length; i++)
        {
            if (matriz[i][0] != null && !matriz[i][0].Equals(""))
            {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    // Actividad 2. Matriz de 20 productos y 5 columnas.
    public static string[][] CargarProductos()
    {
        string[][] producto = {
            new string[] { "001", "Cafe americano", "35", "20", "16" },
            new string[] { "002", "Cafe latte", "48", "20", "16" },
            new string[] { "003", "Capuchino", "50", "20", "16" },
            new string[] { "004", "Moka", "55", "20", "16" },
            new string[] { "005", "Chocolate caliente", "45", "20", "16" },
            new string[] { "006", "Te chai", "42", "20", "16" },
            new string[] { "007", "Frappe de cafe", "65", "20", "16" },
            new string[] { "008", "Frappe de chocolate", "68", "20", "16" },
            new string[] { "009", "Panini de jamon", "75", "15", "16" },
            new string[] { "010", "Croissant", "38", "15", "0" },
            new string[] { "011", "Muffin de vainilla", "32", "15", "0" },
            new string[] { "012", "Brownie", "40", "15", "0" },
            new string[] { "013", "Pay de queso", "58", "12", "0" },
            new string[] { "014", "Galleta chispas", "25", "20", "0" },
            new string[] { "015", "Agua natural", "20", "24", "0" },
            new string[] { "016", "Te helado", "35", "18", "16" },
            new string[] { "017", "Sandwich de pollo", "70", "15", "16" },
            new string[] { "018", "Ensalada de fruta", "55", "12", "0" },
            new string[] { "019", "Bagel con queso", "60", "12", "16" },
            new string[] { "020", "Jugo de naranja", "38", "18", "0" }
        };
        return producto;
    }

    public static string MostrarProducto(string[] vproducto)
    {
        string codigo = RellenarEspacios(vproducto[0], 6);
        string producto = RellenarEspacios(vproducto[1], 28);
        string precio = RellenarEspacios(vproducto[2], 10);
        string cantidad = RellenarEspacios(vproducto[3], 10);
        string iva = RellenarEspacios(vproducto[4], 8);
        return codigo + producto + precio + cantidad + iva;
    }

    public static string MostrarLista(string[][] vproductos)
    {
        string salida = "COD   PRODUCTO                    PRECIO    STOCK     IVA %\n";
        for (int ciclo = 0; ciclo < vproductos.Length; ciclo++)
        {
            string cadena = MostrarProducto(vproductos[ciclo]);
            salida = salida + cadena + "\n";
        }
        return salida;
    }

    public static int ExisteProducto(string codigo, string[][] vproductos)
    {
        int enc = -1;
        for (int ciclo = 0; ciclo < vproductos.Length; ciclo++)
        {
            if (vproductos[ciclo][0] != null && vproductos[ciclo][0].CompareTo(codigo.Trim()) == 0)
            {
                enc = ciclo;
            }
        }
        return enc;
    }

    public static double ObtenerIvaProducto(string codigo, string[][] mproductos)
    {
        double iva = 0;
        int pos = ExisteProducto(codigo, mproductos);
        if (pos > -1)
        {
            iva = double.Parse(mproductos[pos][4]);
        }
        return iva;
    }

    public static void ModificarProducto(string[][] vproductos)
    {
        string info = MostrarLista(vproductos);
        string codigo = Leer(info + "\nIntroduce el codigo del producto a modificar", 1);
        int posicion = ExisteProducto(codigo, vproductos);
        if (posicion > -1)
        {
            string precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproductos[posicion]), 2);
            vproductos[posicion][2] = precio;
        }
        else
        {
            Console.WriteLine("No existe el codigo");
        }
    }

    public static void MenuProductos(string[][] vproductos)
    {
        string[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
        string opcion = "0";
        do
        {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            switch (opcion)
            {
                case "1": ModificarProducto(vproductos); break;
                case "2": Console.WriteLine(MostrarLista(vproductos)); break;
                case "3": Console.WriteLine("Salida del Sistema"); break;
                default: Console.WriteLine("No existe esta opcion"); break;
            }
        } while (opcion.CompareTo("3") != 0);
    }

    public static string[][] CrearVenta()
    {
        string[][] m = new string[tamventas][];
        for (int i = 0; i < tamventas; i++)
        {
            m[i] = new string[6];
        }
        return m;
    }

    public static string[][] CrearTicket()
    {
        string[][] m = new string[50][];
        for (int i = 0; i < 50; i++)
        {
            m[i] = new string[5];
        }
        return m;
    }

    public static int ExisteTicketCodigo(string[][] mticket, string codigo)
    {
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++)
        {
            if (mticket[ciclo][0].CompareTo(codigo.Trim()) == 0)
            {
                return ciclo;
            }
        }
        return -1;
    }

    public static bool InsertarProductoTicket(string[][] mticket, string[] datos, int tamticket)
    {
        int posticket = ObtenerUltimaPosicion(mticket);
        int enc = ExisteTicketCodigo(mticket, datos[0]);

        if (posticket < tamticket - 1)
        {
            if (enc > -1)
            {
                int cantidadactual = int.Parse(mticket[enc][3]);
                mticket[enc][3] = Convert.ToString(cantidadactual + int.Parse(datos[3]));
            }
            else
            {
                posticket++;
                mticket[posticket][0] = datos[0];
                mticket[posticket][1] = datos[1];
                mticket[posticket][2] = datos[2];
                mticket[posticket][3] = datos[3];
                mticket[posticket][4] = datos[4];
            }
            return true;
        }
        return false;
    }

    public static string TotalProducto(string precio, string cantidad)
    {
        double total = double.Parse(precio) * double.Parse(cantidad);
        return total.ToString("0.00");
    }

    // Actividad 5. IVA por producto usando la ultima columna de la matriz.
    public static double IvaProducto(string precio, string cantidad, string porcentajeIva)
    {
        double subtotal = double.Parse(precio) * double.Parse(cantidad);
        double porcentaje = double.Parse(porcentajeIva);
        return subtotal * (porcentaje / 100);
    }

    public static string MostrarProductoTicket(string[][] mticket, int pos)
    {
        string codigo = RellenarEspacios(mticket[pos][0], 6);
        string producto = RellenarEspacios(mticket[pos][1], 28);
        string precio = RellenarEspacios(mticket[pos][2], 10);
        string cantidad = RellenarEspacios(mticket[pos][3], 6);
        string iva = RellenarEspacios(IvaProducto(mticket[pos][2], mticket[pos][3], mticket[pos][4]).ToString("0.00"), 10);
        string totalproducto = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10);
        return codigo + producto + precio + cantidad + iva + totalproducto;
    }

    public static string MostrarTicket(string[][] mticket)
    {
        string salida = "COD   PRODUCTO                    PRECIO    CANT  IVA       SUBTOTAL\n";
        int pos = ObtenerUltimaPosicion(mticket);
        if (pos == -1)
        {
            return "";
        }
        for (int ciclo = 0; ciclo <= pos; ciclo++)
        {
            salida = salida + MostrarProductoTicket(mticket, ciclo) + "\n";
        }
        return salida;
    }

    public static double SubTotalTicket(string[][] mticket)
    {
        double subtotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++)
        {
            subtotal = subtotal + double.Parse(TotalProducto(mticket[ciclo][2], mticket[ciclo][3]));
        }
        return subtotal;
    }

    public static double IvaTicket(string[][] mticket)
    {
        double ivatotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++)
        {
            ivatotal = ivatotal + IvaProducto(mticket[ciclo][2], mticket[ciclo][3], mticket[ciclo][4]);
        }
        return ivatotal;
    }

    public static double TotalTicket(string[][] mticket)
    {
        return SubTotalTicket(mticket) + IvaTicket(mticket);
    }

    public static string MostrarTicketVenta(string[][] mticket, string idticket, string fecha)
    {
        string salida = "Fecha: " + fecha + "  Ticket No. " + idticket;
        salida = salida + "\n" + MostrarTicket(mticket);
        salida = salida + "\nEl total sin IVA es: " + SubTotalTicket(mticket).ToString("0.00");
        salida = salida + "\nEl IVA total es: " + IvaTicket(mticket).ToString("0.00");
        salida = salida + "\nEl total de la venta fue: " + TotalTicket(mticket).ToString("0.00");
        return salida;
    }

    public static string MostrarListaProductosVenta(string[][] vproductos)
    {
        string salida = "COD   PRODUCTO                    PRECIO    STOCK     IVA %\n";
        for (int ciclo = 0; ciclo < vproductos.Length; ciclo++)
        {
            int existencia = int.Parse(vproductos[ciclo][3]);
            if (existencia > 0)
            {
                salida = salida + MostrarProducto(vproductos[ciclo]) + "\n";
            }
        }
        return salida;
    }

    // Actividad 3. Descontar stock.
    // -2: no existe, -1: cantidad mayor al stock, 0: stock cero, 1: correcto.
    public static int DescontarStock(string[][] mproductos, string codigo, int cantidad)
    {
        int posicion = ExisteProducto(codigo, mproductos);
        if (posicion == -1)
        {
            return -2;
        }

        int stock = int.Parse(mproductos[posicion][3]);
        if (stock == 0)
        {
            return 0;
        }

        if (cantidad > stock)
        {
            return -1;
        }

        stock = stock - cantidad;
        mproductos[posicion][3] = Convert.ToString(stock);
        return 1;
    }

    public static void CapturaVentaProducto(string[][] mticket, string[][] mproductos, string idticket, int tamticket)
    {
        string info = MostrarListaProductosVenta(mproductos);
        string codigo = Leer(info + "\nIntroduce el codigo del producto", 1);
        int posp = ExisteProducto(codigo.Trim(), mproductos);
        if (posp > -1)
        {
            string cantidad = Leer("Introduce la cantidad a vender", 1);
            int cantidadVenta = int.Parse(cantidad);
            int resultado = DescontarStock(mproductos, codigo.Trim(), cantidadVenta);

            if (resultado == 1)
            {
                string[] venta = new string[5];
                venta[0] = mproductos[posp][0];
                venta[1] = mproductos[posp][1];
                venta[2] = mproductos[posp][2];
                venta[3] = cantidadVenta.ToString();
                venta[4] = mproductos[posp][4];
                if (!InsertarProductoTicket(mticket, venta, tamticket))
                {
                    Console.WriteLine("El arreglo del ticket esta lleno");
                }
            }
            else if (resultado == -1)
            {
                Console.WriteLine("La cantidad solicitada es mayor al stock disponible");
            }
            else if (resultado == 0)
            {
                Console.WriteLine("El producto tiene 0 en stock");
            }
            else
            {
                Console.WriteLine("El codigo no existe, no se puede agregar");
            }
        }
        else
        {
            Console.WriteLine("El codigo no existe, no se puede agregar");
        }
    }

    public static void RemoverProductoTicket(string[][] mticket, int pos)
    {
        int tam = ObtenerUltimaPosicion(mticket);
        if (tam > pos)
        {
            for (int i = pos; i < tam; i++)
            {
                mticket[i] = mticket[i + 1];
            }
            mticket[tam] = new string[5];
        }
        else
        {
            mticket[pos] = new string[5];
        }
    }

    public static void EliminarProductoTicket(string[][] mticket, int pos, int cantidadEliminar)
    {
        int cantidad = int.Parse(mticket[pos][3]);
        if (cantidad > cantidadEliminar)
        {
            mticket[pos][3] = Convert.ToString(cantidad - cantidadEliminar);
        }
        else
        {
            RemoverProductoTicket(mticket, pos);
        }
    }

    public static void Eliminar(string[][] mticket, string[][] mproductos)
    {
        string info = MostrarTicket(mticket);
        if (info.Trim().Equals(""))
        {
            Console.WriteLine("No hay productos en el ticket");
            return;
        }

        string codigo = Leer(info + "\nIntroduce el codigo del producto", 1);
        int pos = ExisteTicketCodigo(mticket, codigo);
        if (pos > -1)
        {
            string cantidad = Leer("Introduce la cantidad a eliminar", 1);
            int cantidadEliminar = int.Parse(cantidad);
            int cantidadTicket = int.Parse(mticket[pos][3]);
            if (cantidadEliminar > cantidadTicket)
            {
                cantidadEliminar = cantidadTicket;
            }

            int posproducto = ExisteProducto(codigo, mproductos);
            if (posproducto > -1)
            {
                int nuevacantidad = int.Parse(mproductos[posproducto][3]) + cantidadEliminar;
                mproductos[posproducto][3] = Convert.ToString(nuevacantidad);
                EliminarProductoTicket(mticket, pos, cantidadEliminar);
            }
        }
        else
        {
            Console.WriteLine("El producto no existe en el ticket");
        }
    }

    public static void AgregarProductoAVenta(string[][] mticket, string[][] mventa, string idticket)
    {
        int posventas = ObtenerUltimaPosicion(mventa);
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= posticket; i++)
        {
            if (mticket[i][0] != null)
            {
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

    public static void Pagar(string idticket, string[][] mventa, string[][] mticket)
    {
        int posventas = ObtenerUltimaPosicion(mventa);
        int post = ObtenerUltimaPosicion(mticket);
        if (post == -1)
        {
            Console.WriteLine("No hay productos para pagar");
        }
        else if ((posventas + post) < tamventas)
        {
            AgregarProductoAVenta(mticket, mventa, idticket);
        }
        else
        {
            Console.WriteLine("Desbordamiento de memoria de ventas");
        }
    }

    public static void DevolucionTicket(string[][] mticket, string[][] mproductos)
    {
        int posmticket = ObtenerUltimaPosicion(mticket);
        for (int pos = 0; pos <= posmticket; pos++)
        {
            string codigo = mticket[pos][0];
            int posp = ExisteProducto(codigo.Trim(), mproductos);
            if (posp > -1)
            {
                int cant = int.Parse(mticket[pos][3]) + int.Parse(mproductos[posp][3]);
                mproductos[posp][3] = Convert.ToString(cant);
            }
        }
    }

    public static void LimpiarTicket(string[][] mticket)
    {
        for (int fila = 0; fila < mticket.Length; fila++)
        {
            for (int columna = 0; columna < mticket[fila].Length; columna++)
            {
                mticket[fila][columna] = null;
            }
        }
    }

    // Actividad 4. Cancelar venta.
    public static void CancelarVenta(string[][] mticket, string[][] mproductos)
    {
        DevolucionTicket(mticket, mproductos);
        LimpiarTicket(mticket);
        Console.WriteLine("Venta cancelada. Los productos regresaron al inventario y el ticket fue limpiado.");
    }

    public static void MenuPuntoVenta(string[][] ventas, string idticket, string[][] productos)
    {
        string opcion;
        bool pago = false;
        int tamticket = 50;
        string[][] Vticket = CrearTicket();

        idticket = IdTicketSiguiente(idticket);
        string fechadia = Fecha();
        opcion = "";

        do
        {
            string membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
            membrete = membrete + "\n-----------------------------------------------------\n";

            string Tickettexto = MostrarTicket(Vticket).Trim();
            if (!Tickettexto.Equals(""))
            {
                membrete = membrete + "\n" + Tickettexto + "\n";
            }

            string[] datosmenu = { "1.-Agregar", "2.-Eliminar", "3.-Listado", "4.-Pagar", "5.-Salida" };
            opcion = DesplegarMenu(membrete + "\nMenu de Punto de Venta", datosmenu);

            switch (opcion)
            {
                case "1": CapturaVentaProducto(Vticket, productos, idticket, tamticket); break;
                case "2": Eliminar(Vticket, productos); break;
                case "3":
                    if (ObtenerUltimaPosicion(Vticket) > -1)
                        Console.WriteLine(MostrarTicket(Vticket));
                    else
                        Console.WriteLine("No hay productos en el ticket");
                    break;
                case "4":
                    if (ObtenerUltimaPosicion(Vticket) > -1)
                    {
                        Console.WriteLine(MostrarTicketVenta(Vticket, idticket, fechadia).Trim());
                        Pagar(idticket, ventas, Vticket);
                        pago = true;
                        opcion = "5";
                    }
                    else
                    {
                        Console.WriteLine("No hay productos para pagar");
                    }
                    break;
                case "5":
                    Console.WriteLine("Salida de ventas");
                    if (!pago && ObtenerUltimaPosicion(Vticket) > -1)
                    {
                        CancelarVenta(Vticket, productos);
                    }
                    break;
                default: Console.WriteLine("No existe esta opcion"); break;
            }
        } while (opcion.CompareTo("5") != 0);
    }

    public static string MostrarVenta(string[] venta)
    {
        string idticket = RellenarEspacios(venta[0], 8);
        string codigo = RellenarEspacios(venta[1], 6);
        string producto = RellenarEspacios(venta[2], 28);
        string precio = RellenarEspacios(venta[3], 10);
        string cantidad = RellenarEspacios(venta[4], 10);
        string iva = RellenarEspacios(venta[5], 8);
        return idticket + codigo + producto + precio + cantidad + iva;
    }

    public static string MostrarListaVentas(string[][] ventas)
    {
        int posventas = ObtenerUltimaPosicion(ventas);
        string salida = "TICKET  COD   PRODUCTO                    PRECIO    CANTIDAD  IVA %\n";
        if (posventas == -1)
        {
            return "No hay ventas registradas";
        }
        for (int ciclo = 0; ciclo <= posventas; ciclo++)
        {
            salida = salida + MostrarVenta(ventas[ciclo]) + "\n";
        }
        return salida;
    }

    public static void AgregarStock(string[][] vproductos)
    {
        string info = MostrarLista(vproductos);
        string codigo = Leer(info + "\nIntroduce el codigo del producto a modificar", 1);
        int posicion = ExisteProducto(codigo, vproductos);
        if (posicion > -1)
        {
            string cantidad = Leer("\nIntroduce la cantidad de stock a agregar a " + MostrarProducto(vproductos[posicion]), 1);
            int nuevacantidad = int.Parse(cantidad) + int.Parse(vproductos[posicion][3]);
            vproductos[posicion][3] = Convert.ToString(nuevacantidad);
        }
        else
        {
            Console.WriteLine("No existe el codigo");
        }
    }

    public static void MenuInventario(string[][] vproductos)
    {
        string[] datosmenuinventario = { "1.-Listado", "2.-Agregar", "3.-Salida" };
        string opcion = "0";
        do
        {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            switch (opcion)
            {
                case "1": Console.WriteLine(MostrarLista(vproductos)); break;
                case "2": AgregarStock(vproductos); break;
                case "3": Console.WriteLine("Salida del Sistema"); break;
                default: Console.WriteLine("No existe esta opcion"); break;
            }
        } while (opcion.CompareTo("3") != 0);
    }

    public static void MenuPrincipal(string[][] vproductos, string[][] vventas)
    {
        string[] datosmenuprincipal = { "1.-Productos", "2.-Punto de Venta", "3.-Inventario", "4.-Ventas", "5.-Salida" };
        string opcion = "0";
        string idticket;
        do
        {
            idticket = ObtenerUltimoValorVentas(vventas);
            opcion = DesplegarMenu("Menu de Punto de Venta Cafeteria Aroma", datosmenuprincipal);
            switch (opcion)
            {
                case "1": MenuProductos(vproductos); break;
                case "2": MenuPuntoVenta(vventas, idticket, vproductos); break;
                case "3": MenuInventario(vproductos); break;
                case "4": Console.WriteLine(MostrarListaVentas(vventas)); break;
                case "5": Console.WriteLine("Salida del Sistema"); break;
                default: Console.WriteLine("No existe esta opcion"); break;
            }
        } while (opcion.CompareTo("5") != 0);
    }

    public static string ObtenerUltimoValorVentas(string[][] ventas)
    {
        int ultimaposicion = ObtenerUltimaPosicion(ventas);
        string ultimoValor = "000";
        if (ultimaposicion >= 0)
        {
            ultimoValor = ventas[ultimaposicion][0];
        }
        return ultimoValor;
    }

    public static void Main(string[] args)
    {
        productos = CargarProductos();
        ventas = CrearVenta();
        MenuPrincipal(productos, ventas);
    }
}
