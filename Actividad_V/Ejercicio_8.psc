Algoritmo Ejercicio_8
	
	Definir serie, contador Como Entero
	
	serie <- 0
	contador <- 0
	
	Escribir "A continuación, se imprime una serie de números, aumentando +3 y +2 consecutivamente."
	
	Mientras serie < 1800 Hacer
		
		serie <- serie + 2
		contador <- contador + serie
		Escribir serie
		
		serie <- serie + 3
		contador <- contador + serie
		Escribir serie
		
	FinMientras
	
	Escribir "La suma de la serie es:"
	Escribir contador
	
FinAlgoritmo
