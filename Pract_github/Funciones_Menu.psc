Algoritmo Funciones_Menu
	Definir text Como Cadena
	Definir opciones Como Cadena
	Definir respuesta, dato Como Cadena
	Definir matriz Como Cadena
	Definir ultima Como Entero
	
	Dimension opciones[5]
	Dimension matriz[5,2]
	
	opciones[0] <- "Alta"
	opciones[1] <- "Baja"
	opciones[2] <- "Consulta"
	opciones[3] <- "Modificar"
	opciones[4] <- "Salir"
	
	respuesta <- DesplegarMenu("MENU PRINCIPAL", opciones)
	Escribir "Opcion elegida: ", respuesta
	
	dato <- LeerCadena("Escribe un numero entero")
	Escribir "Dato leido: ", dato
	Escribir "Es entero: ", EsNumeroEntero(dato)
	Escribir "Es double: ", EsNumeroDouble(dato)
	Escribir "Evaluar numerico tipo 1: ", EvaluarNumerico(dato, 1)
	Escribir "Evaluar numerico tipo 2: ", EvaluarNumerico(dato, 2)
	
	text <- RellenarEspacios("Hola", 10)
	Escribir "Texto rellenado: ", text
	
	matriz[0,1] <- "Juan"
	matriz[1,1] <- "Maria"
	matriz[2,1] <- "Lucia"
	matriz[3,1] <- "Pedro"
	matriz[4,1] <- "Luis"
	
	ultima <- ObtenerUltimaPosicion(matriz)
	Escribir "Ultima posicion ocupada: ", ultima
	
FinAlgoritmo


Funcion cadena <- Dialogo(texto)
	Definir cadena Como Cadena
	Escribir Sin Saltar texto, ": "
	Leer cadena
FinFuncion


Funcion cadena <- MostrarMenu(opciones Por Referencia)
	Definir cadena Como Cadena
	Definir i Como Entero
	
	cadena <- ""
	i <- 0
	
	Mientras i < 5 Hacer
		cadena <- cadena + ConvertirATexto(i + 1) + ". " + opciones[i] + " "
		i <- i + 1
	FinMientras
FinFuncion


Funcion respuesta <- DesplegarMenu(titulo1, menu Por Referencia)
	Definir respuesta Como Cadena
	Definir i Como Entero
	
	Escribir titulo1
	Escribir ""
	
	Para i <- 0 Hasta 4 Hacer
		Escribir i + 1, ". ", menu[i]
	FinPara
	
	Escribir ""
	Escribir Sin Saltar "Elija una opcion: "
	Leer respuesta
FinFuncion


Funcion cadena <- LeerCadena(texto)
	Definir cadena Como Cadena
	cadena <- Dialogo(texto)
FinFuncion


Funcion valido <- EsNumeroEntero(dato)
	Definir valido Como Logico
	Definir i Como Entero
	Definir c Como Cadena
	
	Si dato = "" Entonces
		valido <- Falso
	SiNo
		valido <- Verdadero
		
		Para i <- 0 Hasta Longitud(dato) - 1 Hacer
			c <- Subcadena(dato, i, i)
			
			Si No (c >= "0" Y c <= "9") Entonces
				valido <- Falso
			FinSi
		FinPara
	FinSi
FinFuncion


Funcion valido <- EsNumeroDouble(dato)
	Definir valido, punto Como Logico
	Definir i Como Entero
	Definir c Como Cadena
	Si dato = "" Entonces
		valido <- Falso
	SiNo
		valido <- Verdadero
		punto <- Falso
		Para i <- 0 Hasta Longitud(dato) - 1 Hacer
			c <- Subcadena(dato, i, i)
			
			Si c = "." Entonces
				Si punto = Falso Entonces
					punto <- Verdadero
				SiNo
					valido <- Falso
				FinSi
			SiNo
				Si No (c >= "0" Y c <= "9") Entonces
					valido <- Falso
				FinSi
			FinSi
		FinPara
		Si punto = Falso Entonces
			valido <- Falso
		FinSi
	FinSi
FinFuncion


Funcion valida <- EvaluarNumerico(dato, tipo)
	Definir valida Como Logico
	
	valida <- Falso
	
	Segun tipo Hacer
		1:
			Si EsNumeroEntero(dato) Entonces
				valida <- Verdadero
			FinSi
		2:
			Si EsNumeroDouble(dato) Entonces
				valida <- Verdadero
			FinSi
	FinSegun
FinFuncion


Funcion cadena <- RellenarEspacios(dato, tamano)
	Definir cadena Como Cadena
	Definir i Como Entero
	
	cadena <- dato
	
	Para i <- Longitud(dato) + 1 Hasta tamano Hacer
		cadena <- cadena + " "
	FinPara
FinFuncion


Funcion ultimaPosicion <- ObtenerUltimaPosicion(matriz Por Referencia)
	Definir ultimaPosicion, i Como Entero
	
	ultimaPosicion <- -1
	
	Para i <- 0 Hasta 4 Hacer
		Si matriz[i,1] <> "" Entonces
			ultimaPosicion <- i
		FinSi
	FinPara
FinFuncion