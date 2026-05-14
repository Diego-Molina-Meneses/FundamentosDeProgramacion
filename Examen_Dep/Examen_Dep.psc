Algoritmo Sistema_de_calificaciones_Matricial
	
	Definir n, filas, columnas Como Entero
	Definir nombres Como Cadena
	Definir calificaciones Como Entero
	Definir datoNumero, datoCalif Como Cadena
	Definir calificacion Como Entero
	
	Repetir
		
		Escribir "Ingresa el numero de alumnos: " Sin Saltar
		Leer datoNumero
		
		Si No EsNumeroEntero(datoNumero) Entonces
			Escribir "Error: solo se permiten numeros enteros."
			n <- 0
		SiNo
			n <- ConvertirANumero(datoNumero)
			
			Si n <= 0 Entonces
				Escribir "Error: el numero de alumnos debe ser mayor que 0."
			FinSi
		FinSi
		
	Hasta Que EsNumeroEntero(datoNumero) Y n > 0
	
	Dimension nombres[n + 1]
	Dimension calificaciones[n + 1, 3]
	
	Para filas <- 1 Hasta n Con Paso 1 Hacer
		
		Escribir ""
		Escribir "Alumno ", filas
		
		Repetir
			Escribir "Ingresa el nombre del alumno: " Sin Saltar
			Leer nombres[filas]
			
			Si EstaVacia(nombres[filas]) Entonces
				Escribir "Error: el nombre no puede estar vacio."
			FinSi
			
		Hasta Que No EstaVacia(nombres[filas])
		
		Para columnas <- 1 Hasta 2 Con Paso 1 Hacer
			
			Repetir
				
				Escribir "Ingresa la calificacion de la asignatura ", columnas, ": " Sin Saltar
				Leer datoCalif
				
				Si No EsNumeroEntero(datoCalif) Entonces
					Escribir "Error: solo se permiten numeros enteros."
					calificacion <- 0
				SiNo
					calificacion <- ConvertirANumero(datoCalif)
					
					Si No CalificacionValida(calificacion) Entonces
						Escribir "Error: la calificacion debe estar entre 1 y 100."
					SiNo
						calificaciones[filas, columnas] <- calificacion
					FinSi
				FinSi
				
			Hasta Que EsNumeroEntero(datoCalif) Y CalificacionValida(calificacion)
			
		FinPara
		
	FinPara
	
	MostrarResultados(nombres, calificaciones, n)
	
FinAlgoritmo


Funcion vacio <- EstaVacia(texto)
	
	Definir vacio Como Logico
	
	Si Longitud(texto) = 0 Entonces
		vacio <- Verdadero
	SiNo
		vacio <- Falso
	FinSi
	
FinFuncion


Funcion valido <- EsNumeroEntero(texto)
	
	Definir valido Como Logico
	Definir i Como Entero
	Definir caracter Como Cadena
	
	valido <- Verdadero
	
	Si Longitud(texto) = 0 Entonces
		valido <- Falso
	SiNo
		
		Para i <- 0 Hasta Longitud(texto) - 1 Con Paso 1 Hacer
			
			caracter <- Subcadena(texto, i, i)
			
			Si caracter < "0" O caracter > "9" Entonces
				valido <- Falso
			FinSi
			
		FinPara
		
	FinSi
	
FinFuncion


Funcion valido <- CalificacionValida(calificacion)
	
	Definir valido Como Logico
	
	Si calificacion >= 1 Y calificacion <= 100 Entonces
		valido <- Verdadero
	SiNo
		valido <- Falso
	FinSi
	
FinFuncion


Funcion prom <- PromedioAlumno(calificaciones, fila)
	
	Definir prom Como Real
	Definir suma Como Entero
	
	suma <- calificaciones[fila, 1] + calificaciones[fila, 2]
	prom <- suma / 2
	
FinFuncion


Funcion prom <- PromedioGeneral(calificaciones, n)
	
	Definir prom Como Real
	Definir suma, filas, columnas Como Entero
	
	suma <- 0
	
	Para filas <- 1 Hasta n Con Paso 1 Hacer
		Para columnas <- 1 Hasta 2 Con Paso 1 Hacer
			suma <- suma + calificaciones[filas, columnas]
		FinPara
	FinPara
	
	prom <- suma / (n * 2)
	
FinFuncion


Funcion prom <- PromedioAsignatura(calificaciones, n, asignatura)
	
	Definir prom Como Real
	Definir suma, filas Como Entero
	
	suma <- 0
	
	Para filas <- 1 Hasta n Con Paso 1 Hacer
		suma <- suma + calificaciones[filas, asignatura]
	FinPara
	
	prom <- suma / n
	
FinFuncion


SubProceso MostrarResultados(nombres, calificaciones, n)
	
	Definir filas Como Entero
	Definir promedio Como Real
	
	Escribir ""
	Escribir "========== RESULTADOS =========="
	Escribir "Alumno      Asignatura 1      Asignatura 2      Promedio"
	
	Para filas <- 1 Hasta n Con Paso 1 Hacer
		
		promedio <- PromedioAlumno(calificaciones, filas)
		
		Escribir nombres[filas], "            ", calificaciones[filas, 1], "               ", calificaciones[filas, 2], "               ", promedio
		
	FinPara
	
	Escribir ""
	Escribir "Promedio general del grupo: ", PromedioGeneral(calificaciones, n)
	Escribir "Promedio de asignatura 1: ", PromedioAsignatura(calificaciones, n, 1)
	Escribir "Promedio de asignatura 2: ", PromedioAsignatura(calificaciones, n, 2)
	
FinSubProceso