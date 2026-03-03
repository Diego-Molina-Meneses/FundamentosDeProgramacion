Algoritmo SueldosMayores1000
	Definir sueldo, suma, mayor_1000 Como Entero
	Definir i Como Entero
	
	suma <- 0
	mayor_1000 <- 0
	
	Para i <- 1 Hasta 10 Hacer
		Escribir "Escribe un sueldo: "
		Leer sueldo
		
		suma <- suma + sueldo
		
		Si sueldo > 1000 Entonces
			mayor_1000 <- mayor_1000 + 1
		FinSi
	FinPara
	
	Escribir "Mayores de 1000 hay: ", mayor_1000
	Escribir "La suma es: ", suma
	
FinAlgoritmo
