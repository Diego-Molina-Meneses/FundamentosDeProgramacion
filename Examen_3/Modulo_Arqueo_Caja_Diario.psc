Algoritmo Modulo_Arqueo_Caja_Diario
	Definir opc Como Entero
	Definir fondoInicial, totalVentas, totalGastos, efectivoReal Como Real
	
	fondoInicial <- 0
	totalVentas <- 0
	totalGastos <- 0
	efectivoReal <- 0
	
	Repetir
		opc <- MostrarMenu()
		
		Segun opc Hacer
			1:
				fondoInicial <- LeerNumeroValidado("Ingrese el fondo de caja inicial: ")
			2:
				totalVentas <- RegistrarMovimientos("ventas")
			3:
				totalGastos <- RegistrarMovimientos("gastos")
			4:
				efectivoReal <- LeerNumeroValidado("Ingrese el efectivo real en cajon: ")
				CalcularCorte(fondoInicial, totalVentas, totalGastos, efectivoReal)
			5:
				Escribir "Saliendo del sistema..."
			De Otro Modo:
				Escribir "Opcion invalida. Intente de nuevo."
		FinSegun
		
		Escribir ""
	Hasta Que opc = 5
FinAlgoritmo


Funcion opc <- MostrarMenu
	Definir texto Como Cadena
	Definir opc Como entero 
	
	Escribir "=== SISTEMA DE ARQUEO DE CAJA ==="
	Escribir "1. Ingresar Fondo de Caja Inicial"
	Escribir "2. Registrar Ventas del Turno"
	Escribir "3. Registrar Gastos / Retiros"
	Escribir "4. Realizar Corte de Caja"
	Escribir "5. Salir"
	
	Repetir
		Escribir "Seleccione una opcion: "
		Leer texto
		
		Si ValidarEntero(texto) Entonces
			opc <- ConvertirANumero(texto)
		SiNo
			Escribir "Error: debe capturar un numero entero."
		FinSi
	Hasta Que ValidarEntero(texto)
FinFuncion


Funcion valido <- ValidarNumero(texto)
	Definir valido Como Logico
	Definir i, puntos Como Entero
	Definir caracter Como Cadena
	
	valido <- Verdadero
	puntos <- 0
	
	Si Longitud(texto) = 0 Entonces
		valido <- Falso
	SiNo
		Para i <- 0 Hasta Longitud(texto) - 1 Hacer
			caracter <- Subcadena(texto, i, i)
			
			Si caracter = "." Entonces
				puntos <- puntos + 1
				Si puntos > 1 Entonces
					valido <- Falso
				FinSi
			SiNo
				Si caracter < "0" O caracter > "9" Entonces
					valido <- Falso
				FinSi
			FinSi
		FinPara
	FinSi
FinFuncion


Funcion valido <- ValidarEntero(texto)
	Definir valido Como Logico
	Definir i Como Entero
	Definir caracter Como Cadena
	
	valido <- Verdadero
	
	Si Longitud(texto) = 0 Entonces
		valido <- Falso
	SiNo
		Para i <- 0 Hasta Longitud(texto) - 1 Hacer
			caracter <- Subcadena(texto, i, i)
			
			Si caracter < "0" O caracter > "9" Entonces
				valido <- Falso
			FinSi
		FinPara
	FinSi
FinFuncion


Funcion nume <- LeerNumeroValidado(mensaje)
	Definir texto Como Cadena
	Definir nume Como Entero
	
	Repetir
		Escribir mensaje
		Leer texto
		
		Si ValidarNumero(texto) Entonces
			nume <- ConvertirANumero(texto)
		SiNo
			Escribir "Entrada invalida. Solo se permiten numeros."
		FinSi
	Hasta Que ValidarNumero(texto)
FinFuncion


Funcion total <- RegistrarMovimientos(tipo)
	Definir textoCantidad Como Cadena
	Definir cantidad, i Como Entero
	Definir monto, total Como Real
	
	total <- 0
	cantidad <- -1
	
	Repetir
		Escribir "Cuantos movimientos de ", tipo, " desea registrar?: "
		Leer textoCantidad
		
		Si ValidarEntero(textoCantidad) Entonces
			cantidad <- ConvertirANumero(textoCantidad)
			
			Si cantidad < 0 Entonces
				Escribir "La cantidad no puede ser negativa."
			FinSi
		SiNo
			Escribir "Error: capture una cantidad valida."
		FinSi
	Hasta Que ValidarEntero(textoCantidad) Y cantidad >= 0
	
	Para i <- 1 Hasta cantidad Hacer
		Escribir "Movimiento ", i
		monto <- LeerNumeroValidado("Ingrese el monto: ")
		total <- total + monto
	FinPara
FinFuncion


SubProceso CalcularCorte(fondoInicial, totalVentas, totalGastos, efectivoReal)
	Definir esperado, diferencia, faltante Como Real
	
	esperado <- fondoInicial + totalVentas - totalGastos
	diferencia <- efectivoReal - esperado
	faltante <- Abs(diferencia)
	
	Escribir "===== RESULTADO DEL CORTE ====="
	Escribir "Fondo inicial: ", fondoInicial
	Escribir "Total ventas: ", totalVentas
	Escribir "Total gastos: ", totalGastos
	Escribir "Efectivo esperado: ", esperado
	Escribir "Efectivo real: ", efectivoReal
	
	Si diferencia = 0 Entonces
		Escribir "El corte esta CUADRADO."
	SiNo
		Si diferencia > 0 Entonces
			Escribir "Hay un SOBRANTE de: ", diferencia
		SiNo
			Escribir "Hay un FALTANTE de: ", faltante
		FinSi
	FinSi
FinSubProceso