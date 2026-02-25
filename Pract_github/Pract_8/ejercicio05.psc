Algoritmo  ejercicio05
    Definir producto1, producto2 Como Cadena
    Definir precio1, precio2, iva1, iva2, subtotal1, subtotal2, total1, total2 Como Real
    Definir opc, cant1, cant2 Como Entero
	
    producto1 <- "coca cola light lata 400 mil"
    producto2 <- "coca cola lata 400 mil"
    precio1 <- 16
    precio2 <- 15
	
    Escribir "Menu de Opciones"
    Escribir "1.- Productos"
    Escribir "2.- Punto de venta"
    Escribir "Que opcion deseas: "
    Leer opc
	
    Segun opc Hacer
        1:
            Escribir "elegiste la opcion de productos"
            Escribir "el ", producto1, " cuesta ", precio1
            Escribir "el ", producto2, " cuesta ", precio2
			
        2:
            Escribir "Introduzca la cantidad comprada de ", producto1, ": "
            Leer cant1
            Escribir "Introduzca la cantidad comprada de ", producto2, ": "
            Leer cant2
			
            subtotal1 <- cant1 * precio1
            iva1 <- subtotal1 * 0.16
            total1 <- iva1 + subtotal1
			
            Escribir cant1, " ", producto1
            Escribir "subtotal fue ", subtotal1, " iva fue ", iva1, " total fue ", total1
			
            subtotal2 <- cant2 * precio2
            iva2 <- subtotal2 * 0.16
            total2 <- iva2 + subtotal2
			
            Escribir cant2, " ", producto2
            Escribir "subtotal fue ", subtotal2, " iva fue ", iva2, " total fue ", total2
			
            Escribir "el total de la venta fue"
            Escribir "subtotal fue ", (subtotal1 + subtotal2)
            Escribir "el total de iva fue ", (iva1 + iva2)
            Escribir "Total fue ", (total1 + total2)
			
        De Otro Modo:
            Escribir "eleccion incorrecta"
    FinSegun
FinProceso
