Algoritmo a2241330016_Ejercicio1
	
	Definir ciclo, divisor, dividendo, residuo Como Entero
	
	ciclo = 0
	
	Escribir "Introduce el valor del divisor:"
	Leer divisor
	
	Escribir "Introduce el valor del dividendo:"
	Leer dividendo
	
	residuo <- dividendo
	
	Mientras residuo >= divisor Hacer
		residuo <- residuo - divisor
		ciclo <- ciclo + 1
	FinMientras
	
	Escribir "El cociente = ", ciclo
	Escribir "El residuo = ", residuo
	
FinAlgoritmo

