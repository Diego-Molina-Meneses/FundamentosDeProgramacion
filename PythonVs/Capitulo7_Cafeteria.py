from datetime import datetime

productos = []
ventas = []
tamventas = 100


def mostrar_menu(opciones):
    cadena = ""
    for info in opciones:
        cadena += info + "\n"
    return cadena


def es_numero_entero(dato):
    if dato is None or dato.strip() == "":
        return False
    return dato.isdigit()


def es_numero_double(dato):
    if dato is None or dato.strip() == "":
        return False
    punto = False
    digito = False
    for c in dato:
        if c.isdigit():
            digito = True
        elif c == "." and not punto:
            punto = True
        else:
            return False
    return digito


def evaluar_numerico(dato, tipo):
    if tipo == 1:
        return es_numero_entero(dato)
    if tipo == 2:
        return es_numero_double(dato)
    return True


def dialogo(texto):
    print(texto + " : ")
    return input()


# Actividad 1: Leer(texto, tipo)
# tipo 0 = texto, tipo 1 = entero, tipo 2 = double.
def leer(texto, tipo=0):
    correcto = False
    cadena = ""
    while not correcto:
        cadena = dialogo(texto)
        if cadena is not None:
            cadena = cadena.strip()
            if cadena == "":
                cadena = None

        if cadena is None:
            print("Error: el dato no puede estar vacio.")
        elif tipo == 0:
            correcto = True
        elif evaluar_numerico(cadena, tipo):
            correcto = True
        else:
            print("Error: el dato no corresponde al tipo solicitado. Intentalo nuevamente.")
    return cadena


def desplegar_menu(titulo, menu):
    cadena = titulo + "\n\n"
    cadena += mostrar_menu(menu)
    cadena += "\nQue opcion deseas"
    return leer(cadena, 1)


def rellenar_espacios(dato, tamano):
    if dato is None:
        dato = ""
    return str(dato).ljust(tamano)


def fecha():
    return datetime.now().strftime("%d-%m-%Y")


def id_ticket_siguiente(idticket):
    num = int(idticket) + 1
    if num < 10:
        return "00" + str(num)
    elif 9 < num < 100:
        return "0" + str(num)
    return str(num)


def obtener_ultima_posicion(matriz):
    ultima_posicion = -1
    for i in range(len(matriz)):
        if matriz[i][0] is not None and matriz[i][0] != "":
            ultima_posicion = i
    return ultima_posicion


# Actividad 2: 20 productos y 5 columnas: codigo, nombre, precio, stock, IVA.
def cargar_productos():
    return [
        ["001", "Cafe americano", "35", "20", "16"],
        ["002", "Cafe latte", "48", "20", "16"],
        ["003", "Capuchino", "50", "20", "16"],
        ["004", "Moka", "55", "20", "16"],
        ["005", "Chocolate caliente", "45", "20", "16"],
        ["006", "Te chai", "42", "20", "16"],
        ["007", "Frappe de cafe", "65", "20", "16"],
        ["008", "Frappe de chocolate", "68", "20", "16"],
        ["009", "Panini de jamon", "75", "15", "16"],
        ["010", "Croissant", "38", "15", "0"],
        ["011", "Muffin de vainilla", "32", "15", "0"],
        ["012", "Brownie", "40", "15", "0"],
        ["013", "Pay de queso", "58", "12", "0"],
        ["014", "Galleta chispas", "25", "20", "0"],
        ["015", "Agua natural", "20", "24", "0"],
        ["016", "Te helado", "35", "18", "16"],
        ["017", "Sandwich de pollo", "70", "15", "16"],
        ["018", "Ensalada de fruta", "55", "12", "0"],
        ["019", "Bagel con queso", "60", "12", "16"],
        ["020", "Jugo de naranja", "38", "18", "0"],
    ]


def mostrar_producto(vproducto):
    codigo = rellenar_espacios(vproducto[0], 6)
    producto = rellenar_espacios(vproducto[1], 28)
    precio = rellenar_espacios(vproducto[2], 10)
    cantidad = rellenar_espacios(vproducto[3], 10)
    iva = rellenar_espacios(vproducto[4], 8)
    return codigo + producto + precio + cantidad + iva


def mostrar_lista(vproductos):
    salida = "COD   PRODUCTO                    PRECIO    STOCK     IVA %\n"
    for producto in vproductos:
        salida += mostrar_producto(producto) + "\n"
    return salida


def existe_producto(codigo, vproductos):
    enc = -1
    for pos in range(len(vproductos)):
        if vproductos[pos][0] is not None and vproductos[pos][0] == codigo.strip():
            enc = pos
    return enc


def obtener_iva_producto(codigo, mproductos):
    pos = existe_producto(codigo, mproductos)
    if pos > -1:
        return float(mproductos[pos][4])
    return 0


