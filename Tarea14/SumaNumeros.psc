Algoritmo SumaNumeros
	Definir num, suma Como Entero
	
	suma <- 0
	
	Escribir "Introduce un numero: "
	Leer num
	
	Mientras num <> 0 Hacer
		
		suma <- suma + num
		
		Escribir "Introduce otro numero: "
		Leer num
		
	FinMientras
	
	Escribir "La suma de todos los numeros es: ", suma
FinAlgoritmo
