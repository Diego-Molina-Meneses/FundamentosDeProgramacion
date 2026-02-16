Algoritmo Ejercicio4_Facturas
	Definir i, codigo, facturasMas600 Como Entero
	Definir litros, precio, importe, facturacionTotal, litrosArticulo1 Como Real
	facturacionTotal <- 0
	litrosArticulo1 <- 0
	facturasMas600 <- 0
	Para i<-1 Hasta 5 Hacer
		Escribir 'FACTURA ', i
		Escribir 'Codigo del articulo: '
		Leer codigo
		Escribir 'Cantidad vendida en litros: '
		Leer litros
		Escribir 'Precio por litro: '
		Leer precio
		importe <- litros*precio
		facturacionTotal <- facturacionTotal+importe
		Si codigo==1 Entonces
			litrosArticulo1 <- litrosArticulo1+litros
		SiNo
			Si importe>=600 Entonces
				facturasMas600 <- facturasMas600+1
			FinSi
		FinSi
	FinPara
	Escribir 'Facturacion total: $', facturacionTotal
	Escribir 'Litros vendidos del articulo 1: ', litrosArticulo1
	Escribir 'Facturas de mas de $600: ', facturasMas600
FinAlgoritmo