def modificar_producto(vproductos):
    info = mostrar_lista(vproductos)
    codigo = leer(info + "\nIntroduce el codigo del producto a modificar", 1)
    posicion = existe_producto(codigo, vproductos)
    if posicion > -1:
        precio = leer("\nIntroduce el precio de " + mostrar_producto(vproductos[posicion]), 2)
        vproductos[posicion][2] = precio
    else:
        print("No existe el codigo")


def menu_productos(vproductos):
    datos_menu_productos = ["1.-Modificar ", "2.-Listado ", "3.-Salida "]
    opcion = "0"
    while opcion != "3":
        opcion = desplegar_menu("Opciones de Productos", datos_menu_productos)
        if opcion == "1":
            modificar_producto(vproductos)
        elif opcion == "2":
            print(mostrar_lista(vproductos))
        elif opcion == "3":
            print("Salida del Sistema")
        else:
            print("No existe esta opcion")


def crear_venta():
    return [[None for _ in range(6)] for _ in range(tamventas)]


def crear_ticket():
    return [[None for _ in range(5)] for _ in range(50)]


def existe_ticket_codigo(mticket, codigo):
    pos = obtener_ultima_posicion(mticket)
    for ciclo in range(pos + 1):
        if mticket[ciclo][0] == codigo.strip():
            return ciclo
    return -1


def insertar_producto_ticket(mticket, datos, tamticket):
    posticket = obtener_ultima_posicion(mticket)
    enc = existe_ticket_codigo(mticket, datos[0])

    if posticket < tamticket - 1:
        if enc > -1:
            cantidad_actual = int(mticket[enc][3])
            mticket[enc][3] = str(cantidad_actual + int(datos[3]))
        else:
            posticket += 1
            mticket[posticket][0] = datos[0]
            mticket[posticket][1] = datos[1]
            mticket[posticket][2] = datos[2]
            mticket[posticket][3] = datos[3]
            mticket[posticket][4] = datos[4]
        return True
    return False


def total_producto(precio, cantidad):
    total = float(precio) * float(cantidad)
    return f"{total:.2f}"


# Actividad 5: IVA por producto con la ultima columna de la matriz.
def iva_producto(precio, cantidad, porcentaje_iva):
    subtotal = float(precio) * float(cantidad)
    porcentaje = float(porcentaje_iva)
    return subtotal * (porcentaje / 100)


def mostrar_producto_ticket(mticket, pos):
    codigo = rellenar_espacios(mticket[pos][0], 6)
    producto = rellenar_espacios(mticket[pos][1], 28)
    precio = rellenar_espacios(mticket[pos][2], 10)
    cantidad = rellenar_espacios(mticket[pos][3], 6)
    iva = rellenar_espacios(f"{iva_producto(mticket[pos][2], mticket[pos][3], mticket[pos][4]):.2f}", 10)
    total = rellenar_espacios(total_producto(mticket[pos][2], mticket[pos][3]), 10)
    return codigo + producto + precio + cantidad + iva + total


def mostrar_ticket(mticket):
    salida = "COD   PRODUCTO                    PRECIO    CANT  IVA       SUBTOTAL\n"
    pos = obtener_ultima_posicion(mticket)
    if pos == -1:
        return ""
    for ciclo in range(pos + 1):
        salida += mostrar_producto_ticket(mticket, ciclo) + "\n"
    return salida


def subtotal_ticket(mticket):
    subtotal = 0.0
    pos = obtener_ultima_posicion(mticket)
    for ciclo in range(pos + 1):
        subtotal += float(total_producto(mticket[ciclo][2], mticket[ciclo][3]))
    return subtotal


def iva_ticket(mticket):
    iva_total = 0.0
    pos = obtener_ultima_posicion(mticket)
    for ciclo in range(pos + 1):
        iva_total += iva_producto(mticket[ciclo][2], mticket[ciclo][3], mticket[ciclo][4])
    return iva_total


def total_ticket(mticket):
    return subtotal_ticket(mticket) + iva_ticket(mticket)


def mostrar_ticket_venta(mticket, idticket, fechadia):
    salida = "Fecha: " + fechadia + "  Ticket No. " + idticket
    salida += "\n" + mostrar_ticket(mticket)
    salida += f"\nEl total sin IVA es: {subtotal_ticket(mticket):.2f}"
    salida += f"\nEl IVA total es: {iva_ticket(mticket):.2f}"
    salida += f"\nEl total de la venta fue: {total_ticket(mticket):.2f}"
    return salida


def mostrar_lista_productos_venta(vproductos):
    salida = "COD   PRODUCTO                    PRECIO    STOCK     IVA %\n"
    for producto in vproductos:
        existencia = int(producto[3])
        if existencia > 0:
            salida += mostrar_producto(producto.copy()) + "\n"
    return salida


