Algoritmo Ejercicio1
	
	Definir numero, resultado, contador Como Entero
	
	resultado <- 1
	
	Escribir "Ingrese el número del cual se desea obtener su factorial"
	Leer numero
	
	Para contador <- 1 Hasta numero Hacer
		
		resultado <- contador * resultado
		
	FinPara
	
	Escribir "El factorial del número ingresado es:"
	Escribir resultado
	
FinAlgoritmo
