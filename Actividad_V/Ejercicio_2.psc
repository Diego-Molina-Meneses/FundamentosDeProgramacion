Algoritmo Ejercicio_2
	
	Definir gasto, total Como Real
	
	total <- 0
	
	Escribir "Ingresa el gasto:"
	Leer gasto
	
	Si gasto = 0 Entonces
		Escribir "No hubo gastos"
	FinSi
	
	Mientras gasto <> 0 Hacer
		
		total <- total + gasto
		
		Escribir "El total es:"
		Escribir total
		
		Escribir "¿Hay más gastos? Ingresa la cantidad:"
		Leer gasto
		
		Si gasto = 0 Entonces
			Escribir "Ya no hay gastos"
		FinSi
		
	FinMientras
	
	Escribir "El total es: ", total
	
FinAlgoritmo