# Actividad 3: regresa -2, -1, 0 o 1 segun el resultado.
def descontar_stock(mproductos, codigo, cantidad):
    posicion = existe_producto(codigo, mproductos)
    if posicion == -1:
        return -2

    stock = int(mproductos[posicion][3])
    if stock == 0:
        return 0

    if cantidad > stock:
        return -1

    stock -= cantidad
    mproductos[posicion][3] = str(stock)
    return 1


def captura_venta_producto(mticket, mproductos, idticket, tamticket):
    info = mostrar_lista_productos_venta(mproductos)
    codigo = leer(info + "\nIntroduce el codigo del producto", 1)
    posp = existe_producto(codigo.strip(), mproductos)
    if posp > -1:
        cantidad = leer("Introduce la cantidad a vender", 1)
        cantidad_venta = int(cantidad)
        resultado = descontar_stock(mproductos, codigo.strip(), cantidad_venta)

        if resultado == 1:
            venta = [mproductos[posp][0], mproductos[posp][1], mproductos[posp][2], str(cantidad_venta), mproductos[posp][4]]
            if not insertar_producto_ticket(mticket, venta, tamticket):
                print("El arreglo del ticket esta lleno")
        elif resultado == -1:
            print("La cantidad solicitada es mayor al stock disponible")
        elif resultado == 0:
            print("El producto tiene 0 en stock")
        else:
            print("El codigo no existe, no se puede agregar")
    else:
        print("El codigo no existe, no se puede agregar")


def remover_producto_ticket(mticket, pos):
    tam = obtener_ultima_posicion(mticket)
    if tam > pos:
        for i in range(pos, tam):
            mticket[i] = mticket[i + 1]
        mticket[tam] = [None for _ in range(5)]
    else:
        mticket[pos] = [None for _ in range(5)]


def eliminar_producto_ticket(mticket, pos, cantidad_eliminar):
    cantidad = int(mticket[pos][3])
    if cantidad > cantidad_eliminar:
        mticket[pos][3] = str(cantidad - cantidad_eliminar)
    else:
        remover_producto_ticket(mticket, pos)


def eliminar(mticket, mproductos):
    info = mostrar_ticket(mticket)
    if info.strip() == "":
        print("No hay productos en el ticket")
        return

    codigo = leer(info + "\nIntroduce el codigo del producto", 1)
    pos = existe_ticket_codigo(mticket, codigo)
    if pos > -1:
        cantidad = leer("Introduce la cantidad a eliminar", 1)
        cantidad_eliminar = int(cantidad)
        cantidad_ticket = int(mticket[pos][3])
        if cantidad_eliminar > cantidad_ticket:
            cantidad_eliminar = cantidad_ticket

        posproducto = existe_producto(codigo, mproductos)
        if posproducto > -1:
            nueva_cantidad = int(mproductos[posproducto][3]) + cantidad_eliminar
            mproductos[posproducto][3] = str(nueva_cantidad)
            eliminar_producto_ticket(mticket, pos, cantidad_eliminar)
    else:
        print("El producto no existe en el ticket")


def agregar_producto_a_venta(mticket, mventa, idticket):
    posventas = obtener_ultima_posicion(mventa)
    posticket = obtener_ultima_posicion(mticket)
    for i in range(posticket + 1):
        if mticket[i][0] is not None:
            posventas += 1
            mventa[posventas][0] = idticket
            mventa[posventas][1] = mticket[i][0]
            mventa[posventas][2] = mticket[i][1]
            mventa[posventas][3] = mticket[i][2]
            mventa[posventas][4] = mticket[i][3]
            mventa[posventas][5] = mticket[i][4]


def pagar(idticket, mventa, mticket):
    posventas = obtener_ultima_posicion(mventa)
    post = obtener_ultima_posicion(mticket)
    if post == -1:
        print("No hay productos para pagar")
    elif (posventas + post) < tamventas:
        agregar_producto_a_venta(mticket, mventa, idticket)
    else:
        print("Desbordamiento de memoria de ventas")


def devolucion_ticket(mticket, mproductos):
    posmticket = obtener_ultima_posicion(mticket)
    for pos in range(posmticket + 1):
        codigo = mticket[pos][0]
        posp = existe_producto(codigo.strip(), mproductos)
        if posp > -1:
            cant = int(mticket[pos][3]) + int(mproductos[posp][3])
            mproductos[posp][3] = str(cant)


def limpiar_ticket(mticket):
    for fila in range(len(mticket)):
        for columna in range(len(mticket[fila])):
            mticket[fila][columna] = None


# Actividad 4: cancelar venta.
def cancelar_venta(mticket, mproductos):
    devolucion_ticket(mticket, mproductos)
    limpiar_ticket(mticket)
    print("Venta cancelada. Los productos regresaron al inventario y el ticket fue limpiado.")


def menu_punto_venta(ventas_local, idticket, productos_local):
    pago = False
    tamticket = 50
    vticket = crear_ticket()
    idticket = id_ticket_siguiente(idticket)
    fechadia = fecha()
    opcion = ""

    while opcion != "5":
        membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket
        membrete += "\n-----------------------------------------------------\n"
        ticket_texto = mostrar_ticket(vticket).strip()
        if ticket_texto != "":
            membrete += "\n" + ticket_texto + "\n"

        datos_menu = ["1.-Agregar", "2.-Eliminar", "3.-Listado", "4.-Pagar", "5.-Salida"]
        opcion = desplegar_menu(membrete + "\nMenu de Punto de Venta", datos_menu)

        if opcion == "1":
            captura_venta_producto(vticket, productos_local, idticket, tamticket)
        elif opcion == "2":
            eliminar(vticket, productos_local)
        elif opcion == "3":
            if obtener_ultima_posicion(vticket) > -1:
                print(mostrar_ticket(vticket))
            else:
                print("No hay productos en el ticket")
        elif opcion == "4":
            if obtener_ultima_posicion(vticket) > -1:
                print(mostrar_ticket_venta(vticket, idticket, fechadia).strip())
                pagar(idticket, ventas_local, vticket)
                pago = True
                opcion = "5"
            else:
                print("No hay productos para pagar")
        elif opcion == "5":
            print("Salida de ventas")
            if not pago and obtener_ultima_posicion(vticket) > -1:
                cancelar_venta(vticket, productos_local)
        else:
            print("No existe esta opcion")


def mostrar_venta(venta):
    idticket = rellenar_espacios(venta[0], 8)
    codigo = rellenar_espacios(venta[1], 6)
    producto = rellenar_espacios(venta[2], 28)
    precio = rellenar_espacios(venta[3], 10)
    cantidad = rellenar_espacios(venta[4], 10)
    iva = rellenar_espacios(venta[5], 8)
    return idticket + codigo + producto + precio + cantidad + iva


def mostrar_lista_ventas(ventas_local):
    posventas = obtener_ultima_posicion(ventas_local)
    salida = "TICKET  COD   PRODUCTO                    PRECIO    CANTIDAD  IVA %\n"
    if posventas == -1:
        return "No hay ventas registradas"
    for ciclo in range(posventas + 1):
        salida += mostrar_venta(ventas_local[ciclo]) + "\n"
    return salida


def agregar_stock(vproductos):
    info = mostrar_lista(vproductos)
    codigo = leer(info + "\nIntroduce el codigo del producto a modificar", 1)
    posicion = existe_producto(codigo, vproductos)
    if posicion > -1:
        cantidad = leer("\nIntroduce la cantidad de stock a agregar a " + mostrar_producto(vproductos[posicion]), 1)
        nueva_cantidad = int(cantidad) + int(vproductos[posicion][3])
        vproductos[posicion][3] = str(nueva_cantidad)
    else:
        print("No existe el codigo")


def menu_inventario(vproductos):
    datos_menu_inventario = ["1.-Listado", "2.-Agregar", "3.-Salida"]
    opcion = "0"
    while opcion != "3":
        opcion = desplegar_menu("Opciones de Inventarios", datos_menu_inventario)
        if opcion == "1":
            print(mostrar_lista(vproductos))
        elif opcion == "2":
            agregar_stock(vproductos)
        elif opcion == "3":
            print("Salida del Sistema")
        else:
            print("No existe esta opcion")


def obtener_ultimo_valor_ventas(ventas_local):
    ultima_posicion = obtener_ultima_posicion(ventas_local)
    ultimo_valor = "000"
    if ultima_posicion >= 0:
        ultimo_valor = ventas_local[ultima_posicion][0]
    return ultimo_valor


def menu_principal(vproductos, vventas):
    datos_menu_principal = ["1.-Productos", "2.-Punto de Venta", "3.-Inventario", "4.-Ventas", "5.-Salida"]
    opcion = "0"
    while opcion != "5":
        idticket = obtener_ultimo_valor_ventas(vventas)
        opcion = desplegar_menu("Menu de Punto de Venta Cafeteria Aroma", datos_menu_principal)
        if opcion == "1":
            menu_productos(vproductos)
        elif opcion == "2":
            menu_punto_venta(vventas, idticket, vproductos)
        elif opcion == "3":
            menu_inventario(vproductos)
        elif opcion == "4":
            print(mostrar_lista_ventas(vventas))
        elif opcion == "5":
            print("Salida del Sistema")
        else:
            print("No existe esta opcion")


def main():
    global productos, ventas
    productos = cargar_productos()
    ventas = crear_venta()
    menu_principal(productos, ventas)


if __name__ == "__main__":
    main()
